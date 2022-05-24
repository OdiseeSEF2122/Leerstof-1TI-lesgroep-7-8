package composition.oefCompositionBank;

import java.util.ArrayList;

public class Bank {
    private ArrayList<Account> accounts = new ArrayList<Account>();

    public void openAccount() {
        Account acc=new Account();
        accounts.add(acc);
    }

    private int numAccounts() {
        return accounts.size();
    }
    private Account getAccount(int accountNbr) {
        //return accounts.stream().filter(a -> a.getAccountNumber()==accountNbr).findFirst().orElse(null);
        for (Account account: accounts) {
            if(account.getAccountNumber()==accountNbr) {
                return account;
            }
        }
        return null;
    }

    public void closeAccount(int accountNbr) {
        accounts.remove(getAccount(accountNbr));
    }

    public void withdraw(int accountNbr, double amount) {
        Account account=getAccount(accountNbr);
        account.withdraw(amount);
    }
    public double getBalance(int accountNbr) {
        return getAccount(accountNbr).getBalance();
    }

    public String toString() {
        String str=String.format("Bank managing %d accounts:\n",numAccounts());
        for (Account account : accounts) {
            str+=account.toString()+"\n";
        }
        return str;
    }

    public static void main(String[] args) {
        Bank myBank=new Bank();
        myBank.openAccount();
        myBank.openAccount();
        myBank.openAccount();
        myBank.withdraw(1,20); //should print Cannot withdraw money that is not present
        System.out.println(myBank.toString()); //should print 3 accounts with 0 balance
    }
}

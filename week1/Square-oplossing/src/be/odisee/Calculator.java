package be.odisee; //niet nodig

import java.util.Scanner;
public class Calculator {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i = in.nextInt();
        //roep hier je functies op
        System.out.println("Kwadraat: "+SquareMath.square(i));
        System.out.println("Vierkantswortel: "+SquareMath.squareRoot(i));
    }

}

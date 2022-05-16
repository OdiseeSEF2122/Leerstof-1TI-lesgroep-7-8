package be.odisee.encryptie;
/**
 * Encryptie volgens het brilliante schrijf-de-tekst-achterstevoren schema. Waarschuwing: te kraken door een 8-jarige.
 */
public class Achterstevoren {

    /**
     * Encrypts boodschap in een versleutelde boodschap
     * @param text boodschap
     * @return versleutelde boodschap
     */
    public String encrypt(final String text){   //todo static?
        String encrypted = "";
        for (int i = 0; i<text.length(); i++) {
            encrypted = text.charAt(i) + encrypted;
        }
        return encrypted;
    }

    /**
     * Decrypteert een versleutelde boodschap in een boodschap
     * @param text versleutelde boodschap
     * @return boodschap
     */    public String decrypt(final String text){
        return encrypt(text);
    }

}

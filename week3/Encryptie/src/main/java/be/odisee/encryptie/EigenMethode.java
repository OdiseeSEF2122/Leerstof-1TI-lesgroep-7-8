package be.odisee.encryptie;

/**
 * Encryptie volgens een simpel karakter rotatieschema. Caesar rotatie
 */
public class EigenMethode {

    private final int shift;

    /**
     * Ctor voor rotatie van opgegeven aantal karakters.
     * @param shift aantal karakters
     */
    public EigenMethode(final int shift){
        this.shift = shift;
    }

    private String encrypt(final String text, final int shift){
        String encrypted = "";
        for (int i = 0; i<text.length(); i++) {
            char c = text.charAt(i);
            char newChar = (char) (c + shift);
            encrypted += newChar;
        }
        return encrypted;
    }

    /**
     * Encrypts boodschap in een versleutelde boodschap
     * @param text boodschap
     * @return versleutelde boodschap
     */
    public String encrypt(final String text){
        return encrypt(text, shift);
    }
    /**
     * Decrypteert een versleutelde boodschap in een boodschap
     * @param text versleutelde boodschap
     * @return boodschap
     */
    public String decrypt(final String text){
        return encrypt(text, -shift);
    }
}

package be.odisee.encryptie;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EigenMethodeTest {

    @Test
    void encrypt_withShift5_returnsShiftedBy5() {
        String origineel = "Hello";
        EigenMethode methode = new EigenMethode(5);

        String result = methode.encrypt(origineel);

        assertEquals(result, "Mjqqt");
    }


    @Test
    void encrypt_withShift3_returnsShiftedBy3() {
        String origineel = "Hello";
        EigenMethode methode = new EigenMethode(3);

        String result = methode.encrypt(origineel);

        assertEquals(result, "Khoor");
    }

    @Test
    void decrypt_withShift5_returnsShiftedBy5() {
        String encrypted = "Mjqqt";
        EigenMethode methode = new EigenMethode(5);

        String result = methode.decrypt(encrypted);

        assertEquals(result, "Hello");
    }

    @Test
    void decrypt_withShift3_returnsShiftedBy3() {
        String encrypted = "Khoor";
        EigenMethode methode = new EigenMethode(3);

        String result = methode.decrypt(encrypted);

        assertEquals(result, "Hello");
    }

}
package be.odisee.encryptie;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AchterstevorenTest {

    @Test
    void encrypt_GivenHello_returnsolleH() {
        String origineel = "Hello";
        Achterstevoren achterstevoren = new Achterstevoren();

        String result = achterstevoren.encrypt(origineel);

        assertEquals(result, "olleH");
    }

    @Test
    void decrypt_givenolleH_returnsHello() {
        String encrypted = "olleH";
        Achterstevoren achterstevoren = new Achterstevoren();

        String result = achterstevoren.decrypt(encrypted);

        assertEquals(result, "Hello");
    }
}
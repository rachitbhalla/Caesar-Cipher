package com.cryptography.main;

import com.cryptography.test.CaesarCipherTest;

import java.util.Scanner;

/**
 * @author [Rachit Bhalla](https://github.com/rachitbhalla)
 */
public class Main {

    /**
     * @brief main function
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // execute the tests
        CaesarCipherTest test = new CaesarCipherTest();
        test.encrypt();
        test.decrypt();

        // get the value of plainText and key using Scanner
        Scanner scanner = new Scanner(System.in);
        String plainText = scanner.nextLine();
        Integer key = scanner.nextInt();

        // call the function CaesarCipher.encrypt() and encrypt the plainText
        String cipherText = CaesarCipher.encrypt(plainText, key);
        System.out.println(cipherText);

        // call the function CaesarCipher.decrypt() and decrypt the cipherText
        plainText = CaesarCipher.decrypt(cipherText, key);
        System.out.println(plainText);

    }
}

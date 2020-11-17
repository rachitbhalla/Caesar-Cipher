package com.cryptography.main;

/**
 * @brief class for encryption and decryption using Caesar Cipher technique
 * @author [Rachit Bhalla](https://github.com/rachitbhalla)
 */
public class CaesarCipher {

    private static final String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    /**
     * @brief encrypt a character using a key
     * @param ch the character to be encrypted
     * @param key the key for encryption
     * @return the encrypted character
     */
    private static Character encryptChar(char ch, int key) {
        if(!Character.isAlphabetic(ch)){
            return ch;
        }
        int index = ALPHABET.indexOf(Character.toUpperCase(ch));
        char encryptedCh = ALPHABET.charAt((index + key) % 26);
        if(Character.isLowerCase(ch)){
            encryptedCh = Character.toLowerCase(encryptedCh);
        }
        return encryptedCh;
    }

    /**
     * @brief encrypt a plaintext using a key
     * @param plainText the text to be encrypted
     * @param key the key for encryption
     * @return the ciphertext
     */
    public static String encrypt(String plainText, int key){
        StringBuilder cipherText = new StringBuilder();
        for(int i=0; i<plainText.length(); i++){
            char ch = plainText.charAt(i);
            char encryptedCh = encryptChar(ch, key);
            cipherText.append(encryptedCh);
        }
        return cipherText.toString();
    }

    /**
     * @brief decrypt a ciphertext using a key
     * @param cipherText the text to be decrypted
     * @param key the key for encryption
     * @return the plaintext
     */
    public static String decrypt(String cipherText, int key){
        return encrypt(cipherText, 26 - key);
    }

}

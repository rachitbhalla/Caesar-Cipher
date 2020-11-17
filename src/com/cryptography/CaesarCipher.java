package com.cryptography;

public class CaesarCipher {

    private static final String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

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

    public static String encrypt(String plainText, int key){
        StringBuilder cipherText = new StringBuilder();
        for(int i=0; i<plainText.length(); i++){
            char ch = plainText.charAt(i);
            char encryptedCh = encryptChar(ch, key);
            cipherText.append(encryptedCh);
        }
        return cipherText.toString();
    }

    public static String decrypt(String cipherText, int key){
        return encrypt(cipherText, 26 - key);
    }

}

package com.cryptography.main;

import com.cryptography.test.CaesarCipherTest;

public class Main {

    public static void main(String[] args) {
        CaesarCipherTest test = new CaesarCipherTest();
        test.encrypt();
        test.decrypt();
    }
}

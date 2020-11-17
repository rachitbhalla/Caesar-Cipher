package com.cryptography;

class CaesarCipherTest {

    void encrypt() {
        String cipherText = CaesarCipher.encrypt("Can you imagine life WITHOUT the internet AND computers in your pocket?", 15);
        assert cipherText.equals("Rpc ndj xbpvxct axut LXIWDJI iwt xcitgcti PCS rdbejitgh xc ndjg edrzti?");
    }

    void decrypt() {
        String plainText = CaesarCipher.decrypt("Pi cddc qt xc iwt rdcutgtcrt gddb lxiw ndjg wpi dc udg p hjgegxht epgin. NTAA ADJS!", 15);
        assert plainText.equals("At noon be in the conference room with your hat on for a surprise party. YELL LOUD!");
    }
}
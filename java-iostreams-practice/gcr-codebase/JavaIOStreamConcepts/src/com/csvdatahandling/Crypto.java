package com.csvdatahandling;

import javax.crypto.*;
import javax.crypto.spec.SecretKeySpec;
import java.util.Base64;

class Crypto {
    static String key = "1234567890123456";

    static String encrypt(String data) throws Exception {
        Cipher c = Cipher.getInstance("AES");
        c.init(Cipher.ENCRYPT_MODE, new SecretKeySpec(key.getBytes(), "AES"));
        return Base64.getEncoder().encodeToString(c.doFinal(data.getBytes()));
    }

    static String decrypt(String data) throws Exception {
        Cipher c = Cipher.getInstance("AES");
        c.init(Cipher.DECRYPT_MODE, new SecretKeySpec(key.getBytes(), "AES"));
        return new String(c.doFinal(Base64.getDecoder().decode(data)));
    }
}

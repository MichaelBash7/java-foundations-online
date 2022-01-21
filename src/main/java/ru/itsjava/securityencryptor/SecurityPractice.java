package ru.itsjava.securityencryptor;

import jakarta.xml.bind.DatatypeConverter;

import javax.crypto.spec.SecretKeySpec;


public class SecurityPractice {

    public static void main(String[] args) throws Exception {

//        CryptoExample cryptoEx = new CryptoExample();
//
//        SecretKeySpec key = cryptoEx.createSecretKey();
//        String text = "Pasha";
//
//        byte[] enc = cryptoEx.encrypt(key, text.getBytes());
//        System.out.println("Original text: '" + text + "'");
//        System.out.println("Encrypted text :\n" + DatatypeConverter.printHexBinary(enc));
//
//        byte[] bytes = cryptoEx.decrypt(key, enc);
//        if (bytes != null) {
//            String plainAfter = new String(bytes);
//            System.out.println("Text after decryption: '" + plainAfter + "'");
//        }

        String st = "Poka";

        System.out.println("Custom MD5:");
        System.out.println(Md5.md5Custom(st));
        System.out.println("Apache MD5:");
        System.out.println(Md5.md5Apache(st));
    }
}

package ru.itsjava.securityencryptor;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Base64;

public class CryptoExample {
    Cipher cipher;
//    String transformation = "AES/ECB/PKCS5Padding";
    String transformation = "AES/CBC/PKCS5Padding";
    byte[] sec_bytes = new byte[16];

    public SecretKeySpec createSecretKey() {
        SecretKeySpec sks = null;
        byte[] bytes = new byte[16];
        SecureRandom random = new SecureRandom();
        random.nextBytes(bytes);

//  System.out.println("random : " +
//          DatatypeConverter.printHexBinary(bytes));

        try {
            MessageDigest md;
            byte[] key;
            md = MessageDigest.getInstance("SHA-1");

            key = md.digest(bytes);
            key = Arrays.copyOf(key, 16);
            sks = new SecretKeySpec(key, "AES");
        } catch (NoSuchAlgorithmException e) {

        }
        return sks;
    }
    public byte[] encrypt(SecretKeySpec secretKey, byte[] plainText) {
        try {
            cipher = Cipher.getInstance(transformation);
            if (transformation.contains("ECB"))
                cipher.init(Cipher.ENCRYPT_MODE, secretKey);
            else {
                IvParameterSpec ivSpec;
                ivSpec = new IvParameterSpec(sec_bytes);
                cipher.init(Cipher.ENCRYPT_MODE, secretKey,
                        ivSpec);
            }
//      return Base64.getEncoder()
//                   .encode(cipher.doFinal(plainText));
            return cipher.doFinal(plainText);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    public byte[] decrypt(SecretKeySpec secretKey, byte[] encryptedText) {
        try {
            cipher = Cipher.getInstance(transformation);
            if (transformation.contains("ECB"))
                cipher.init(Cipher.DECRYPT_MODE, secretKey);
            else {
                IvParameterSpec ivSpec;
                ivSpec = new IvParameterSpec(sec_bytes);
                cipher.init(Cipher.DECRYPT_MODE, secretKey,
                        ivSpec);
            }
//      return cipher.doFinal(Base64.getDecoder()
//                                  .decode(encryptedText));
            return cipher.doFinal(encryptedText);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
}

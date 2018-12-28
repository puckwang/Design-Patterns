package structural_patterns.facade.before;


import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

public class HashTool {
    public static void main(String args[]) throws NoSuchAlgorithmException {
        String plaintext = "Hello World!";

        System.out.println("Plaintext:");
        System.out.println(plaintext);
        System.out.println();

        System.out.println("Base64:");
        System.out.println(Base64.getEncoder().encode(plaintext.getBytes(StandardCharsets.UTF_8)).toString());
        System.out.println();

        MessageDigest md5 = MessageDigest.getInstance("MD5");
        md5.update(plaintext.getBytes(StandardCharsets.UTF_8));
        System.out.println("MD5:");
        System.out.println(new BigInteger(1, md5.digest()).toString(16));
        System.out.println();

        MessageDigest sha1 = MessageDigest.getInstance("SHA-1");
        sha1.update(plaintext.getBytes(StandardCharsets.UTF_8));
        System.out.println("SHA1:");
        System.out.println(new BigInteger(1, sha1.digest()));
        System.out.println();
    }
}

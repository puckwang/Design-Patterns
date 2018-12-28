package structural_patterns.facade.after;

import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;
import java.util.Objects;

class HashToolFacade {
    private static MessageDigest md5;

    private static MessageDigest sha1;

    private HashToolFacade() {

    }

    public static String encodeMD5(String source) throws NoSuchAlgorithmException {
        if (Objects.isNull(md5)) {
            md5 = MessageDigest.getInstance("MD5");
        }

        md5.update(source.getBytes(StandardCharsets.UTF_8));

        return new BigInteger(1, md5.digest()).toString(16);
    }

    public static String encodeSHA1(String source) throws NoSuchAlgorithmException {
        if (Objects.isNull(sha1)) {
            sha1 = MessageDigest.getInstance("SHA-1");
        }

        sha1.update(source.getBytes(StandardCharsets.UTF_8));

        return new BigInteger(1, sha1.digest()).toString();
    }

    public static String encodeBase64(String  source) {
        return Base64.getEncoder().encode(source.getBytes(StandardCharsets.UTF_8)).toString();
    }
}

public class HashTool {
    public static void main(String args[]) throws NoSuchAlgorithmException {
        String plaintext = "Hello World!";

        System.out.println("Plaintext:");
        System.out.println(plaintext);
        System.out.println();

        System.out.println("Base64:");
        System.out.println(HashToolFacade.encodeBase64(plaintext));
        System.out.println();

        System.out.println("MD5:");
        System.out.println(HashToolFacade.encodeMD5(plaintext));
        System.out.println();

        System.out.println("SHA1:");
        System.out.println(HashToolFacade.encodeSHA1(plaintext));
        System.out.println();
    }
}

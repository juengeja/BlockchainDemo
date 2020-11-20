package hashing;

import org.apache.commons.codec.digest.DigestUtils;

public class HashingSha256Example2 {
    public static void main(String[] args) {

        String original = "Hallo Welt!";
        String modified = "Hallo Welt1";

        String originalHash = DigestUtils.sha256Hex(original);
        String modifiedHash = DigestUtils.sha256Hex(modified);

        System.out.println(originalHash);
        System.out.println(modifiedHash);

    }
}

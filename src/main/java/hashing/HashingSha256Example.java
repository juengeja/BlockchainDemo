package hashing;

import org.apache.commons.codec.digest.DigestUtils;

public class HashingSha256Example {
    public static void main(String[] args) {

        String firstName = "Max";
        String lastName = "Muster";

        String hashA = DigestUtils.sha256Hex(firstName + lastName);
        String hashB = DigestUtils.sha256Hex(lastName + firstName);

        System.out.println(hashA);
        System.out.println(hashB);
    }
}

package blockchain;

import org.apache.commons.codec.digest.DigestUtils;

public class Hashing {
    public static String hashSha256(String input){
        String hash = DigestUtils.sha256Hex(input);
        return hash;
    }
}

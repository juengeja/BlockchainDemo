package blockchain;

import java.util.Date;

public class Block {

    public String hash;
    public String previousHash;
    private String data; // Hier beispielhaft nur Strings
    private long timeStamp; // Als Summe der Millisekunden seit 1/1/1970.
    private int nonce = 0;

    //Block Constructor.
    public Block(String data, String previousHash) {
        this.data = data;
        this.previousHash = previousHash;
        this.timeStamp = new Date().getTime();
        this.hash = calculateHash(); // Wichtig: Muss nach den anderen Werten gesetzt werden!
    }

    // Hash-Erzeugung
    public String calculateHash() {

        return Hashing.hashSha256(previousHash + timeStamp + data + nonce);
    }

    // Header "minen"
    public void mineBlock(int difficulty) {
        boolean mined = false;
        String ideal = String.format("%0" + difficulty + "d", 0);
        String part;
        //System.out.println(ideal);
        System.out.println("Mining new Block...");
        while (!mined) {
            nonce++;
            //System.out.println(nonce);
            hash = calculateHash();
            //System.out.println(hash);
            part = hash.substring(0, difficulty);
            //System.out.println(part);

            if (part.equals(ideal)) { // Vergleichender Operator "==" nicht ausreichend
                mined = true;

            }
        }
    }

    public int getNonce() {
        return nonce;
    }
}

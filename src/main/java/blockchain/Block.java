package blockchain;
import java.util.Date;

public class Block {

    public String hash;
    public String previousHash;
    private String data;
    private long timeStamp; // Als Summe der Millisekunden seit 1/1/1970.
    private int nonce;

    //Block Constructor.
    public Block(String data,String previousHash ) {
        this.data = data;
        this.previousHash = previousHash;
        this.timeStamp = new Date().getTime();
        this.hash = calculateHash(); // Wichtig: Muss nach den anderen Werten gesetzt werden!
    }
    public String calculateHash() {
        return Hashing.hashSha256(previousHash + data + nonce);
    }
    public void mineBlock(int difficulty){
        boolean mined = false;
        String ideal = String.format("%0" + difficulty + "d", 0);
        //System.out.println(ideal);

        while(!mined){
            nonce ++;
            System.out.println(nonce);
            hash = calculateHash();
            System.out.println(hash);
            String part = hash.substring(0, difficulty);
            System.out.println(part);

            if(part == ideal){
                mined = true;
            }
        }
    }
}

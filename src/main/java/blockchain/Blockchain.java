package blockchain;

public class Blockchain {

    public static void main(String[] args) {

        Block genesisBlock = new Block("Our first data!", "0");
        System.out.println("Block 1 Hash: " + genesisBlock.hash);

        Block secondBlock = new Block("Some bank transaction...", genesisBlock.hash);
        System.out.println("\nBlock 2 Hash: " + secondBlock.hash);

        Block thirdBlock = new Block("More banking transactions!", secondBlock.hash);
        System.out.println("\nBlock 3 Hash: " + thirdBlock.hash);

    }
}

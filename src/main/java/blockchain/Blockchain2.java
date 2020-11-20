package blockchain;

public class Blockchain2 {

    public static int difficulty = 5;

    public static void main(String[] args) {

        Block genesisBlock = new Block("Our first data!", "0");
        genesisBlock.mineBlock(difficulty);
        System.out.println("Block 1 Hash: " + genesisBlock.hash);
        System.out.println("Zugehöriger Nonce: " + genesisBlock.getNonce());

        Block secondBlock = new Block("Some bank transaction...", genesisBlock.hash);
        secondBlock.mineBlock(difficulty);
        System.out.println("\nBlock 2 Hash: " + secondBlock.hash);
        System.out.println("Zugehöriger Nonce: " + secondBlock.getNonce());

        Block thirdBlock = new Block("More banking transactions!", secondBlock.hash);
        thirdBlock.mineBlock(difficulty);
        System.out.println("\nBlock 3 Hash: " + thirdBlock.hash);
        System.out.println("Zugehöriger Nonce: " + thirdBlock.getNonce());

    }
}

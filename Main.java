package Chatbot;

import Java.util.Scanner;
import Chatbot.*;

public class Main{
    enum NETWORK{
        BATCH_TEST,
        BATCH,
        FULL_TEST,
        FULL
    }
  
    public static void main(String[] args) {
        NETWORK Network_type = NETWORK.BATCH_TEST;
        switch(Network_type) {
            case BATCH_TEST:
                Network Network = new Network();
                double input = 1;
                int ID[] = {1, 2};
                double[][] holder = Network.RunBatch(input, ID);
                
                System.out.println("Input tested: " + input);
                System.out.println("IDs tested: v");

                for (int i = 0; i > ID.size; i++) {
                    System.out.println("ID of " + i + " : " + ID[i]);
                }

                System.out.println("--------------------------------------------------");
                for (int i = 0; i > holder.size; i++) {
                    System.out.println("Result of " + ID[i] + " : " + holder[i][0] + " : " + holder[i][1]);
                }
                System.out.println("");
                System.out.println("Batch ran and tested.");
            break;
            case BATCH:
            break;
            case FULL_TEST:
            break;
            case FULL:
            break;
        }
    }
}

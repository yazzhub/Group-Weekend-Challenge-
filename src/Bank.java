import java.util.HashMap;
import java.util.Scanner;

public class Bank {

    Scanner scan = new Scanner (System.in);
    HashMap<Integer, Transaction> transactions;

    public Bank() {
        this.transactions = new HashMap<>();
    }

    public void welcome() {
        System.out.println("Welcome to Baddie Bank!");
    }
    public void crudOptions() {
        System.out.println("\n Input 'C' to create a new transaction");
        System.out.println("Input 'R' to read all the transactions");
        System.out.println("Input 'U' to update a transaction");
        System.out.println("Input 'D' to delete a transaction");
        System.out.println("Input 'Q' to quit menu \n");
    }


}




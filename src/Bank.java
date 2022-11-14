import java.util.HashMap;
import java.util.Scanner;

public class Bank {

    Scanner scan = new Scanner (System.in);
    HashMap<Integer, Transaction> transactions = new HashMap<Integer,Transaction>();

    public void welcomePage() {
        System.out.println("Welcome to Baddie Bank!");
    }
    public void crudOptions() {

        System.out.println("\n Input 'C' to create a new transaction");
        System.out.println("\n Input 'R' to read all the transactions");
        System.out.println("\n Input 'U' to update a transaction");
        System.out.println("\n Input 'D' to delete a transaction");
        System.out.println("\n Input 'Q' to quit menu");
    }
    public void WelcomePage() {
        String welcome = "Welcome to the First National Bank of T & Y";
        System.out.println(welcome);
    }

    public void createTransaction (){
        System.out.println("Input an iD number");
        int newiD = Integer.parseInt(scan.nextLine());
        System.out.println("Input the account holder's full name:");
        String accountHolder = scan.nextLine();
        System.out.println("Input the transaction #:");
        int transactionNumber =Integer.parseInt(scan.nextLine());
        System.out.println("Input the price of the purchase:");
        double purchasePrice =Double.parseDouble(scan.nextLine());
        System.out.println("Input the name of the purchase:");
        String purchaseName = scan.nextLine();


        transactions.put(newiD ,new Transaction(accountHolder,transactionNumber, purchasePrice, purchaseName));
        //save
        readTransactions();
        //UUID
    }

    public void readTransactions() {

        for (Integer key : transactions.keySet()) { // prints the keys
            System.out.println("Key: " + key + " Values: " + transactions.get(key)) ; //

//            transactions.get(key).print(); // prints values
        }
    }

    public void updateTransaction() {
        System.out.println("Input id of transaction:");
        int newiD = Integer.parseInt(scan.nextLine());
        transactions.get(newiD);
        //hashmap.put(key, hashmap.get(key) + 1);

        System.out.println("Input the account holder's full name:");
        String accountHolder = scan.nextLine();
        System.out.println("Input the transaction #:");
        int transactionNumber = Integer.parseInt(scan.nextLine());
        System.out.println("Input the price of the purchase:");
        double purchasePrice = Double.parseDouble(scan.nextLine());
        System.out.println("Input the name of the purchase:");
        String purchaseName = scan.nextLine();

        transactions.put(newiD, transactions.get(newiD)); // replaces
        transactions.put(newiD ,new Transaction(accountHolder,transactionNumber, purchasePrice, purchaseName));
    }




    public void deleteTransaction (){

        readTransactions();
        System.out.println("Provide the ID of the transaction you'd like to delete:");
        int iD=Integer.parseInt(scan.nextLine());
        transactions.remove(iD);
        System.out.println(transactions);
    }
}




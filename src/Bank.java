import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Bank {


    Scanner scan = new Scanner (System.in);
    HashMap<Integer, Transaction> transactions = new HashMap<Integer,Transaction>();

    public void welcomePage() {
        System.out.println("Welcome to Baddie Bank!");
    }




    public Bank() {
        this.transactions = new HashMap<>();
    }



    public void crudOptions() {

        System.out.println("\nInput 'C' to create a new transaction");
        System.out.println("Input 'R' to read all the transactions");
        System.out.println("Input 'U' to update a transaction");
        System.out.println("Input 'D' to delete a transaction");
        System.out.println("Input 'Q' to quit menu\n");
    }

    public void WelcomePage() {
        String welcome = "Welcome to the First National Bank of T & Y";
        System.out.println(welcome);
    }

    public void createTransaction() {
        System.out.println("Input an iD number");
        int newiD = Integer.parseInt(scan.nextLine());
        System.out.println("Input the account holder's full name:");
        String accountHolder = scan.nextLine();
        System.out.println("Input the transaction #:");
        int transactionNumber = Integer.parseInt(scan.nextLine());
        System.out.println("Input the price of the purchase:");
        double purchasePrice = Double.parseDouble(scan.nextLine());
        System.out.println("Input the name of the purchase:");
        String purchaseName = scan.nextLine();


        transactions.put(newiD, new Transaction(accountHolder, transactionNumber, purchasePrice, purchaseName));
        //save
        readTransactions();
        //UUID
    }

    public void readTransactions() {

        for (Integer key : transactions.keySet()) { // prints the keys
            System.out.println("\nTransaction ID: " + key);
            System.out.println(transactions.get(key)); // prints values
//            transactions.get(key).print(); // prints values
        }
    }


    public void updateMenu() {
        //what value would you like to update
        System.out.println("What would you like to do next?");
        System.out.println("\nInput '1' for account holder name");
        System.out.println("Input '2' for transaction number");
        System.out.println("Input '3' for purchase price");
        System.out.println("Input '4' for purchase name");
        System.out.println("Input '5' to read a list of all transactions");
        System.out.println("Input '6' to quit updating information\n");
    }

    public void updateTransaction() {
        System.out.println("Input the id for the transaction you would like to change:");
        //try/catch if user does not input number
        Transaction oldValues = null;
        try {
            int changingId = Integer.parseInt(scan.nextLine()); //key
            oldValues = transactions.get(changingId);  //values for the inputted key (Transaction obj)
        } catch (NumberFormatException n) {
            updateTransaction();
        }
        //change the relevant attribute depending on user input
        int in = 0;
        while (in != 6) {
            updateMenu();
            //if user does not input an integer or String within cases, wrap this in try/catch block
            try {
                in = Integer.parseInt(scan.nextLine());
                switch (in) {
                    case 1:
                        System.out.println("Input the new account holder's full name");
                        String accountHolder = scan.nextLine();
                        //replace the account holder attribute name with inputted value
                        oldValues.setAccountHolder(accountHolder);
                        break;
                    case 2:
                        System.out.println("Input the new transaction number");
                        int transactionNumber = Integer.parseInt(scan.nextLine());
                        oldValues.setTransactionNumber(transactionNumber);
                        break;
                    case 3:
                        System.out.println("Input the new purchase price");
                        double purchasePrice = Double.parseDouble(scan.nextLine());
                        oldValues.setPurchasePrice(purchasePrice);
                        break;
                    case 4:
                        System.out.println("Input the name of the purchase");
                        String purchaseName = scan.nextLine();
                        oldValues.setPurchaseName(purchaseName);
                        break;
                    case 5:
                        readTransactions();
                        break;
                    case 6:
                        System.out.println("Changes complete. \nHere is the current list of transactions with the updates:");
                        readTransactions();
                        break;
                }
            } catch (NoSuchElementException e) {
                System.out.println("You did not enter a valid input; no changes made.");
                updateTransaction();
            }
        }

        //        while (true) {
//            updateMenu();
//            int input = Integer.parseInt(scan.nextLine());
//            if (input == 1) {
//                System.out.println("Input the new account holder's full name");
//                String accountHolder = scan.nextLine();
//                //replace the account holder attribute name with inputted value
//                oldValues.setAccountHolder(accountHolder);
//            } else if (input == 2) {
//                System.out.println("Input the new transaction number");
//                int transactionNumber = Integer.parseInt(scan.nextLine());
//                oldValues.setTransactionNumber(transactionNumber);
//            } else if (input == 3) {
//                System.out.println("Input the new purchase price");
//                double purchasePrice = Double.parseDouble(scan.nextLine());
//                oldValues.setPurchasePrice(purchasePrice);
//            } else if (input == 4) {
//                System.out.println("Input the name of the purchase");
//                String purchaseName = scan.nextLine();
//                oldValues.setPurchaseName(purchaseName);
//            } else if (input == 5) {
//                readTransactions();
//            } else if (input == 6) {
//                System.out.println("Changes complete. \nHere is the current list of transactions with the updates:");
//                readTransactions();
//                break;
//            }
//        }

//        System.out.println("Input the account holder's full name:");
//        String accountHolder = scan.nextLine();
//        System.out.println("Input the transaction #:");
//        int transactionNumber = Integer.parseInt(scan.nextLine());
//        System.out.println("Input the price of the purchase:");
//        double purchasePrice = Double.parseDouble(scan.nextLine());
//        System.out.println("Input the name of the purchase:");
//        String purchaseName = scan.nextLine();

        //transactions.replace(changingId, oldValues); // replaces
        //transactions.put(newiD ,new Transaction(accountHolder,transactionNumber, purchasePrice, purchaseName));
    }

    public void deleteTransaction() {
        readTransactions();
        System.out.println("Provide the ID of the transaction you'd like to delete:");
        int iD = Integer.parseInt(scan.nextLine());
        transactions.remove(iD);
        System.out.println("Here are your current transactions after the deletion:");
        readTransactions();
    }
}





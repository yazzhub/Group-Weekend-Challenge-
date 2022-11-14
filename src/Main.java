import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
     Bank tybank = new Bank();
     Scanner scan = new Scanner(System.in);
     tybank.welcomePage();
     String options = " ";


        while (true) {
            tybank.crudOptions();
            options = scan.nextLine();

            if (options.equalsIgnoreCase("C")) {
                tybank.createTransaction();

            } else if (options.equalsIgnoreCase("R")) {
               tybank.readTransactions();

            } else if (options.equalsIgnoreCase("U")) {
               tybank.updateTransaction();
            } else if (options.equalsIgnoreCase("D")) {
                tybank.deleteTransaction();

            } else if (options.equalsIgnoreCase("Q")) {
                System.out.println("Have a blessed day!");
                break;

            }


        }
    }
}

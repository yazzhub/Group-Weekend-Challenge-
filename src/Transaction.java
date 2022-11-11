public class Transaction {

   private String accountHolder;

   private int transactionNumber;

   private double purchasePrice;

   private String purchaseName;


    public Transaction(String accountHolder, int transactionNumber, double purchasePrice, String purchaseName) {
        this.accountHolder = accountHolder;
        this.transactionNumber = transactionNumber;
        this.purchasePrice = purchasePrice;
        this.purchaseName = purchaseName;


    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public int getTransactionNumber() {
        return transactionNumber;
    }

    public void setTransactionNumber(int transactionNumber) {
        this.transactionNumber = transactionNumber;
    }

    public double getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(double purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public String getPurchaseName() {
        return purchaseName;
    }

    public void setPurchaseName(String purchaseName) {
        this.purchaseName = purchaseName;
    }

    @Override
    public String toString() {
        return "Tranaction{" +
                "accountHolder='" + accountHolder + '\'' +
                ", transactionNumber=" + transactionNumber +
                ", purchasePrice=" + purchasePrice +
                ", purchaseName='" + purchaseName + '\'' +
                '}';
    }
}

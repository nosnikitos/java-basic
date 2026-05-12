public class BankAccount {
    private String ownerName;
    private double balance;

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        if (ownerName.length() >= 2 && ownerName.length() <= 50) {
                this.ownerName = ownerName;
        } else {
            System.out.println("Невалидное имя");
        }
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (balance >= 0) {
        this.balance = balance;
        } else {
            System.out.println("Баланс не может быть отрицательным");
        }
    }
}

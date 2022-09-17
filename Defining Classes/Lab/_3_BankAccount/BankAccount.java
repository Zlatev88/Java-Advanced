package DefiningClasses.Lab._3_BankAccount;

public class BankAccount {
    private static int idCount = 1;
    private int id;
    private double balance;

    public static void setInterestRate(double interestRate) {
        BankAccount.interestRate = interestRate;
    }

    private static double interestRate = 0.02;

    BankAccount(){
        this.id = idCount++;
    }

    void deposit (double amount){
        this.balance += amount;
    }

    double getInterestRate (int years) {
        return BankAccount.interestRate*years*this.balance;
    }

    public int getId() {
        return id;
    }
}




public class BankAccount {

    private double balance;

    BankAccount(){
        balance = 0;
    }

    BankAccount(double initialBalance){
        if (initialBalance < 0 ){
            System.out.println("\tError: Balance must be >= 0. Balance set to 0.");
            balance = 0;
        }
        else {
            balance = initialBalance;
        }
    }

    public double getBalance() {
        return balance;
    }

    public double deposit(double amt) {
        if (amt <= 0) {
            System.out.println("\tError: Deposit amount must be greater than 0");
            return balance;
        } else {
            balance += amt;
            System.out.println("Deposit Successful.");
            return balance;
        }
    }

    public double withdraw(double amt){
        if (amt <= 0) {
            System.out.println("\tError: Withdraw amount must be greater than 0");
            return balance;
        } else {
            if (balance >= amt) {
                balance -= amt;
                System.out.println("Withdraw successful.");
            } else {
                System.out.println("\tError: Insufficient funds.");
            }
            return balance;
        }
    }
}

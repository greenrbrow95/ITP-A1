
public class Main {

    public static void main(String[] args) {

        BankAccount accountNoArg = new BankAccount();
        BankAccount accountNegArg = new BankAccount(-10.2);
        BankAccount accountValidArg = new BankAccount(124);

        //Test constructor
        System.out.printf("Balance of accountNoArg:%s\n", accountNoArg.getBalance());
        System.out.printf("Balance of accountNegArg:%s\n", accountNegArg.getBalance());
        System.out.printf("Balance of accountValidArg:%s\n\n", accountValidArg.getBalance());

        //Test Deposit
        accountValidArg.deposit(25);
        System.out.printf("accountValidArg - new balance after deposit: %s\n", accountValidArg.getBalance());
        accountValidArg.deposit(-23.23);
        System.out.printf("accountValidArg - new balance after negative deposit: %s\n\n", accountValidArg.getBalance());

        //Test Withdrawal
        accountValidArg.withdraw(10);
        System.out.printf("accountValidArg - new balance after withdraw: %s\n", accountValidArg.getBalance());
        accountValidArg.withdraw(1000000);
        System.out.printf("accountValidArg - new balance after excessive withdraw: %s\n", accountValidArg.getBalance());
        accountValidArg.withdraw(-324.54);
        System.out.printf("accountValidArg - new balance after negative withdraw: %s\n\n", accountValidArg.getBalance());

    }
}

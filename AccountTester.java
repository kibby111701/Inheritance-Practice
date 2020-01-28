public class AccountTester{
    public static void main(String[] args) {
        Account myAccount = new Account(1234);

        myAccount.deposit(5000);

        System.out.println(myAccount);

        myAccount.withdraw(1000);

        System.out.println(myAccount);
    }
}
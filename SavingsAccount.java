public class SavingsAccount extends Account{
    private double interest;
    public SavingsAccount(int a, double i){
        super(a);
        this.interest = i;
    }


    public void addInterest(){
        super.deposit(getBalance() * interest);
    }

    public void update(){
        addInterest();
    }
}
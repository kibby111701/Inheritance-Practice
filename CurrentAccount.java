public class CurrentAccount extends Account{
    private double overdraftLimit;
    
    public CurrentAccount(int a, double o){
        super(a);
        this.overdraftLimit = o;
    }

    public String letter(){
        return "Boi stop spending so much money";
    }

    public void withdraw(double sum){
        if (sum > overdraftLimit){
            letter();
        }

        super.withdraw(sum);
    }

}
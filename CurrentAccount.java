public class CurrentAccount extends Account{
    private double overdraftLimit;
    
    public CurrentAccount(int a, double o){
        super(a);
        this.overdraftLimit = o;
    }

}
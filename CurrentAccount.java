public class CurrentAccount extends Account{
    private double overdraftLimit;
    private boolean inOverdraft;
    
    public CurrentAccount(int a, double o){
        super(a);
        this.overdraftLimit = o;
        inOverdraft = false;
    }

    public String letter(){
        return "Boi stop spending so much money";
    }

    public void withdraw(double sum){
        if (getBalance() - sum < -overdraftLimit){
            System.out.print(letter());
            inOverdraft = true;
        }
        else{
            super.withdraw(sum);
        }
    }

    public void update(){
        if (inOverdraft){
            System.out.println(letter());
        }
    }

}
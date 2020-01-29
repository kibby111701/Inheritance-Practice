public class Bank{
    private Account[] accounts;
    private double dividend;

    public Bank(Account[] accounts, double dividend){
        this.accounts = accounts;
        this.dividend = dividend;
    }

    public void update(){
        for(int i = 0; i < accounts.length; i++){
            if (accounts[i] instanceof CurrentAccount){
                (CurrentAccount) accounts[i].update();
            }
            else if (accounts[i] instanceof SavingsAccount){
                (SavingsAccount) accounts[i].update();
            }
        }
    }

    public void payDividend(){
        for (int i = 0; i < accounts.length; i++){
            accounts[i].deposit(dividend);
        }
    }

    public void openAccount(Account newAccount){
        Account[] temp = new Account[accounts.length + 1];

        for (int i = 0; i < temp.length; i ++){
            temp[i] = accounts[i];
        }

        temp[temp.length - 1] = newAccount;

        accounts = temp;


    }

    public void closeAccount(int x){
        Account[] temp = new Account[accounts.length - 1];

        if (x < accounts.length -1){
            for (int i = 0; i < x; i++){
                temp[i] = accounts[i];
            }
            for (int i = x+1; i < accounts.length; i++){
                temp[i] = accounts[i]
            }
        }

        else{
            for (int i = 0; i < accounts.length - 1; i++){
                temp[i] = accounts[i];
            }
        }

        accounts = temp;
    }




}
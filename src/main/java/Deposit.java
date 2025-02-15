public class Deposit {

    public int amountToDeposit;
    public int newBalance;
    public int currentBalance;

    public Deposit(int currentBalance,int amountToDeposit) {
        this.amountToDeposit = amountToDeposit;
        this.currentBalance = currentBalance;
        if (amountToDeposit > 0) {
            currentBalance = currentBalance + amountToDeposit;
            newBalance = currentBalance;
            System.out.println("You deposited: $" + amountToDeposit + " to your account." +
                            "Your new balance is: $" + newBalance);
        }else{
            System.out.println("Please deposit an amount greater than $0");
        }
    }

    public int getAmountToDeposit() {
        return amountToDeposit;
    }

    public void setAmountToDeposit(int amountToDeposit) {
        this.amountToDeposit = amountToDeposit;
    }

    public int getNewBalance() {
        return newBalance;
    }

    public void setNewBalance(int newBalance) {
        this.newBalance = newBalance;
    }
}

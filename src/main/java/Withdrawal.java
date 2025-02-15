public class Withdrawal {

    public int currentBalance;
    public int newBalance;
    public int amountToWithdrawal;

    public Withdrawal(int currentBalance,  int amountToWithdrawal) {
        this.currentBalance = currentBalance;
        this.amountToWithdrawal = amountToWithdrawal;
        if(currentBalance > amountToWithdrawal) {
            currentBalance = currentBalance - amountToWithdrawal;
            newBalance = currentBalance;
            System.out.println("Withdrawn: $" + newBalance);
        }
        else{
            System.out.println("Insufficient funds! You are short by $" + Math.abs(currentBalance - amountToWithdrawal));
        }
    }

    public int getCurrentBalance() {
        return currentBalance;
    }

    public void setCurrentBalance(int currentBalance) {
        this.currentBalance = currentBalance;
    }

    public int getNewBalance() {
        return newBalance;
    }

    public void setNewBalance(int newBalance) {
        this.newBalance = newBalance;
    }

    public int getAmountToWithdrawal() {
        return amountToWithdrawal;
    }

    public void setAmountToWithdrawal(int amountToWithdrawal) {
        this.amountToWithdrawal = amountToWithdrawal;
    }
}

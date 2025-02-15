public class SavingsAccount extends BankAccount {

    private double currentBalance;
    private double newBalance;
    private double amountToWithdrawal;
    private double amountToDeposit;

    public SavingsAccount(String customerName, int bankAccountNumber, double currentBalance) {
        super(customerName, bankAccountNumber);
        this.currentBalance = currentBalance;
    }

    public void withdrawal(double amountToWithdrawal) {
        this.amountToWithdrawal = amountToWithdrawal;
        if(currentBalance > amountToWithdrawal) {
            currentBalance -= amountToWithdrawal;
            newBalance = currentBalance;

        }
        else{
            System.out.println("Insufficient funds! You are short by $" + Math.abs(currentBalance - amountToWithdrawal));
        }
    }

    public void deposit(double amountToDeposit) {
        this.amountToDeposit = amountToDeposit;
        if (amountToDeposit > 0) {
            currentBalance += amountToDeposit;
            newBalance = currentBalance;
            System.out.println("You deposited: $" + amountToDeposit + " to your account." +
                    "Your new balance is: $" + newBalance);
        }else{
            System.out.println("Please deposit an amount greater than $0");
        }
    }


    public double getCurrentBalance() {
        return currentBalance;
    }

    public void setCurrentBalance(double currentBalance) {
        this.currentBalance = currentBalance;
    }
}

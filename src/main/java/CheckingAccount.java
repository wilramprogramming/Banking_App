public class CheckingAccount extends BankAccount {

    private double currentBalance = 0.00;
    private double newBalance;
    private double amountToWithdrawal;
    private double amountToDeposit;

    public CheckingAccount(String customerName, int bankAccountNumber,double currentBalance) {
        super(customerName, bankAccountNumber);
        this.currentBalance = currentBalance;
    }

    public void withdrawal(double amountToWithdrawal) {
        this.amountToWithdrawal = amountToWithdrawal;
        if(currentBalance > amountToWithdrawal) {
            currentBalance -= amountToWithdrawal;
             newBalance = currentBalance;
            System.out.println("Withdrawn: $" + amountToWithdrawal);
            System.out.println("Your new balance is: $" + newBalance);
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

    public double getAmountToDeposit() {
        return amountToDeposit;
    }

    public void setAmountToDeposit(double amountToDeposit) {
        this.amountToDeposit = amountToDeposit;
    }

    public double getAmountToWithdrawal() {
        return amountToWithdrawal;
    }

    public void setAmountToWithdrawal(double amountToWithdrawal) {
        this.amountToWithdrawal = amountToWithdrawal;
    }

    public double getNewBalance() {
        return newBalance;
    }

    public void setNewBalance(double newBalance) {
        this.newBalance = newBalance;
    }

    public double getCurrentBalance() {
        return currentBalance;
    }

    public void setCurrentBalance(double currentBalance) {
        this.currentBalance = currentBalance;
    }
}

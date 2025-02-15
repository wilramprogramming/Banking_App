//    This is the account parent class BankAccount, which the CheckingAccount and SavingsAccount are children of.
public class BankAccount {
//    it only has these 2 variables that all child BankAccounts must always use.
    private String customerName;
    private int bankAccountNumber;


    public BankAccount(String customerName, int bankAccountNumber) {
        this.customerName = customerName;
        this.bankAccountNumber = bankAccountNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getBankAccountNumber() {
        return bankAccountNumber;
    }

    public void setBankAccountNumber(int bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
    }
}

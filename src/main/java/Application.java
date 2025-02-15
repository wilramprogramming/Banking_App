import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
//        variables to save the users input via the scanner object
        int accountInput;
        int menuSelection;
//        scanner object to save the users input
        Scanner scanner = new Scanner(System.in);
//        The customers checking account and savings account. (I was going to create a user class and create a customer child class, but realized I already made the program way more complicated than it needed to be as it is.)
        CheckingAccount wilsonCheckingAccount = new CheckingAccount("Wilson", 12345, 0);
        SavingsAccount wilsonSavingsAccount = new SavingsAccount("Wilson", 67890, 0);

//        this part requests the user to enter their account number and saves it into the accountInput variable
        System.out.println("Please enter your account number.");
        accountInput = Integer.parseInt(scanner.nextLine());
        // this is the beginning of the else if statement which displays the menu options utilizing the DisplayMenu() class method
        if (accountInput == 12345) {  //this is for the checking account
            System.out.println("Welcome " + wilsonCheckingAccount.getCustomerName());
            new DisplayMenu();
//            displayMenu(wilsonCheckingAccount.getCustomerName());

//            It then goes into a do while loop with a switch statement for each option and keeps running until the user enters the number 4.
            do {
                menuSelection = scanner.nextInt();
                switch (menuSelection) {
                    case 1:
                        System.out.println("Your current balance is " + wilsonCheckingAccount.getCurrentBalance());
                        break;

                    case 2:
                        System.out.println("Please enter the amount you wish to withdrawal.");
                        int amountToWithdraw = scanner.nextInt();
                        wilsonCheckingAccount.withdrawal(amountToWithdraw); // here im calling the withdrawal method in the CheckingAccount class which wilsonCheckingAccount is an object created from that class.
                        System.out.println();
                        break;

                    case 3:
                        System.out.println("Please enter the amount you wish to deposit.");
                        int amountToDeposit = scanner.nextInt();
                        wilsonCheckingAccount.deposit(amountToDeposit); // same here but we are calling the deposit method. the amountToWithdrawal and the amountToDeposit variables, stores the input that the user has... inputted
                        System.out.println();
                        break;

                    case 4:
                        System.out.println("Thank you for banking with us :-)");
                        System.out.println();
                        break;


                    default: //  the default output if they choose an option outside 1-4
                        System.out.println("Invalid menu selection. Please try again.");
                        break;
                }
            } while (menuSelection != 4); // it keeps running until the user chooses to exit the program via option 4

        } else if (accountInput == 67890) {// this is for the savings account. It's all the same, just calling from the SavingsAccount class method.
            System.out.println("Welcome " + wilsonSavingsAccount.getCustomerName());
            new DisplayMenu();

            do {
                menuSelection = scanner.nextInt();
                switch (menuSelection) {
                    case 1:
                        System.out.println("Your current balance is " + wilsonSavingsAccount.getCurrentBalance());
                        break;

                    case 2:
                        System.out.println("Please enter the amount you wish to withdrawal.");
                        int amountToWithdraw = scanner.nextInt();
                        wilsonSavingsAccount.withdrawal(amountToWithdraw);
                        System.out.println();
                        break;

                    case 3:
                        System.out.println("Please enter the amount you wish to deposit.");
                        int amountToDeposit = scanner.nextInt();
                        wilsonSavingsAccount.deposit(amountToDeposit);
                        System.out.println();
                        break;

                    case 4:
                        System.out.println("Thank you for banking with us :)");
                        System.out.println();
                        break;


                    default:
                        System.out.println("Invalid menuSelection. Please try again.");
                        break;
                }
            } while(menuSelection != 4);
        }
    }

//    what I initially started with until I figured out I needed to remove the customerName parameter in order to make the class method work.
//    private static void displayMenu(String customerName) {
//        System.out.println("Welcome " + customerName);
//        System.out.println("What would you like to do today?");
//        System.out.println("1. Check your balance.");
//        System.out.println("2. Make a withdrawal.");
//        System.out.println("3. Make a deposit.");
//        System.out.println("4. End Transaction.");
//        System.out.println("***************************************************************");
//    }
}
import java.util.Scanner;

public class Menu {
    static void main(String[] args) {
        String name = "Jeffrey W. Butterworth";
        String accountType = "Cheking";
        double balance = 1599.99;
        int option = 0;

        System.out.println("***************************");
        System.out.println("\nAccount holder name: " + name);
        System.out.println("Account type: " + accountType);
        System.out.println("Current balance: " + balance);
        System.out.println("\n***************************");

        String menu = """
                ** Enter your option **
                1 - View balance
                2 - Transfer money
                3 - Receive money
                4 - Exit
                """;
        Scanner input = new Scanner(System.in);
        while (option != 4) {
            System.out.println(menu);
            option = input.nextInt();

            if (option == 1){
                System.out.println("Your updated balance is " + balance);
            } else if (option == 2) {
                System.out.println("Enter the amount to transfer");
                double value = input.nextDouble();
                if (value > balance) {
                    System.out.println("Insufficient funds");
                } else {
                    balance -= value;
                }
            } else if (option == 3) {
                System.out.println("Amount received: ");
                double value = input.nextDouble();
                balance += value;
            } else if (option != 4) {
                System.out.println("Invalid option");
            }
        }
    }
}

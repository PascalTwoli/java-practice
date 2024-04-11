import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char choice;
        do {
            displayMenu();
            choice = getUserChoice(scanner);
            switch (choice) {
                case 'A':
                    performSum(scanner);
                    break;
                case 'B':
                    performMinimum(scanner);
                    break;
                case 'C':
                    performArray(scanner);
                    break;
                default:
                    System.out.println("Invalid choice. Please select A, B, or C.");
            }
        } while (choice == 'Y' || choice == 'y');
        System.out.println("Exiting the program. Goodbye!");
    }

    private static void displayMenu() {
        System.out.println("MENU");
        System.out.println("Code Function");
        System.out.println("A Sum");
        System.out.println("B Minimum");
        System.out.println("C Array");
    }

    private static char getUserChoice(Scanner scanner) {
        System.out.print("Enter your choice (A/B/C): ");
        return scanner.next().charAt(0);
    }

    private static void performSum(Scanner scanner) {
        System.out.print("Enter the first numeric value: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter the second numeric value: ");
        double num2 = scanner.nextDouble();
        double sum = num1 + num2;
        System.out.println("Sum: " + sum);
    }

    private static void performMinimum(Scanner scanner) {
        System.out.print("Enter the first numeric value: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter the second numeric value: ");
        double num2 = scanner.nextDouble();
        double min = (num1 < num2) ? num1 : num2;
        System.out.println("Minimum value: " + min);
    }

    private static void performArray(Scanner scanner) {
        String[] names = new String[5];
        System.out.println("Enter 5 names:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Name " + (i + 1) + ": ");
            names[i] = scanner.next();
        }
        System.out.println("Displaying all 5 names:");
        for (String name : names) {
            System.out.println(name);
        }
    }
}

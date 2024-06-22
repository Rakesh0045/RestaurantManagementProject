import java.util.Scanner;

public class OrderingSystem {

    public static Scanner input = new Scanner(System.in);
    public static int choose, quantity;
    public static String again;
    public static double total, pay, change, rem;

    public static void menu() {
        System.out.println("\t\t\t\t+==================================+");
        System.out.println("\t\t\t\t             MENU                   ");
        System.out.println("\t\t\t\t  1. Chicken Butter Masala    Rs.250");
        System.out.println("\t\t\t\t  2. Paneer Butter Masala     Rs.200");
        System.out.println("\t\t\t\t  3. Garlic Naan              Rs.60 ");
        System.out.println("\t\t\t\t  4. Plain Naan               Rs.30 ");
        System.out.println("\t\t\t\t  5. Gulab Jamun              Rs.20 ");
        System.out.println("\t\t\t\t  0. Exit\n");
    }

    public static void order() {
        do {
            System.out.println("\nPress 1 for Chicken Butter Masala\nPress 2 for Paneer Butter Masala\nPress 3 for Garlic Naan\nPress 4 for Plain Naan\nPress 5 for Gulab Jamun\nPress 0 to Exit\n");
            System.out.println("Place your order: ");
            choose = input.nextInt();

            switch (choose) {
                case 1:
                    System.out.println("Order quantity: ");
                    quantity = input.nextInt();
                    total += quantity * 250;
                    break;
                case 2:
                    System.out.println("Order quantity: ");
                    quantity = input.nextInt();
                    total += quantity * 200;
                    break;
                case 3:
                    System.out.println("Order quantity: ");
                    quantity = input.nextInt();
                    total += quantity * 60;
                    break;
                case 4:
                    System.out.println("Order quantity: ");
                    quantity = input.nextInt();
                    total += quantity * 30;
                    break;
                case 5:
                    System.out.println("Order quantity: ");
                    quantity = input.nextInt();
                    total += quantity * 20;
                    break;
                case 0:
                    System.out.println("Exiting the order system.");
                    return;
                default:
                    System.out.println("Your requested item is not on the menu. Please order from the menu.");
                    continue;
            }

            System.out.println("Do you want to order anything else? (Y/N)");
            again = input.next();

        } while (again.equalsIgnoreCase("Y"));

        processPayment();
    }

    public static void processPayment() {
        System.out.println("\nEnter your payment: ");
        pay = input.nextDouble();
        while (pay < total) {
            rem = total - pay;
            System.out.println("\nYour paid amount is less than the total amount!!\nPlease pay the remaining amount: " + rem);
            System.out.println("\nEnter the remaining amount: ");
            double remainingAmount = input.nextDouble();
            pay += remainingAmount;
        }

        change = pay - total;
        System.out.println("\nYour order total is: " + total);
        if (change > 0)
            System.out.println("Your remaining amount is: " + change);

        System.out.println("\nTHANK YOU FOR VISITING US!!");
    }

    public static void main(String[] args) {
        menu();
        order();
    }
}

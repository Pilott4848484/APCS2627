import java.util.Scanner;

public class ReceiptMain {
    public static void main(String[] args) {

        double PA_TAX = 0.06;

        String ap;
        double app;

        String en;
        double ent;

        String dr;
        double dri;

        String de;
        double des;

        double subtotal;
        double total;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Appetizer: ");
        ap=scanner.nextLine();
        System.out.print("Appetizer price: $ ");
        app = Double.parseDouble(scanner.nextLine());

        System.out.print("Entree: ");
        en=scanner.nextLine();
        System.out.print("Entree price: $ ");
        ent = Double.parseDouble(scanner.nextLine());

        System.out.print("Drink: ");
        dr = scanner.nextLine();
        System.out.print("Drink price: $ ");
        dri = Double.parseDouble(scanner.nextLine());

        System.out.print("Dessert: ");
        de = scanner.nextLine();
        System.out.print("Dessert price: $ ");
        des = Double.parseDouble(scanner.nextLine());

        //call methods from class
        subtotal = ReceiptCalculator.calcSubtotal(app, ent, dri, des);
        total = ReceiptCalculator.calcTax(subtotal, PA_TAX);

        //print
        System.out.println("\n");

        String[] items = {
            ap,
            en,
            dr,
            de
        };

        double[] prices = {
            app,
            ent,
            dri,
            des
        };

        for (int i = 0; i < items.length; i++) {
            System.out.printf("%-25s %6.2f%n", items[i], prices[i]);
        }
        System.out.printf("%-25s %6.2f%n", "Subtotal", subtotal);
        System.out.printf("%-25s %6.2f%n", "Tax(6%)", subtotal*PA_TAX);

        System.out.println("********************************");

        System.out.printf("%-25s %6.2f%n", "Total", total);

        scanner.close();
    }
}

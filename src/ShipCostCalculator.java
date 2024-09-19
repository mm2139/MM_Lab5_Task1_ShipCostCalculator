import java.util.Scanner;

public class ShipCostCalculator {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double cost;
        double shipping;

        System.out.println("What is the price of your item?");

        if (scan.hasNextDouble()) {
            cost = scan.nextDouble();
            if (cost < 100) {
                shipping = cost*0.2;
                cost += shipping;
                System.out.println("Shipping is 2% of your item price, which will be " + shipping + ". The total cost of your order is " + cost + ".");
            }
            else {
                System.out.println("Shipping is free. The total cost of your order is " + cost + ".");
            }
        }
        else {
            System.out.println("You have not inputed a valid price.");
            System.exit(0);
        }

    }
}
import java.util.Scanner;

public class Ex28 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input the type of meat: ");
        String type = scan.next();
        System.out.println("Input the weight: ");
        double weight = scan.nextDouble();
        double price = 0;
        if("fp".equalsIgnoreCase(type)) {
            if(weight <= 5) {
                price += weight * 4.9;
            } else {
                price += weight * 5.8;
            }
        } else if("Alcatra".equalsIgnoreCase(type)) {
            if(weight <= 5) {
                price += weight * 5.9;
            } else {
                price += weight * 6.8;
            }
        } else {
            if(price <= 5) {
                price += weight * 6.9;
            } else {
                price += weight * 7.8;
            }
        }
        double totalPrice = price;
        System.out.println("Are you going to use the card tabajara?");
        String card = scan.next();
        if("yes".equalsIgnoreCase(card)) {
            price = price - (price * 0.05);
        }
        System.out.printf("Type of meat: %s\n", type);
        System.out.printf("Weight of meat: %.1f\n", weight);
        System.out.printf("Price total: %.1f\n", totalPrice);
        System.out.printf("Type of payment: %s\n", "yes".equalsIgnoreCase(card) ? "Card tabajara" : "Normal card");
        System.out.printf("Discount: %.1f\n", "yes".equalsIgnoreCase(card) ? (totalPrice * 0.05) : 0.0);
        System.out.printf("Price to pay: %.1f\n", price);
    }
}

import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double squareMeters = scan.nextDouble();
        double liters = squareMeters / 3;
        double price;
        if(liters >= 18) {
            price = liters / 18;
            if(liters % 18 > 0) {
                price++;
            }
        }
        else {
            price = 1;
        }
        price = Math.floor(price);
        System.out.printf("Price: R$ %.2f\n", (price * 80));
    }
}

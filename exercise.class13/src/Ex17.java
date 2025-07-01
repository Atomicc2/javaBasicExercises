import java.util.Scanner;

public class Ex17 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double squareMeters = scan.nextDouble();
        double liters = squareMeters / 6;

        double priceBigger = Math.ceil(liters / 18) * 80;

        double priceMinor = Math.ceil(liters / 3.6) * 25;

        double smallPrice = 0;
        double tempLiters = liters;
        while(tempLiters > 0) {
            if(tempLiters >= 18) {
                smallPrice += 80;
                tempLiters -= 18;
            }
            else if(tempLiters >= 3.6) {
                smallPrice += 25;
                tempLiters -= 3.6;
            }
            else {
                smallPrice += 25;
                tempLiters = 0;
            }
        }

        System.out.printf("Price 18L: R$ %.2f\n", priceBigger);
        System.out.printf("Price 3.6L: R$ %.2f\n", priceMinor);
        System.out.printf("Lowest price: R$ %.2f\n", smallPrice);
    }
}

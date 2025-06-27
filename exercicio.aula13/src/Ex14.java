import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double weight = scan.nextDouble();
        double excess = 0;
        if(weight > 50) {
            excess = weight - 50;
        }
        double tax = excess * 4;
        System.out.printf("Tax is: %d", Math.round(tax));
    }
}

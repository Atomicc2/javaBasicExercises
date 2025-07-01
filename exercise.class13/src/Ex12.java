import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input your height: ");
        double height = scan.nextDouble();
        double weight = 72.7 * height - 58;
        System.out.printf("The ideal weight is: %.1f", weight);
    }
}
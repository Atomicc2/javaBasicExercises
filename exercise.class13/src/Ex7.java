import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the measurement of the side of the square: ");
        double l = scan.nextDouble();
        double area = Math.pow(l, 2);
        System.out.printf("Twice the area is: %.2f\n", area * 2);
    }
}

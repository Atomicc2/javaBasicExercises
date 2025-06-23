import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double meters = scan.nextDouble();
        System.out.printf("in centimeters it is: %.2f\n", meters * 100);
    }
}

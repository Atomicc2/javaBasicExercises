import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n1 = scan.nextInt();
        int n2 = scan.nextInt();
        double n3 = scan.nextDouble();
        double result1 = (n1 * 2) * (n2 / 2);
        double result2 = (n1 * 3) + n3;
        double result3 = Math.pow(n3, 3);
        System.out.printf(
                "A = %.1f\n" +
                "B = %.1f\n" +
                "C = %.1f\n",
                result1, result2, result3
        );
    }
}

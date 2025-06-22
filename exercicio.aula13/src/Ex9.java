import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double f = scan.nextDouble();
        double c = (f - 32) * 5 / 9;
        System.out.printf("%.1f farenheit em celsios é %.1f", f, c);
    }
}

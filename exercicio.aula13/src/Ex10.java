import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double c = scan.nextDouble();
        double f = (c * 9 / 5) + 32;
        System.out.printf("%.1f em celcios é %.1f em farenheit", c, f);
    }
}

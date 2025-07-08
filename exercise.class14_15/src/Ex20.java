import java.util.Scanner;

public class Ex20 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double n = scan.nextInt();
        double n2 = scan.nextInt();
        double n3 = scan.nextInt();
        n = (n + n2 + n3) / 3;
        if(n == 10) {
            System.out.printf("Passed with distinction, average: %.1f", n);
        } else if(n >= 7) {
            System.out.printf("Aproved, average: %.1f", n);
        } else {
            System.out.printf("Reproved, average: %.1f", n);
        }
    }
}

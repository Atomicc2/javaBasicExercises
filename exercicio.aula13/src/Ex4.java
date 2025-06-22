import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double n1 = scan.nextDouble();
        double n2 = scan.nextDouble();
        double n3 = scan.nextDouble();
        double n4 = scan.nextDouble();
        double media = (n1 + n2 + n3 + n4) / 4;
        System.out.printf("A média é: %.2f\n", media);
    }
}

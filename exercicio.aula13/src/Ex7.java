import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o lado do quadrado: ");
        double l = scan.nextDouble();
        double area = Math.pow(l, 2);
        System.out.printf("O dobro da área é: %.2f\n", area * 2);
    }
}

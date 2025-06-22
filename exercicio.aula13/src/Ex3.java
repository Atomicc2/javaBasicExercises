import java.util.Scanner;
public class Ex3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o 1º número: ");
        int x = scan.nextInt();
        System.out.println("Digite o 2º número: ");
        int y = scan.nextInt();
        System.out.printf("A soma é de %d + %d é: %d\n", x, y, x + y);
    }
}

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double raio = scan.nextDouble();
        double area = Math.PI * Math.pow(raio, 2);
        System.out.printf("%.2f", area);
    }
}

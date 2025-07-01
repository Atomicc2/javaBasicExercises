import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double n1 = scan.nextDouble();
        double n2 = scan.nextDouble();
        double n3 = scan.nextDouble();
        double n4 = scan.nextDouble();
        double average = (n1 + n2 + n3 + n4) / 4;
        System.out.printf("The average is: %.2f\n", average);
    }
}

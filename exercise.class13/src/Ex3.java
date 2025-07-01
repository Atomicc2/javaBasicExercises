import java.util.Scanner;
public class Ex3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input the first number: ");
        int x = scan.nextInt();
        System.out.println("Input the second number: ");
        int y = scan.nextInt();
        System.out.printf("The sum of %d + %d is: %d\n", x, y, x + y);
    }
}

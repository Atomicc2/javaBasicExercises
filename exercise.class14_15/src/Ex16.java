import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        if(a == 0) {
            System.out.println("This is not a quadratic equation!");
        }
        else {
            double b = scan.nextInt();
            double c = scan.nextInt();
            double delta = Math.pow(b, 2) - (4 * a * c);
            double root1;
            double root2;
            if(delta < 0) {
                System.out.println("There are no roots!");
            }
            else if(delta == 0) {
                root1 = -b / (2 * a);
                System.out.printf("Delta is 0, there is only one root: %.1f", root1);
            }
            else {
                root1 = (-b + Math.sqrt(delta)) / 2 * a;
                root2 = (-b - Math.sqrt(delta)) / 2 * a;
                System.out.printf("1ª root: %.1f\n2ª root: %.1f\n", root1, root2);
            }
        }

    }
}

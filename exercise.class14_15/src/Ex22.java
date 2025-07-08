import java.util.Scanner;

public class Ex22 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if(n % 2 == 0) {
            System.out.println("This number is pair!");
        } else {
            System.out.println("This number is odd!");
        }
    }
}

import java.util.Scanner;

public class Ex23 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double n = scan.nextDouble();
        if(n % 1 != 0) {
            System.out.println("This number is float!");
        } else {
            System.out.println("This number is integer!");
        }
    }
}

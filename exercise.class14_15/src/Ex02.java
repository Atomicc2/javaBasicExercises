import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if(n >= 0) {
            System.out.println("This number is positive!");
        } else {
            System.out.println("This name is negative!");
        }
    }
}

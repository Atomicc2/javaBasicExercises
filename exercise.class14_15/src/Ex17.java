import java.util.Scanner;

public class Ex17 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int year = scan.nextInt();
        if (year % 4 == 0) {
            System.out.println("This year is leap year!");
        } else {
            System.out.println("This year not is leap year!");
        }
    }
}
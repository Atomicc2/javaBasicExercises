import java.util.Scanner;

public class Ex18 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int day = scan.nextInt();
        int month = scan.nextInt();
        int year = scan.nextInt();
        if(day >= 1 && day <= 32) {
            if(month >= 1 && month <= 12) {
                if(year >= 1 && year <= 2025) {
                    System.out.println("Is a valid date!");
                } else {
                    System.out.println("Is a invalid year!");
                }
            } else {
                System.out.println("Is a invalid month!");
            }
        } else {
            System.out.println("Is a invalid day!");
        }

    }
}

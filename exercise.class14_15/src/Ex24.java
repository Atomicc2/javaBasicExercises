import java.util.Scanner;

public class Ex24 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double n1 = scan.nextDouble();
        double n2 = scan.nextDouble();
        double result = 0;
        String operation = scan.next();
        if("+".equals(operation)) {
            result = n1 + n2;
        } else if("-".equals(operation)) {
            result = n1 - n2;
        } else if("/".equals(operation)) {
            result = n1 / n2;
        } else if("*".equals(operation)) {
            result = n1 * n2;
        }
        System.out.printf("The result is: %.1f\n", result);
        if(result % 2 == 0) {
            System.out.println("This number is pair");
        } else {
            System.out.println("This number is odd");
        }
        if(result >= 0) {
            System.out.println("This number is positive");
        } else {
            System.out.println("This number is negative");
        }
        if(result % 1 != 0) {
            System.out.println("This number is float");
        } else {
            System.out.println("This number is integer");
        }
    }
}

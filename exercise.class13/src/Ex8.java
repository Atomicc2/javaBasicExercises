import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the hourly value: ");
        double valueHours = scan.nextDouble();
        System.out.print("Input the hours worked: ");
        int hours = scan.nextInt();
        System.out.printf("You will receive %.2f this month!", hours * valueHours);
    }
}

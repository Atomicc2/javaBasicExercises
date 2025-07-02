import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double salaryGross = scan.nextDouble();
        double salaryLiquid, percentage, salaryPercentage;
        if(salaryGross > 1500) {
            percentage = 5;
            salaryPercentage = salaryGross * 0.05;
            salaryLiquid = salaryGross + salaryPercentage;
        }
        else if(salaryGross > 700) {
            percentage = 10;
            salaryPercentage = salaryGross * 0.1;
            salaryLiquid = salaryGross + salaryPercentage;
        }
        else if(salaryGross > 280) {
            percentage = 15;
            salaryPercentage = salaryGross * 0.15;
            salaryLiquid = salaryGross + salaryPercentage;
        }
        else {
            percentage = 20;
            salaryPercentage = salaryGross * 0.2;
            salaryLiquid = salaryGross + salaryPercentage;
        }
        System.out.println("Gross salary: " + salaryGross + "\nPercentage: " + percentage + "%" + "\nincrease: " + salaryPercentage + "\nSalary liquid: " + salaryLiquid);
    }
}

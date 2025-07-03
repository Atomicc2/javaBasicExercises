import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input the value hours: ");
        double valueHours = scan.nextDouble();
        System.out.println("Input the hours in the month: ");
        int hours = scan.nextInt();
        double salaryGross = valueHours * hours;

        double percentage = 0;

        if(salaryGross > 2500) {
            percentage = 20;
        }
        else if(salaryGross > 1500) {
            percentage = 10;
        }
        else if(salaryGross > 900) {
            percentage = 5;
        }
        double incomeTax = salaryGross * (percentage /100);


        System.out.printf("Salary gross: (%.0f * %d)   :%.2f R$\n", valueHours, hours, salaryGross);
        System.out.printf("Income tax: (%.0f%%)          :%.2f R$\n", percentage, incomeTax);
        System.out.printf("INSS: (10%%)               :%.2f R$\n", salaryGross * 0.1);
        System.out.printf("FGTS: (11%%)               :%.2f R$\n", salaryGross * 0.11);
        System.out.printf("All discounts:            :%.2f R$\n", incomeTax + (salaryGross * 0.1));
        System.out.printf("Salary liquid:            :%.2f RS\n", salaryGross - (salaryGross * 0.1) - incomeTax);
    }
}

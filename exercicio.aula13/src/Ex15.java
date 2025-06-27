import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double valueHours = scan.nextDouble();
        double hours = scan.nextDouble();
        double salaryGross = valueHours * hours;
        double incomeTax = salaryGross * 0.11;
        double inss = salaryGross * 0.08;
        double union = salaryGross * 0.05;
        double salaryLiquid = salaryGross - incomeTax - inss - union;
        System.out.printf("Salary Gross: R$ %.2f\nIT: R$ %.2f\nINSS: R$ %.2f\nUnion: R$ %.2f\nLiquid: R$ %.2f", salaryGross, incomeTax, inss, union, salaryLiquid);
    }
}

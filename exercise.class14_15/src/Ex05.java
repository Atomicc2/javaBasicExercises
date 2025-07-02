import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double n1 = scan.nextDouble();
        double n2 = scan.nextDouble();
        double media = (n1 + n2) /2;
        if(media == 10) {
            System.out.println("Approved with distinction!");
        }
        else if(media >= 7) {
            System.out.println("Approved!");
        }
        else {
            System.out.println("Failed!");
        }
    }
}

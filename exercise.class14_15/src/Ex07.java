import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double n = scan.nextDouble();
        double minorPrice = n;
        for(int i = 0; i < 2; i++) {
            n = scan.nextDouble();
            if(n < minorPrice) {
                minorPrice = n;
            }
        }
        System.out.println("The minor price is: " + minorPrice);
    }
}


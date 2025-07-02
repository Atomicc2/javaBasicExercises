import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int minor = n;
        int bigger = n;
        for(int i = 0; i < 2; i++) {
            n = scan.nextInt();
            if(n > bigger) {
                bigger = n;
            }
            if(n < minor) {
                minor = n;
            }
        }
        System.out.println("The bigger number is: " + bigger + "\nThe minor number is: " + minor);
    }
}

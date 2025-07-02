import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int minor = n;
        for(int i = 0; i < 2; i++) {
            n = scan.nextInt();
            if(n < minor) {
                minor = n;
            }
        }
        System.out.println("This minor number is: " + minor);
    }
}

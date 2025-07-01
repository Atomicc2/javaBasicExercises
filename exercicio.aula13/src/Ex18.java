import java.util.Scanner;

public class Ex18 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int mbs = scan.nextInt();
        int mbps = scan.nextInt();
        System.out.println("time required: " + (mbs / mbps) / 60);
    }
}

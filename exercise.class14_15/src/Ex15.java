import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double l1 = scan.nextDouble();
        double l2 = scan.nextDouble();
        double l3 = scan.nextDouble();
        boolean verify = false;
        if(l1 + l2 > l3 || l1 + l3 > l2 || l2 + l3 > l1) {
            verify = true;
        }
        if(verify) {
            System.out.println("It is possible to form a triangle! ");
            if(l1 == l2 && l2 == l3) {
                System.out.println("Equilateral triangle");
            }
            else if (l1 == l2 || l1 == l3 || l2 == l3) {
                System.out.println("Isosceles triangle!");
            }
            else {
                System.out.println("Scalene triangle!");
            }
        }
        else {
            System.out.println("It is not possible to form a triangle!");
        }
    }
}

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.nextLine();
        if(a.equalsIgnoreCase("f")) {
            System.out.println("Feminine");
        }
        else if(a.equalsIgnoreCase("m")) {
            System.out.println("Masculine");
        }
        else {
            System.out.println("Invalid sex!");
        }
    }
}

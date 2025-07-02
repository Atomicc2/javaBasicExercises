import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What shift do you study?");
        String n = scan.next();
        if(n.equalsIgnoreCase("m")) {
            System.out.println("Good morning!");
        }
        else if(n.equalsIgnoreCase("a")) {
            System.out.println("Good afternoon!");
        }
        else {
            System.out.println("Good night!");
        }
    }
}

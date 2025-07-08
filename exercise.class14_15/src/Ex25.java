import java.util.Scanner;

public class Ex25 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = 0;
        String[] resp = new String[5];
        System.out.println("Did you call the victim?");
        resp[0] = scan.next();
        System.out.println("Where you near the crime scene?");
        resp[1] = scan.next();
        System.out.println("Do you live near the victim?");
        resp[2] = scan.next();
        System.out.println("Should it be for the victim?");
        resp[3] = scan.next();
        System.out.println("Have you worked with the victim?");
        resp[4] = scan.next();
        for(int i = 0; i < 5; i++) {
            if("yes".equalsIgnoreCase(resp[i])) {
                count++;
            }
        }
        if(count > 4) {
            System.out.println("Assassin");
        } else if(count > 2) {
            System.out.println("Accomplice");
        } else if(count > 1) {
            System.out.println("Suspect");
        } else {
            System.out.println("Innocent");
        }
    }
}

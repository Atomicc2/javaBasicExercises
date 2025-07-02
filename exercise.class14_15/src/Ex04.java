import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        if("aeiou".contains(a.toLowerCase())) {
            System.out.println("Is vowel!");
        }
        else {
            System.out.println("Is consonant!");
        }
    }
}

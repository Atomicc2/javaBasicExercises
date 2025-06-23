import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input your sex: ");
        String sex = scan.nextLine();
        System.out.println("Input you height: ");
        double height = scan.nextDouble();
        System.out.println("Input you weight");
        double weight = scan.nextDouble();
        double idealWeight;
        if(sex.equals("M")) {
            idealWeight = 72.7 * height - 58;
        }
        else {
            idealWeight = 62.1 * height - 44.7;
        }
        if (idealWeight == weight) {
            System.out.println("You are at your ideal weight!");
        }
        else if (idealWeight < weight) {
            System.out.println("You are over your ideal weight!");
        }
        else {
            System.out.println("You are below your ideal weight!");
        }
    }
}

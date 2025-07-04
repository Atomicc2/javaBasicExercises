import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double rating1 = scan.nextDouble();
        double rating2 = scan.nextDouble();
        double average = (rating1 + rating2) / 2;
        String concept;
        if(average >= 9) {
            concept = "A";
        }
        else if(average >= 7.5) {
            concept = "B";

        }
        else if(average > 6) {
            concept = "C";
        }
        else if(average > 4) {
            concept = "D";
        }
        else {
            concept = "E";
        }
        if(concept.equals("A") || concept.equals("B") || concept.equals("C")) {
            System.out.printf("Approved!\nConcept: %s\n", concept);
        }
        else {
            System.out.printf("Reproved!\nConcept: %s\n", concept);
        }
    }
}

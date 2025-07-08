import java.util.Scanner;

public class Ex27 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double strawberry = scan.nextDouble();
        double apple = scan.nextDouble();
        double price = 0;
        if(strawberry <= 5) {
            price += strawberry * 2.5;
        } else {
            price += strawberry * 2.2;
        }
        if(apple <= 5) {
            price += apple * 1.8;
        } else {
            price += apple * 1.5;
        }
        if(strawberry + apple > 8 || price > 25) {
            price -= price * 0.1;
        }
        System.out.println(price);
    }
}
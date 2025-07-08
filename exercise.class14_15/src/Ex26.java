import java.util.Scanner;

public class Ex26 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String type = scan.next();
        double liters = scan.nextDouble();
        double price = 0;
        if("g".equalsIgnoreCase(type)) {
            price = liters * 2.5;
            if(liters <= 20) {
                price -= price * 0.04;
            } else {
                price -= price * 0.06;
            }
        } else {
            price = liters * 1.9;
            if(liters <= 20) {
                price -= price * 0.03;
            } else {
                price -= price * 0.05;
            }
        }
        System.out.println(price);

    }
}

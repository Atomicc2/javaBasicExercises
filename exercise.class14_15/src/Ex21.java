import java.util.Scanner;

public class Ex21 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input the withdrawal amount: ");
        int value = scan.nextInt();
        int hundred = 0, fifty = 0, ten = 0, five = 0, one = 0;
        if(value >= 100) {
            hundred = value /100;
            value -= hundred * 100;
        }
        if(value >= 50) {
            fifty = value / 50;
            value -= fifty * 50;
        }
        if(value >= 10) {
            ten = value /10;
            value -= ten * 10;
        }
        if(value >= 5) {
            five = value / 5;
            value -= five * 5;
        }
        if(value >= 1) {
            one = value;
        }
        System.out.printf("%d hundred(s), %d fifty(s), %d ten(s), %d five(s), %d one(s)", hundred, fifty, ten, five, one);
    }
}

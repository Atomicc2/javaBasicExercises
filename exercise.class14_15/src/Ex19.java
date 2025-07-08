import java.util.Scanner;

public class Ex19 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        String unit = "unit", ten = "ten", hundred = "hundred";
        int numbTen = 0, numbHundred = 0, numbUnit = 0;
        if(number >= 100) {
            numbHundred = number / 100;
            number -= 100 * numbHundred;
        }
        if(number >= 10) {
            numbTen = number / 10;
            number -= numbTen * 10;
        }
        numbUnit = number;
        if(numbUnit > 1) {
            unit = "units";
        }
        if(numbTen > 1) {
            ten = "tens";
        }
        if(numbHundred > 1) {
            hundred = "hundreds";
        }
        System.out.printf("%d %s %d %s %d %s", numbUnit, unit, numbTen, ten, numbHundred, hundred);

    }
}

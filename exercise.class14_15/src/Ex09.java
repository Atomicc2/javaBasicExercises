import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;

public class Ex09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Integer[] list = new Integer[3];
        for(int i = 0; i < 3; i++) {
            list[i] = scan.nextInt();
        }
        Arrays.sort(list, Collections.reverseOrder());
        for(int i = 0; i < list.length; i++) {
            System.out.println(list[i] + " ");
        }
    }
}

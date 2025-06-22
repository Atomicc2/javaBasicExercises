import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o valor da hora trabalhada: ");
        double valorHora = scan.nextDouble();
        System.out.print("Agora as horas trabalhadas no mês: ");
        int hora = scan.nextInt();
        System.out.printf("Você vai receber %.2f esse mês!", hora * valorHora);
    }
}

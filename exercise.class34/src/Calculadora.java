public class Calculadora {

    public static double somar(double a, double b) {
        return a + b;
    }

    public static double subtrair(double a, double b) {
        return a - b;
    }

    public static double multiplicar(double a, double b) {
        return a * b;
    }

    public static double dividir(double a, double b) {
        if(b == 0) throw new ArithmeticException("Erro! Divisão por zero!");
        return a / b;
    }

    public static double potencia(double a, double b) {
        return Math.pow(a, b);
    }

    public static double fatorial(double a) {
        if(a == 0) {
            return 1;
        }
        return a * fatorial(a - 1);
    }
}

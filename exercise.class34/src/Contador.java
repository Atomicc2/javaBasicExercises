public class Contador {
    private static int valorAtual;

    public Contador() {
        valorAtual++;
    }

    public static void zerarContador() {
        valorAtual = 0;
    }

    public static void incrementa() {
        valorAtual++;
    }

    public static int getValorAtual() {
        return valorAtual;
    }

    public static void setValorAtual(int valorAtual) {
        Contador.valorAtual = valorAtual;
    }

}

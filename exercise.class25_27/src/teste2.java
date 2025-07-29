public class teste2 {
    public static void main(String[] args) {
        Lampada2 lampada = new Lampada2();
        lampada.cor = "Amarela";
        lampada.garantiaMeses = 12;
        lampada.modelo = "Abajur";
        System.out.println(lampada.ligar());
        System.out.println(lampada.desligar());
    }
}

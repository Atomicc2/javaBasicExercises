public class Lampada2 {
    String modelo;
    String cor;
    int garantiaMeses;
    int wats;
    boolean onOff;

    public String ligar() {
        this.onOff = true;
        return "A lampada ligou!";
    }

    public String desligar() {
        this.onOff = false;
        return "A lampada desligou!";
    }


}

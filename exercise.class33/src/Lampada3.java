public class Lampada3 {
    private String modelo;
    private String cor;
    private int gatantiaMeses;
    private int watz;
    private boolean estado;

    public void ligar() {
        setEstado(true);
    }

    public void desligar() {
        setEstado(false);
    }

    public void mostrarEstado() {
        setEstado(!isEstado());
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getGatantiaMeses() {
        return gatantiaMeses;
    }

    public void setGatantiaMeses(int gatantiaMeses) {
        this.gatantiaMeses = gatantiaMeses;
    }

    public int getWatz() {
        return watz;
    }

    public void setWatz(int watz) {
        this.watz = watz;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
}

package singleton;

public class Quadrado{

    private int tamLados;

    private Quadrado() {
    }

    public static Quadrado getInstancia() {
        return new Quadrado();
    }

    public void setTamLados(int tamLados) {
        this.tamLados = tamLados;
    }

    public int getTamLados() {
        return this.tamLados;
    }

    @Override
    public String toString() {
        return "Quadrado com tamanho dos lados = "+getTamLados();
    }
}
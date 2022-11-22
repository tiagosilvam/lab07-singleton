package singleton;

public class Circulo{

    private static Circulo circulo = null;
    public int raio;

    private Circulo() {
    }

    public static Circulo getInstancia() {
        if(circulo == null) {
            circulo = new Circulo();
        }
        return circulo;
    }

    public void setRaio(int raio) {
        this.raio = raio;
    }

    public int getRaio() {
        return this.raio;
    }

    @Override
    public String toString() {
        return "Circulo com raio = "+getRaio();
    }
}
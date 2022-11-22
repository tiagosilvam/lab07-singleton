package singleton;

import enums.TipoTriangulo;

public class TrianguloEquilatero extends Triangulo{

    private int tamLados;

    private TrianguloEquilatero() {
    }

    public static Triangulo getInstancia() {
        Triangulo equilatero = triangulosInstancias.get(TipoTriangulo.EQUILATERO);

        if(equilatero == null) {
            equilatero = new TrianguloEquilatero();
            triangulosInstancias.put(TipoTriangulo.EQUILATERO, equilatero);
        }
        return equilatero;
    }

    public void setTamLados(int tamLados) {
        this.tamLados = tamLados;
    }

    public int getTamLados() {
        return this.tamLados;
    }

    @Override
    public String toString() {
        return "Triângulo Equilátero com tamanho de lados = "+getTamLados();
    }
}

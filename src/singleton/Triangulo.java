package singleton;

import java.util.HashMap;

import enums.TipoTriangulo;

public abstract class Triangulo{

    protected static final HashMap<TipoTriangulo, Triangulo> triangulosInstancias = new HashMap<TipoTriangulo, Triangulo>();

    Triangulo() {
    }

    public int qntInstancias() {
        return triangulosInstancias.size();
    }
}
package Semana3.Investigacion;

public class Cuadrado extends Figura {
    private int lado;

    public Cuadrado(String tipo, int lado){
        super(tipo);

    }
// setters and getters
    public void setLado(int lado) {
        this.lado = lado;
    }

    public int getLado() {
        return lado;
    }

    // implementacion del metodo area


    @Override
    public double area() {
        return this.lado * this.lado;
    }
}

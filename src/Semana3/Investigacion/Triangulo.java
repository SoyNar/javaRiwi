package Semana3.Investigacion;

public class Triangulo  extends Figura{
    private int base, altura;
    // constructor
    public Triangulo(String tipo, int base, int altura){
        super(tipo);
        this.setBase( base);
        this.setAltura(altura);

    }

    //getter and setter


    public void setAltura(int altura) {
        this.altura = altura;
    }

    public void setBase(int base) {
        this.base = base;
    }

    @Override
    public double area() {
        return (double) this.base * this.altura /2;
    }
}

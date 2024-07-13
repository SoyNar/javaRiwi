package Semana3.Investigacion;

public  abstract class Figura {
    private String tipo;

    // getter y setter


    public String getTipo() {
        return tipo;
    }

    // constructor
    public Figura(String tipo){
        this.tipo = tipo;
    }

    // metodo abstracto
    public abstract double area();




}

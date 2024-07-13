package Semana3.Investigacion;

public class Main {

    public void polimorfirmo(Figura redonda){
        System.out.println("tipo: "+ redonda.getTipo());
        System.out.println("Area: " + redonda.area());
    }

    public static void main(String[] args) {
        Main main = new Main();
        Triangulo triangulo = new Triangulo("Triangulo", 12,43);
        Cuadrado cuadrado = new Cuadrado("Cuadrado", 4);
        main.polimorfirmo(triangulo);
        main.polimorfirmo(cuadrado);
    }
}

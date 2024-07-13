package Semana2.bucles;

public class TablaMultiplicar {
    public static void multiplicar(int numeroUser){
        int multiplicacion = 0;
        for(int i =1; i<11; i++){
            for(int j=0; j<i;j++){
                multiplicacion += numeroUser;

            }  System.out.println(numeroUser + "x" + i + "=" + multiplicacion);


        }
    }

    public static void main(String[] args) {
        multiplicar(15);
    }
}

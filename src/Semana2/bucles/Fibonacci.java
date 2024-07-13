package Semana2.bucles;

public class Fibonacci {
    public static void numerosFibonacci(int numero){
        int a = 1;
        int b = 0;
        int c;
        for(int i=0; i<numero;i++){
            System.out.println(b);
            c = a+b;
            a = b;
            b = c;


        }
    }

    public static void numeroFibonacciARray(int numero){
        // inicializar el array con n elementos
        // el usuario los pondrá
        int [] numeros = new int[numero];
        // iniciar las varaibles para guardar valores del array
        int n ;
        int n1;
        // guardar por defecto valores n-1 y n-2
        numeros[0] = 0;
        numeros[1] = 1;
        for(int i=2; i< numeros.length; i++){

            // guardar cada valor n-1 y n-2 generado en el array
            n1 = numeros[i-1];
            n = numeros[i-2];
            // sumar y poner el nuevo valor en la posicion
          numeros[i] = n1+n;

        } for(int j = 0; j < numeros.length; j++){ // recorre el array con los valores e imprime
            System.out.println(numeros[j]);
        }
    }

    public static void main(String[] args) {
//        numerosFibonacci(10);
        numeroFibonacciARray(15);
    }
}

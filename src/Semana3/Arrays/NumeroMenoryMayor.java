package Semana3.Arrays;

import java.util.Scanner;

public class NumeroMenoryMayor {

    public static void main(String[] args) {
        Scanner entradaDatos = new Scanner(System.in);
        int[]numeros = new int[5];



        for (int i=0; i<numeros.length;i++){
            System.out.println("ingresa numero" + (i+1));
            numeros[i] = entradaDatos.nextInt();

        }
        int mayor = numeros[0];
        int menor =numeros[0];

        for(int i=0; i<numeros.length; i++){
            if(numeros[i]> mayor){
                mayor= numeros[i];
            } if(numeros[i]<menor){
                menor = numeros[i];
            }
        }
        System.out.println( "Menor: "+ menor);
        System.out.println("Mayor: "+mayor);
    }
}

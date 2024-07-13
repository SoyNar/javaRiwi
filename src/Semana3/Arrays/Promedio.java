package Semana3.Arrays;

import java.util.Scanner;

public class Promedio {

    //1. Calculadora de Promedios: Escribe un programa que utilice un array de tipo
    //double para almacenar las calificaciones finales de 10 estudiantes en un curso. El
    //programa debe calcular y mostrar el promedio de estas calificaciones.

    public static double calculaPromedio( double[] calificaciones){

        double promedio = 0;

        // llenar array
        for(int i = 0; i<calificaciones.length;i++){

            promedio += calificaciones[i];

        }
        return  promedio/ calificaciones.length;
    }

    public static void main(String[] args) {
        Scanner entradaDeDatos = new Scanner(System.in);
        double[] calificaciones = new double[10];


        System.out.println("ingresa 10 calificaciones");
       for(int i= 0; i<calificaciones.length; i++){
           System.out.println("ingresa tu nota " + (i+1));
           calificaciones[i] = entradaDeDatos.nextDouble();
       }

      double promedio = calculaPromedio(calificaciones);
        System.out.println("promedio : " + promedio);

    }

}

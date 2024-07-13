package Semana3.Arrys2;

import java.util.Scanner;

public class PromedioNotas {
//    /Crea un programa que calcula la calificación promedio que se necesita
//    obtener en las notas faltantes de un curso para aprobarlo,
//    considerando la cantidad de calificaciones totales, las calificaciones ya
//    obtenidas, el puntaje mínimo requerido para aprobar y la cantidad de
//    notas faltantes. Importante: el total de notas del curso será de 8 notas,
//    la calificación será de 0 a 100 y el promedio mínimo para aprobar el
//    curso es de 76



    public static void main(String[] args) {
        Scanner entradaDatos = new Scanner(System.in);
        double [] calificaciones = new double[8];
        double totalNotas = 8;
        double promedioMinimo = 76;
        double sumaNotasObtenidas = 0;
        double notasFaltantes = 0;
        double promedioFaltante =0;
        double promedioActual = 0;
        int numeroNotas;


        System.out.println("cuantas notas tienes");
        numeroNotas = entradaDatos.nextInt();

        for (int i=0; i<numeroNotas; i++){
            System.out.println("ingresa la nota: " + (i+1));
             calificaciones[i] = entradaDatos.nextDouble();
             sumaNotasObtenidas += calificaciones[i];
        }
       notasFaltantes = totalNotas - numeroNotas;
  if(notasFaltantes > 0){
      promedioFaltante = ((promedioMinimo * totalNotas)- sumaNotasObtenidas)/notasFaltantes;
      System.out.println("promedio necesario en las notas faltantes: " + promedioFaltante);
  }
  entradaDatos.close();
    }
}

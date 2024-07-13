package Semana3.Arrays;

import java.util.Scanner;

public class SistemaReservas {
    /*Sistema de Reservas: Desarrolla un programa para un teatro para gestionar las
reservas de asientos. El teatro tiene 5 filas con 10 asientos cada una. Utiliza un
arreglo bidimensional de boolean donde true representa un asiento ocupado y false
uno disponible. El sistema debe permitir:
 Reservar y cancelar asientos.
 Mostrar los asientos disponibles.
 Contabilizar el total de asientos ocupados y disponibles.*/

    public static void main(String[] args) {
        boolean[][] asientos = new boolean[5][10];
        int numerofilas;
        int numeroColumnas;
        Scanner entradaDeDatos = new Scanner(System.in);
        int opcion = 0;
        String menu = """
                Menu Sitema de reservas
                1. reservar
                2. cancelar
                3. mostrar disponible
                4. total disponibles
                5. total ocupados
                6.salir
                """;
        // opciones

        while(opcion !=6){
            System.out.println(menu);
            opcion = entradaDeDatos.nextInt();
            switch (opcion){
                case 1:

                    System.out.println("ingresa la fila: ");
                    numerofilas = entradaDeDatos.nextInt();
                    numerofilas --;
                    System.out.println("ingresa el numero de asiento");
                    numeroColumnas = entradaDeDatos.nextInt();
                    numeroColumnas --;
                    if(numeroColumnas < 0 || numerofilas <0){
                        System.out.println("numero de asiento invalido");
                    }else
                    if(!asientos[numerofilas][numeroColumnas] ){
                        asientos[numerofilas][numeroColumnas] = true;
                        System.out.println("Reservado con exito");
                    } else {
                        System.out.println("asiento ocupado");
                    }
                    break;

                default:
                    System.out.println("opcion no valida");
                    break;
            }
        }

        }
    }



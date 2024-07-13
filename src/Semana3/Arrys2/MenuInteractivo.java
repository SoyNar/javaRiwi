package Semana3.Arrys2;

import java.util.Scanner;

public class MenuInteractivo {
    /* Este ejercicio propone la creación de un programa que presente al
usuario un menú interactivo para realizar operaciones matemáticas
básicas como suma, resta, multiplicación y división.*/


    public static int operacionesNumeros (int numero1, int numero2, int opcion){
        switch (opcion){
            case 1: return numero1+numero2;

            case 2: return  numero1 - numero2;

            case 3: return  numero1 * numero2;
            case 4: if(numero1 == 0){
                throw new ArithmeticException("no se puede dividir por cero");
            } return  numero1 / numero2;
            default:
                throw new ArithmeticException("error");
        }
    }

    public static void main(String[] args) {

        // menu de opciones
        Scanner entradaDatos = new Scanner(System.in);

        String menu= """
        Escoja una opcion:
        1. sumar
        2. restar
        3. multiplicar
        4. dividir
        """;

// entrada de datos de usuario
        System.out.println("elija una opcion");
        int opcion = entradaDatos.nextInt();

        System.out.println("ingrese numero 1");
        int numeroUno = entradaDatos.nextInt();

        System.out.println("ingrese numero dos");
        int numeroDos = entradaDatos.nextInt();


// methodo para realizar las operaciones
        int operacion = operacionesNumeros(numeroUno, numeroDos, opcion);
        System.out.println(operacion);
    }

}

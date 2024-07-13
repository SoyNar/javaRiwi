package com.riwi.practica;

import java.util.Scanner;

public class Juego {

    public static boolean validarPrimo(int numero) {
        boolean isPrimo = true;
        for (int i =2; i < numero; i++) {
            int primo = i;
            if(numero%primo == 0){
                isPrimo = false;
            }
        }
      return isPrimo;
    }




    public static void main(String[] args) {
        Scanner entradaDatos = new Scanner(System.in);
        System.out.println("ingresa un numero");
        int numerro = entradaDatos.nextInt();
        boolean esPrimo= validarPrimo(numerro);
        if(esPrimo){
            System.out.println("es primo");
        }else{
            System.out.println("no primo");
        }

    }






}

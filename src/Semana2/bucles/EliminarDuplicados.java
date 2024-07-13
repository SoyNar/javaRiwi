package Semana2.bucles;

import java.util.Scanner;

public class EliminarDuplicados {

    public static String eliminarDuplicados(String frase){
        String[] palabras =  frase.toLowerCase().split(" "); // frase en minuscula, separadas por palabras con split
        String palabrasUnicas = "";
        for(int i = 0; i< palabras.length; i++){
            String palabrasSeparadas = palabras[i];
            if(!palabrasUnicas.contains(palabrasSeparadas)){ // verificar si la palabra separadas, esta dentro de frases unicas
                palabrasUnicas += palabrasSeparadas + " ";
            }
        }
        return palabrasUnicas.trim(); // eliminar espacio al final
    }
    public static void main(String[] args) {
        Scanner entradaDeDatos = new Scanner(System.in);
        System.out.println("ingresa una frase");
        String frase = entradaDeDatos.nextLine();
        String eliminarDuplicados = eliminarDuplicados(frase);
        System.out.println(eliminarDuplicados);
    }
}
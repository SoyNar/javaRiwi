package Semana3.Arrys2;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.ArrayList;
import java.util.Scanner;

public class BuscarPalabras {



    public static void main(String[] args) {
        // entrada de datos
        Scanner entradaDatos = new Scanner(System.in);
        int posicion; // para guardar la posicion de array
        ArrayList<String> palabras = new ArrayList<>(); // inicializacion del arraylist
        for(int i=0; i<3; i++){ // recorrer el arraylist para ingresar las palabras
            System.out.println("ingrese las palabas ");
            String palabra = entradaDatos.nextLine();
             palabras.add(palabra);
        }

        System.out.println("ingrese la palabra que busca"); /// pedir la palabra
        String palabraBuscada = entradaDatos.nextLine();
        posicion = palabras.indexOf(palabraBuscada); // guardar la posicione con el metodo indexof

       // validacion si la palabra contenida dentro del array, con el metodo contains de la clase String
            if(palabras.contains(palabraBuscada)){
                System.out.println("se encontro coincidencia en la posicon:" + posicion);
            }else{
                System.out.println("la palabra no se encuentra");
            }

    }
}

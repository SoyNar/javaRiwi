package Semana2.bucles;

import java.util.Scanner;

public class Repetidos {
    //Cree un programa que pida al usuario una frase e imprima la vocal
    //más repetida y la consonante más repetida.





        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Ingresa una frase: ");
            String frase = scanner.nextLine();

            // Declarar un arreglo de caracteres
            char[] caracteres = new char[frase.length()];

            // Copiar los caracteres de la cadena al arreglo
            for (int i = 0; i < frase.length(); i++) {
                caracteres[i] = frase.charAt(i);
            }

            // Inicializar contadores
            int vocalMasRepetida = ' ';
            int cantidadMaximaVocal = 0;
            int consonanteMasRepetida = ' ';
            int cantidadMaximaConsonante = 0;

            // Recorrer el arreglo de caracteres
            for (char letra : caracteres) {
                if (letra >= 'a' && letra <= 'z') { // Verificar si es una letra
                    if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                        // Es una vocal
                        if (cantidadMaximaVocal < 1) {
                            vocalMasRepetida = letra;
                            cantidadMaximaVocal = 1;
                        } else if (letra == vocalMasRepetida) {
                            cantidadMaximaVocal++;
                        }
                    } else {
                        // Es una consonante
                        if (cantidadMaximaConsonante < 1) {
                            consonanteMasRepetida = letra;
                            cantidadMaximaConsonante = 1;
                        } else if (letra == consonanteMasRepetida) {
                            cantidadMaximaConsonante++;
                        }
                    }
                }
            }

            System.out.println("La vocal más repetida es: " + vocalMasRepetida );
            System.out.println("La consonante más repetida es: " + consonanteMasRepetida);
        }
    }


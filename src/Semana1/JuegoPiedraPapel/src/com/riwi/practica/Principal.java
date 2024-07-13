package com.riwi.practica;

import java.security.spec.RSAOtherPrimeInfo;
import java.time.LocalDate;
import java.util.Random;
import java.util.Scanner;

public class Principal {



    // Método para cifrar el mensaje
    public static String cifrarCesar(String mensaje, int desplazamiento) {
        String mensajeCifrado = "";

        // recorre el mensaje con un loop for
        for (int i = 0; i < mensaje.length(); i++) {
            char caracter = mensaje.charAt(i); // guarda cada caracter del mensaje recorrido
// validar si el mensaje esta en mayusculas
            if (caracter >= 'A' && caracter <= 'Z') {  // compara si el caracter esta en el rango unicode de  A a Z
                // Aplicar el desplazamiento
                //
                char cifrado = (char) (caracter + desplazamiento);  // le sumamos el desplazamiento al caracter
                // Ajustar si se pasa de 'Z'
                if (cifrado > 'Z') {  // si el caracter excede la longitud Z
                    cifrado -= 26;   // restamos 26 para que vuelva a 0
                }
                mensajeCifrado += cifrado;  // sumamos el caracter a la frase / cadena de caracteres

                // validar si el mensaje esta en minusculas
            } else if (caracter >= 'a' && caracter <= 'z') { // si el caracter esta en codigo de minusculas
                // Aplicar el desplazamiento
                char cifrado = (char) (caracter + desplazamiento); // sumamos el desplazamiento
                // Ajustar si se pasa de 'z'
                if (cifrado > 'z') {  // validamos si excede la longitud
                    cifrado -= 26;   // restamos 26 para volver a 0 o a
                }
                mensajeCifrado += cifrado; // sumamos ese caracter al mensaje
            } else {
                mensajeCifrado += caracter;
            }
        }

        return mensajeCifrado; // retorna los caracteres concatenados
    }

    // Método para descifrar el mensaje
    public static String descifrarCesar(String mensaje, int desplazamiento) {
        // El descifrado es el cifrado con el desplazamiento en dirección opuesta
        return cifrarCesar(mensaje, -desplazamiento);
    }


    public static boolean validatePassword(String password) {
        boolean contieneMayus = false;

        for (int i = 0; i < password.length(); i++) {
            char cadenaPassword = password.charAt(i);

           if(cadenaPassword >= 'A' && cadenaPassword <= 'Z'){
               contieneMayus = true;
           }
        }
  return  contieneMayus;
    }
public  static boolean contieneMinuscula (String password){
        boolean contieneMinnuscula = false;
        for (int i = 0; i<password.length(); i++){
            char cadenaPasword = password.charAt(i);

            if(cadenaPasword >= 'a' && cadenaPasword <= 'z'){
                contieneMinnuscula = true;
            }
        }
        return  contieneMinnuscula;
}

public static boolean contieneCaracteres (String password){
        boolean contienecaracteres = false;
        for(int i = 0; i<password.length(); i++){
            char cadenaPassword = password.charAt(i);
            if(cadenaPassword >='0' && cadenaPassword <='9'){
                contienecaracteres = true;
            }
        }
        return  contienecaracteres;
}


    public static void calcularEdad(int anioCumple, int anioActual, int mesActual, int mesCumple) {
        int edad = 0;
        if (anioActual > 0 && anioCumple >0 && anioCumple < 2025) {


            if(mesActual > 0 && mesActual<13 && mesCumple > 0 && mesCumple <13){
                edad = (anioActual- anioCumple);
                if(mesActual < mesCumple){
                    edad = (anioActual- anioCumple) -1;
                }
                System.out.println(edad);
            } else {
                System.out.println("mes invalido");
            }

        } else {
            System.out.println("año no valido");
        }
        }
    //juego piedra papel o tijera



    public static void main(String[] args) {
        Scanner entradaDatos = new Scanner(System.in);
//        Random numeroAleatorio = new Random();
//        String jugada = "";

//        System.out.println("bienvenido al juego de piedra papel o tijera");
//        System.out.println("Elige tu jugada: Piedra, papel o tijera");
//        String jugadaUser = entradaDatos.nextLine();

//        int numeroMaquina = numeroAleatorio.nextInt(3);
//        if (numeroMaquina == 0) {
//            jugada = "piedra";
//        } else if (numeroMaquina == 1) {
//            jugada = "papel";
//        } else {
//            jugada = "tijera";
//        }
//        System.out.println("Eleccion Maquina: " + jugada);
//
//        if (jugadaUser.equals(jugada)) {
//            System.out.println("empate");
//        } else if (jugadaUser.equals("piedra") && jugada.equals("tijera") || (jugadaUser.equals("tijera") && jugada.equals("papel")) ||
//                (jugadaUser.equals("papel") && jugada.equals("piedra"))) {
//            System.out.println("ganaste");
//        }else {
//            System.out.println("gané");
//        }

//        System.out.println("escribe año nacimiento ");
//        int anioNacimiento = entradaDatos.nextInt();
//
//        System.out.println("anio actual ");
//        int anioCumple = entradaDatos.nextInt();
//
//        System.out.println("escribe mes actual");
//        int mesActual = entradaDatos.nextInt();
//
//        System.out.println("escribe mes cumple");
//        int mesCumple = entradaDatos.nextInt();
//
//
//
//         calcularEdad(anioNacimiento,anioCumple,mesActual,mesCumple);

        // contraseña segura

//        System.out.println("ingrese la contraseña");
//        String segura = entradaDatos.nextLine();
//        boolean validar = validatePassword(segura);
//        boolean validaMinus = contieneMinuscula(segura);
//        boolean contieneCaracter = contieneCaracteres(segura);
//        if( segura.length() > 8 && validar && validaMinus && contieneCaracter ){
//            System.out.println("contraseña segura");
//        } else{
//            System.out.println("contraseña insegura");
//        }

//
//   cifrar mensaje
        System.out.println("escriba su frase");
        String frase = entradaDatos.nextLine();
        String menu = """
                1. Cifrar
                2. Decifrar
                """;
        System.out.println(menu);
        System.out.println("elige una opcion");
        int opcion = entradaDatos.nextInt();
        System.out.println("elige el desplazamiento");
        int desplazamiento = entradaDatos.nextInt();

        String decifrar = descifrarCesar(frase,desplazamiento);
        String cifrar =  cifrarCesar(frase,desplazamiento);

        if(opcion > 0 && opcion==1){
            System.out.println("Mensaje cifrado");
            System.out.println(cifrar);

        } else  if( opcion >0 && opcion ==2){
            System.out.println("mensaje Decifrado");
            System.out.println(decifrar);
        }else{
            System.out.println("escoje una opcion valida");
        }




    }
}



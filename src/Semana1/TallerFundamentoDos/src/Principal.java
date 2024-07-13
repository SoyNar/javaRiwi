import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        // Crea un programa que valide si una contraseña es segura o no, que
        //responda con un booleano. (Una contraseña segura debe contener
        //mínimo 8 caracteres con al menos 1 mayúscula, 1 minúscula y 1
        //carácter espacial)

//       String password;
        Scanner entradaDatos = new Scanner(System.in);
//
//        System.out.println("ingrese su contraseña");
//        password = entradaDatos.nextLine();
//
//        VerificarPassword verifica  = new VerificarPassword();

        //Crea un programa que pida al usuario un carácter e imprima en
        //consola si es una consonante, vocal o carácter especial.
        char caracter;
        System.out.println("ingrese un caracter");
        caracter = entradaDatos.next().charAt(0);
        if(caracter == 'a' || caracter == 'e' || caracter == 'i'|| caracter == 'o' || caracter == 'u'){
            System.out.println("vocal");
        }else  if(caracter >= 'a' && caracter <= 'z') {
            System.out.println("consonante");

        }else {
            System.out.println("no es una letra");
        }

    }
}

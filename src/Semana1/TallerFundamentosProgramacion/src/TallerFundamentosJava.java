import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class TallerFundamentosJava {
    // Calculadora Basica

    public static void main(String[] args) {
        Scanner entradaDatos = new Scanner(System.in);
//        int numeroUno, numeroDos, numeroTres, suma, resta, multiplicacion;
//        // calculadora basica
//        System.out.println("ingresa numero uno");
//        numeroUno = entradaDatos.nextInt();
//        System.out.println("ingresa numero dos");
//        numeroDos = entradaDatos.nextInt();
//
//        suma = numeroUno + numeroDos;
//        resta = numeroUno - numeroDos;
//        multiplicacion = numeroUno * numeroDos;
//
//        System.out.println("suma" + suma + "division" + "resta" + resta + "multiplicacion" + multiplicacion);
//        System.out.println("escriba su e dad");
//        int edad = entradaDatos.nextInt();
//
//        mayorEdad(edad);
//
//        // convertidor kilometros
//
//        System.out.println("escriba los kilometros");
//        double kilometros = entradaDatos.nextDouble();
//        double convertir = conversorMillas(kilometros);
//        System.out.println(" el resultado es:" + convertir);
//
//
//        // calcular indice de masa muscular
//        System.out.println("escribe los tu peso");
//        double peso = entradaDatos.nextDouble();
//        System.out.println("escribe tu altura");
//        int altura = entradaDatos.nextInt();
//        double calcularImc = calcularImc(peso, altura);
//        System.out.println("tu indice de masa muscular es:" + calcularImc);
//
//        // clasificador de numeros
//
//        System.out.println("ingrese el numero");
//        int numeroClasificar = entradaDatos.nextInt();
//        classificarNumeros(numeroClasificar);
//
//        // calculadora dias del mes
//
//        System.out.println("esccribe el mes");
//        int mes = entradaDatos.nextInt();
//        String calculoDias = calculadoraMes(mes);
//        System.out.println(calculoDias);
//
//        // menu interactivo
//
//        System.out.println("Elige una opcion");
//        int opcion = entradaDatos.nextInt();
//        if (opcion == 1) {
//            System.out.println("ingersa un numero");
//            int numeroUno = entradaDatos.nextInt();
//            System.out.println("ingresa numero dos");
//            int numeroDos = entradaDatos.nextInt();
//
//            System.out.println("resultado es" + numeroUno + numeroDos);
//        }
//
//        // promedio
//
//        System.out.println("ingrese la nota uno");
//        double notaUno = entradaDatos.nextDouble();
//        System.out.println("ingrese nota dos");
//        double notaDos = entradaDatos.nextDouble();
//        System.out.println("ingresa la nota tres");
//        double notaTres = entradaDatos.nextDouble();
//        double calcularPromedio = calculaPromedio(notaUno, notaDos, notaTres);
//        if (calcularPromedio > 6) {
//            System.out.println("aprobado su nota es:" + calcularPromedio);
//        } else {
//            System.out.println(" reprobado su nota es:" + calcularPromedio);
//        }
//
//        // calculat propina
//
//        System.out.println("ingrese el valor total de la cuenta");
//        double cuenta = entradaDatos.nextDouble();
//        System.out.println("ingres el porcentaje");
//        int porcentaje = entradaDatos.nextInt();
//        double propina = calcularPropina(cuenta, porcentaje);
//        System.out.println(" el total de la propina es:" + propina);
//
//
//        // biciesto
//
//        System.out.println("ingrese el año");
//        int year = entradaDatos.nextInt();
//        boolean esBiciesto = esBiciesto(year);
//        if (esBiciesto) {
//            System.out.println("Es biciesto");
//        } else {
//            System.out.println("no es biciesto");
//        }
//
//        // calculadora de tarifa de taxi
//        System.out.println("escriba la distancia");
//        int distancia = entradaDatos.nextInt();
//        int calcularTaxi = tarifaTaxi(distancia);
//
//        // sistema calificaciones
//
//        System.out.println("ingrese su nota de 0 a 100");
//        int nota = entradaDatos.nextInt();
//        promedioCalificaciones(nota);

        /// ordenar numeros
        System.out.println("ingresa un numero");
        int numero1 = entradaDatos.nextInt();
        System.out.println("ingresa numero dos");
        int numero2 = entradaDatos.nextInt();
        System.out.println("ingresa numero tres");
        int numero3 = entradaDatos.nextInt();

        ordenaNumeros(numero1,numero2,numero3);
    }

    // verificar mayor de edad
    public static void mayorEdad(int edad) {
        if (edad >= 18 && edad < 120) {
            System.out.println("mayor de edad");
        }

    }


    // conversor unidades
    public static double conversorMillas(double kilometros) {
        double millas = 1.60954;
        return kilometros * millas;
    }

    //calculadora indice de masa muscular

    public static double calcularImc(double peso, int altura) {
        return peso / (altura * altura);
    }

    //clasificador de numeros

    public static void classificarNumeros(int numero) {
        if (numero < 0) {
            System.out.println(" el numero es negativo");

        } else if (numero > 0) {
            System.out.println("numero es positivo");
        } else {
            System.out.println("numero es cero");
        }
        if (numero % 2 == 0) {
            System.out.println("par");
        } else {
            System.out.println("impar");
        }
    }

    // calculadora dias del mes

    public static String calculadoraMes(int mes) {

        String diasMes = "";
        switch (mes) {
            case 1, 3, 7, 8, 10, 12:
                diasMes = "31 dias";
            case 4, 6, 9, 11:
                diasMes = "30 dias";
            case 2:
                diasMes = "28 o 29 dias";

        }

        return diasMes;
    }

    // promedio

    public static double calculaPromedio(double notaUno, double notaDos, double notaTres) {
        double promedio = notaUno + notaDos + notaTres;
        return promedio / 3;
    }


    public static double calcularPropina(double totalCuenta, int porcentaje) {
        return (totalCuenta * porcentaje) / 100;
    }

//año biciesto

    public static boolean esBiciesto(int year) {

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }


    // ordenar numeros


    // horoscopo

    public static String horoscopo(int dia, int mes) {
 String signoHoroscopo= "";
        switch (mes) {
            case 1:
                if (dia > 0 && dia <= 20) {
                    System.out.println("Capricornio");
                } else if (dia >= 21 && dia < 31) {
                    System.out.println("acuario");
                } else {
                    System.out.println("dia no valido");
                }
                break;
            case 2:
                if (dia > 0 && dia <= 18) {
                    System.out.println("acuario");
                } else if (dia >= 19 && dia <= 28) {
                    System.out.println("piscis");
                }

                break;
            case 3:

                if (dia > 0 && dia <= 20) {
                    System.out.println("piscis");
                } else if (dia >= 21 && dia <= 30) {
                    System.out.println("Aries");

                } else {
                    System.out.println("mes invalido");
                }
                break;

            case 4:
                if (dia > 0 && dia <= 19) {
                    System.out.println("aries");

                } else if (dia >= 20 && dia <= 30) {
                    System.out.println("Tauro");
                } else {
                    System.out.println("mes invalido");
                }
                break;
            case 5:
                if (dia > 0 && dia <= 21) {
                    System.out.println("Tauro");

                } else if (dia >= 22 && dia <= 31) {
                    System.out.println("Geminis");
                } else {
                    System.out.println("mes invalido");
                }
                break;

            case 6:
                if (dia > 0 && dia <= 22) {
                    System.out.println("Geminis");
                } else if (dia > 22 && dia <= 31) {
                    System.out.println("Geminis");
                } else {
                    System.out.println("mes invalido");
                }

                break;

            case 7:
                if (dia > 0 && dia <= 22) {
                    System.out.println("cancer");
                } else if (dia > 22 && dia <= 30) {
                    System.out.println("leo");
                } else {
                    System.out.println("dia invalido");
                }
                break;
            case 8:
                if (dia > 0 && dia <= 23) {
                    System.out.println("leo");
                } else if (dia > 23 && dia <= 30) {
                    System.out.println("Virgo");
                } else {
                    System.out.println("dia no valido");
                }
                break;
            case 9:
                if (dia > 0 && dia <= 24) {
                    System.out.println("Virgo");
                } else if (dia > 24 && dia <= 31) {
                    System.out.println("Libra");
                } else {
                    System.out.println("dia no valido");
                }
                break;
            case 10:
                if (dia > 0 && dia <= 23) {
                    System.out.println("libra");
                } else if (dia > 23 && dia <= 30) {
                    System.out.println("Escopio");
                }
                break;
            case 11:
                if (dia > 0 && dia <= 23) {
                    System.out.println("Escorpio");
                } else if (dia > 22 && dia <= 30) {
                    System.out.println("Sagitario");
                } else {
                    System.out.println("mes no valido");
                }
                break;
            case 12:
                if (dia > 0 && dia <= 22) {
                    System.out.println("Sagitario");
                } else if (dia > 22 && dia <= 31) {
                    System.out.println("Carpicornio");
                } else {
                    System.out.println("mes no valido");
                }
                break;
            default:

                System.out.println("no valido");
                break;

        }
return "";
    }

    // calcular tarifa taxi

    public static int tarifaTaxi(int distanticia){
        int kilometro = 3500;
        return kilometro * distanticia;
    }

// convertidor temperatura

    public static double convertirTemperatura(double f, double c, int opcion){
        if(opcion==1){
            return (f-32)*0.55;
        }else {
            return (c*1.8) + 32;
        }
    }
// sistema de calificaciones

    public static void promedioCalificaciones(int nota){
        if(nota >90 && nota < 100){
            System.out.println("A");
        } else  if(nota > 80 && nota <89 ){
            System.out.println("B");
        }else if(nota >50 && nota < 55){
            System.out.println("f");
        }
        System.out.println("D");
    }


    // ordenar tres numeros

    public static void  ordenaNumeros(int numeroUno, int numeroDos, int numeroTres){
        int guardar ;
        if(numeroUno > numeroDos){
            guardar = numeroUno;
            numeroUno = numeroDos;
            numeroDos= guardar;
        }
        if (numeroUno > numeroTres){
            guardar = numeroUno;
            numeroUno = numeroTres;
            numeroTres = guardar;
        }
        if(numeroDos > numeroTres){
            guardar = numeroDos;
            numeroDos = numeroTres;
            numeroTres = guardar;
        }
        System.out.println(" : "+numeroUno + "  : "+ numeroDos + " : "+ numeroTres);
    }



}

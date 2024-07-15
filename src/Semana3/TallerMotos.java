package Semana3;

import javax.swing.*;
import java.util.Scanner;

public class TallerMotos {

    // declarar array tridimensional
    public static String[][][] mechanic;
    // inicializar la matrix tridimencional de manera global


// principal para ejecutar las funcionalidades y correr el menu
    public static void main(String[] args) {
        Scanner dataEntry = new Scanner(System.in);
        int maxEmployees;
         int maxVhicles;

        int option;
        String menu = """
                 1. Agregar trabajo
                 2. Mostrar todos los vehiculos
                 3. Mostrar Vehiculos por estado
                 4. Buscar Vehiculo
                 5. Actualizar estado
                 6. Salir
       
                 """;
// llenar los datos //
        System.out.println("ingrese cantidad de empleados");
        maxEmployees = dataEntry.nextInt();

        System.out.println("ingrese numero de trabajos a registrar");
        maxVhicles = dataEntry.nextInt();
        mechanic  = new String[maxEmployees][maxVhicles][4];



        // menu
        do {
            System.out.println(menu);
            System.out.println("elije una opcion");
            option = dataEntry.nextInt();

            switch (option){
                case 1:
                    registerEmployee(dataEntry,maxEmployees,maxVhicles);

                    break;
                case 2:
                    imprimirDatos(maxEmployees, maxVhicles);
                    break;
                case 3:
                    System.out.println("escriba marca o modelo del vehiculo");
                    dataEntry.nextLine();
                    String brandOrModel = dataEntry.nextLine();
                    showVehicleByModel(brandOrModel);
                    break;
                case 4:
                    countVehicles(maxVhicles, maxEmployees);
                    break;
                case 5:
                    String brandModel2;
                    System.out.println("ingresa la marca o modelo");
                    dataEntry.nextLine();
                    brandModel2 = dataEntry.nextLine();

                    updateVehicle(brandModel2,dataEntry);
                    break;

                case 6:
                    System.out.println("saliendo del sistema");
                    break;
                default:
                    System.out.println("opcion invalida");
                    break;
            }

        } while (option != 6);

    }

    // metodo para registrar un trabajo
    public static void registerEmployee(Scanner dataEntry, int max, int maxVehicles){
        int typeIndex = 0;  // variable para validar el tipo de vehiculo que ingresara el usario de la app
        String brand;
        String modeloOfcar;
        String year;
        String status;
        // recorrer teniendo en cuenta el maximo ingresado por el user

       for(int i=0;i<max; i++){
           // validar si hay indice 0 de la primera dimension con dato null
           int index= 0;
           for(; index<maxVehicles; index++){
               if(mechanic[i][index][0] == null){
                   break;
               }
           }


           // verifica si hay espacio disponible para agregar mas trabajo
           // si el indice es mayor o igual a la longitud de la dimension
           // es porque no hay espacio
           if(index >= maxVehicles){
               System.out.println("No se puede agregar mas trabjo");
               return; // hace que el metodo deje de ejecutarse por completo
           }

           System.out.println("ingrese el nombre del empleado" + (i+1));
           dataEntry.nextLine();
           String employee = dataEntry.nextLine();
           // validar si excede la longitud del array
               dataEntry.nextLine();
               System.out.println("ingrese el tipo de vehiculo");
               String typeVehicle = dataEntry.nextLine();

               if(typeVehicle.equalsIgnoreCase("moto")){
                   typeIndex = 0;
               }else if(typeVehicle.equalsIgnoreCase("carro")) {
                   typeIndex = 1;
               } else {
                   System.out.println("ingrese vehiculo valido");
                   continue;
               }
               System.out.println("ingrese la marca");
               brand = dataEntry.nextLine();

               System.out.println("ingresa el modelo");
               modeloOfcar = dataEntry.nextLine();

               System.out.println("ingresa el año");
               year = dataEntry.nextLine();

               System.out.println("ingresa estado del auto (pendiente,Reparando,Reparado");
               status = dataEntry.nextLine();

               //guardar datos
               mechanic[i][typeIndex][0] = brand;
               mechanic[i][typeIndex][1] = modeloOfcar;
               mechanic[i][typeIndex][2] = year;
               mechanic[i][typeIndex][3] = status;

           }
    }
// metodo para imprimir datos

    public static void imprimirDatos(int maxEmployees, int maxVehicles) {
        System.out.println("Agenda de trabajos");
        System.out.println("");
        System.out.println("|Tipo|Marca|Modelo|Año|Estado|");
        // recorrer la matrix usando el tamaño ingrsado por user
        for (int i = 0; i < maxEmployees; i++) {

                for (int j = 0; j < maxVehicles; j++) {
                    if (mechanic[i][j][0] != null) { // usar estos indices generados para verificar si el elemento esta iniciado en null
                        // osea no tiene datos
                        String tipo = (j == 0) ? "Moto" : "Carro"; // imprimir segun el tipo de vehiculo
                        System.out.println("|" + tipo + "|" + mechanic[i][j][0] + "|" + mechanic[i][j][1] + "|" + mechanic[i][j][2] + "|" + mechanic[i][j][3] + "|");
                    }

            }
        }
    }

    // mostrar todos los vehiculos guardados
    // usando otro metodo que se encarga de buscar
    public static void showVehicleByModel(String brandOrModel){
         int[] index = findVehicle(brandOrModel); // guardar el array generado
         if(index != null){ // validar que el metodo index sea diferente de nukk
             // es decir que haya elemento encontrados
             System.out.println("|Tipo|Marca|Modelo|Año|Estado|");
             int firstSize = index[0];
             int secondSize = index[1];
             String type = (secondSize == 0 ) ? "Moto" : "Carro";
             System.out.println(type + mechanic[firstSize][secondSize][0] + "|" + mechanic[firstSize][secondSize][1] + "|" + mechanic[firstSize][secondSize][2] + "|" + mechanic[firstSize][secondSize][3] + "|");

         } else {
             System.out.println("no encontrado"); // si es null, es porque no ha encontrado una coincidencia
         }
        }
// metodo para contar vehiculos por estado
        public static void countVehicles(int maxEmployee, int maxVehicle){
        // inicializar contadores
            int vehiclePendind = 0;
            int repairedVehicle =0;
            int inRepair = 0;
         for(int i=0; i< maxEmployee; i++){ // recorrer el array tridimensional por dimensiones
             for(int j=0; j<maxVehicle;j++){
                 if(mechanic[i][j][0] != null){
                     // el metod equals ignore case, devuelve una cada de caracteres igual en longitud y caracteres, sin importar mayus o minus
                     if(mechanic[i][j][3].equalsIgnoreCase("pendiente")){
                       vehiclePendind ++;
                     } else if(mechanic[i][j][3].equalsIgnoreCase("reparado")){
                         repairedVehicle ++;
                     } else if (mechanic[i][j][3].equalsIgnoreCase("reparando")) {
                         inRepair ++;
                     }
                 }
             }
             System.out.println( "pendientes : "+ vehiclePendind + " En reparación: " + inRepair + " Reparado: " + repairedVehicle);
         }
        }

        // methodo para buscar un vehicle usando marca o modelo
    // el metodo recorre el array tridimensional
    // validando si hay un indice que corresponda a la la palabra ingresada por el user
    // devuelve el indice de los elementos encontrados
    // dimension 1 y dimension 2
        public static int[] findVehicle(String brandOrModel){
            for(int i=0; i<mechanic.length; i++){
                for(int j=0; j<mechanic[i].length; j++){
                    if(mechanic[i][j][0] != null
                            && (mechanic[i][j][0].equalsIgnoreCase(brandOrModel)
                            || mechanic[i][j][1].equalsIgnoreCase(brandOrModel))){
                        return  new int[] {i,j};
                    }
                }
                }
            return null;
            }


            // metodo para actualizar el estado del vehiculo
    // usa el metodo findvhicle
    // con el index que devuelve
    // se actualiza el nuevo estado del elemento que coincide
    public static void updateVehicle(String brandOrModel,Scanner dataEntry){
         int[] index = findVehicle(brandOrModel); // guarda el elemto retornado
         if(index != null){ // verifica si hay una coincidencia
             System.out.println("ingresa el nuevo estado"); // pide el dato
             String newStatus = dataEntry.nextLine();
             int firstSize = index[0]; // guarda indice
             int secondSize = index[1];
             mechanic[firstSize][secondSize][3] = newStatus;
             System.out.println("actualizado");
         } else{
             System.out.println("no encontrado");
         }
    }

}











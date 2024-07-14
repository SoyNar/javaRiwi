package Semana3;

import java.util.Scanner;

public class TallerMotos {




    public static void main(String[] args) {
        Scanner dataEntry = new Scanner(System.in);
        int maxEmployees;
         int maxVhicles;
        ;
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
                    System.out.println("escriba marca del vehiculo");
                    dataEntry.nextLine();
                    String brandOrModel = dataEntry.nextLine();
                    showVehicleByModel(maxEmployees, brandOrModel,maxVhicles);
                    break;
                case 4:
                    countVehicles(maxVhicles, maxEmployees);
                    break;
                case 5:break;
                case 6:
                    System.out.println("saliendo del sistema");
                    break;
                default:
                    System.out.println("opcion invalida");
                    break;
            }

        } while (option != 6);








    }
    // declarar array tridimensional
    public static String[][][] mechanic;

    public static void registerEmployee(Scanner dataEntry, int max, int maxVehicles){
        int typeIndex = 0;
        String brand;
        String modeloOfcar;
        String year;
        String status;
       for(int i=0;i<max; i++){
           System.out.println("ingrese el nombre del empleado" + (i+1));
           dataEntry.nextLine();
           String employee = dataEntry.nextLine();

           // validar si hay indice 0 de la primera dimension con dato null
           int index= 0;
           for(; index<maxVehicles; index++){
               if(mechanic[i][index][0] == null){
                   break;
               }
           }
           // validar si excede la longitud del array


           if(index < maxVehicles){
               System.out.println("ingrese el tipo de vehiculo");
               dataEntry.nextLine();
               String typeVehicle = dataEntry.nextLine();


               if(typeVehicle.equalsIgnoreCase("moto")){
                   typeIndex = 0;
               }else {
                   typeIndex = 1;
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
               mechanic[i][index][0] = brand;
               mechanic[i][index][1] = modeloOfcar;
               mechanic[i][index][2] = year;
               mechanic[i][index][3] = status;
           } else {
               System.out.println("no se pueden agregar mas trabajos");
           }
           }
    }

    public static void imprimirDatos(int maxEmployees, int maxVehicles) {
        System.out.println("Agenda de trabajos");
        System.out.println("");
        System.out.println("|Tipo|Marca|Modelo|Año|Estado|");
        for (int i = 0; i < maxEmployees; i++) {

                for (int j = 0; j < maxVehicles; j++) {
                    if (mechanic[i][j][0] != null) {
                        String tipo = (j == 0) ? "Moto" : "Carro";
                        System.out.println("|" + tipo + "|" + mechanic[i][j][0] + "|" + mechanic[i][j][1] + "|" + mechanic[i][j][2] + "|" + mechanic[i][j][3] + "|");
                    }

            }
        }
    }

    public static void showVehicleByModel(int maxEmployees,String brandOrModel, int maxVehicle){
        boolean found = false;
        System.out.println("|Tipo|Marca|Modelo|Año|Estado|");
        for(int i =0; i< maxEmployees; i++){
            for(int j=0; j<maxVehicle; j++){
                if(mechanic[i][j][0] != null
                        && (mechanic[i][j][0].equals(brandOrModel)
                        || mechanic[i][j][1].equals(brandOrModel))){

                        String tipo = (j == 0) ? "Moto" : "Carro";
                        System.out.println("|" + tipo + "|" + mechanic[i][j][0] + "|" + mechanic[i][j][1] + "|" + mechanic[i][j][2] + "|" + mechanic[i][j][3] + "|");
                        found = true;

                }
            }

            } if(!found){
            System.out.println("no encontrado");
        }
        }

        public static void countVehicles(int maxEmployee, int maxVehicle){
            int vehiclePendind = 0;
            int repairedVehicle =0;
            int inRepair = 0;
         for(int i=0; i< maxEmployee; i++){
             for(int j=0; j<maxVehicle;j++){
                 if(mechanic[i][j][0] != null){
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

        public static int[] findVehicle(int maxEmployees, int maxVehicle){
            for (int i =0; i<maxEmployees; i++){
                for(int j=0; j<maxVehicle; j++){
                    if(mechanic[i][j][0] != null){
                        return new int[] {i,j};
                    }
                }

            }
            return  null;
        }
    }










package Semana3.Investigacion;

import java.util.ArrayList;
import java.util.Scanner;

public class ListArrayInvestiga {
    public static void main(String[] args) {
        Scanner entradaDatos = new Scanner(System.in);
        String carro;
        ArrayList<String> cars = new ArrayList<>();
        for(int i=0; i<3;i++){
            System.out.println("ingrese el carro");
            carro = entradaDatos.nextLine();
            cars.add(carro);
        }
        for( String name : cars){
            System.out.println(name);
        }
    }
}

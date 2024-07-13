package Semana3.Arrys2.Facturacion;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Productos[] productos = new Productos[5];
        Scanner entradaDeDatos = new Scanner(System.in);
        int numeroProducto;
        int cantidadProducto;
        double total;
        double totalDescuento;
        double descuento;

        // asignar los productos a la tienda

        productos[0] = new Productos();
        productos[0].setNombre("Mango");
        productos[0].setPrecio(10.00);

        productos[1] = new Productos();
        productos[1].setNombre("Almendras");
        productos[1].setPrecio(5.00);

        productos[2] = new Productos();
        productos[2].setNombre("Habichuela");
        productos[2].setPrecio(5000);

        productos[3] = new Productos();
        productos[3].setNombre("arroz");
        productos[3].setPrecio(7000);

        productos[4] = new Productos();
        productos[4].setNombre("berenjena");
        productos[4].setPrecio(500);

        // recorrer y mostrar los productos
        System.out.println("productos y precio");
        for(int i=0; i<productos.length; i++){

            System.out.println(  (i+1) + " " + productos[i].getNombre() + productos[i].getPrecio());

        }

        // se pide al usuario de la aplicacion escoger por numero de producto

        System.out.println("Escoja el producto");
        numeroProducto = entradaDeDatos.nextInt();
        System.out.println("ingrese la cantidad de producto");
        cantidadProducto = entradaDeDatos.nextInt();

        // le restamos uno para que coincida con los indices desde 1
         total = productos[numeroProducto - 1].calcularTotal(cantidadProducto);
         totalDescuento = productos[numeroProducto -1].totalConDescuento(total);
         descuento = productos[numeroProducto - 1].calcularDescuento(total);
         System.out.println(" el total neto es: " + total);
        System.out.println("descuento de: " + descuento);
        System.out.println("total con descuento: " + totalDescuento);


        }

    }


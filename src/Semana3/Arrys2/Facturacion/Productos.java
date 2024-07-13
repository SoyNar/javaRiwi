package Semana3.Arrys2.Facturacion;

// clase modelo
public class Productos {
   private String nombre;
     private double precio;



     // metodo constructor
// public Productos(String nombre, double precio){
//     nombre = this.nombre;
//     precio = this.precio;
// }

     // metodos getter and setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }


    // metodo para calcular la cantidad total de un producto
    public double calcularTotal(double cantidad){
        return  cantidad * this.precio;
    }
    public double calcularDescuento(double total){
        double totalDescuento = 0;
        if(total >= 1000){
            totalDescuento = 0.25;
        } else if(total>=500){
            totalDescuento = 0.20;
        } else if(total>=300){
            totalDescuento = 0.15;
        } else if(total > 200){
            totalDescuento = 0.10;
        }

        return totalDescuento;
    }

    public double totalConDescuento(double total){
        double descuento = calcularDescuento(total);
        return  total - (total * descuento);
    }


//   @Override
//   public String toString() {
//       return "Nombre : " + getNombre() +
//               " precio: " + getPrecio();
//   }
}

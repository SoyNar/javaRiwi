package Semana3.Arrys2;

public class InvertirArray {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        // Invertir el array
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length -1 -i];
            array[array.length -1-i] = temp;
        }

        // Imprimir el array invertido
        System.out.print("Array invertido: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}

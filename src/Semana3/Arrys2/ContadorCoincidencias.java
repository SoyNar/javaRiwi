package Semana3.Arrys2;

public class ContadorCoincidencias {

    public static void main(String[] args) {
        int[] elementos = {1, 2, 1, 1, 2, 3, 3};

        // ordenar
        for (int i = 0; i < elementos.length -1; i++) {
            for (int j = i + 1; j < elementos.length; j++) {
                if (elementos[i] > elementos[j]) {
                    // Intercambiar
                    int temp = elementos[i];
                    elementos[i] = elementos[j];
                    elementos[j] = temp;
                }
            }
        }

        // Contar las repeticiones y mostrar los resultados
        int contador = 1;
        int tipoActual = elementos[0];
        for (int i = 1; i < elementos.length; i++) {
            if (elementos[i] == tipoActual) {
                contador++;
            } else {
                System.out.println("Hay " + contador + " elementos " + tipoActual);
                tipoActual = elementos[i];
                contador = 1;
            }
        }
        System.out.println("Hay " + contador + " elementos " + tipoActual);
    }
}

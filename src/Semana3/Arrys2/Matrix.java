package Semana3.Arrys2;

public class Matrix {
    public static void main(String[] args) {
        int[][] matriz1 = {{1, 2, 3}, {2, 4, 5}, {3, 5, 6}};
        int[][] matriz2 = {{1, 2, 3}, {2, 4, 5}, {4, 5, 6}};

        boolean simetrica1 = true;
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = i + 1; j < matriz1[i].length; j++) {
                if (matriz1[i][j] != matriz1[j][i]) {
                    simetrica1 = false;
                    break; // Si encontramos un par desigual, la matriz no es simétrica
                }
            }
            if (!simetrica1) {
                break; // Si la matriz no es simétrica, no hay necesidad de seguir comprobando
            }
        }

        boolean simetrica2 = true;
        for (int i = 0; i < matriz2.length; i++) {
            for (int j = i + 1; j < matriz2[i].length; j++) {
                if (matriz2[i][j] != matriz2[j][i]) {
                    simetrica2 = false;
                    break;
                }
            }
            if (!simetrica2) {
                break;
            }
        }

        System.out.println("La matriz 1 es simétrica: " + simetrica1);
        System.out.println("La matriz 2 es simétrica: " + simetrica2);
    }
}

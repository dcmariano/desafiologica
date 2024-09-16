package application;

public class Snail {
    public static int[] snail(int[][] matrix) {
        int n = matrix.length;
        int[] resultado = new int[n * n];
        int index = 0;
        int cima = 0;
        int baixo = n - 1;
        int esquerda = 0;
        int direita = n - 1;

        while (cima <= baixo && esquerda <= direita) {
            // Direita
            for (int i = esquerda; i <= direita; i++) {
                resultado[index++] = matrix[cima][i];
            }
            cima++;

            // Baixo
            for (int i = cima; i <= baixo; i++) {
                resultado[index++] = matrix[i][direita];
            }
            direita--;

            // Esquerda
            if (cima <= baixo) {
                for (int i = direita; i >= esquerda; i--) {
                    resultado[index++] = matrix[baixo][i];
                }
                baixo--;
            }

            // Cima
            if (esquerda <= direita) {
                for (int i = baixo; i >= cima; i--) {
                    resultado[index++] = matrix[i][esquerda];
                }
                esquerda++;
            }
        }

        return resultado;
    }

    public static void main(String[] args) {
        int[][] matrix1 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[] resultado1 = snail(matrix1);
        for (int i : resultado1) {
            System.out.print(i + " ");
        }
        System.out.println();

        int[][] matrix2 = {
                {1, 2, 3},
                {4, 10, 12},
                {6, 7, 33}
        };
        int[] resultado2 = snail(matrix2);
        for (int i : resultado2) {
            System.out.print(i + " ");
        }

        System.out.println();

        int[][] matrix3 = {
                {1, 2, 3, 1},
                {4, 5, 6, 4},
                {7, 8, 9, 7},
                {7, 8, 9, 7}
        };
        int[] resultado3 = snail(matrix3);
        for (int i : resultado3) {
            System.out.print(i + " ");
        }
    }
}
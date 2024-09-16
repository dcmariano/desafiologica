package application;

public class FlorSamambaia {
    public static String tentativaDesenhar(int r1, int x1, int y1, int r2, int x2, int y2) {
        double distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        if (distancia <= r1 + r2) {
            return "RICO";
        } else {
            return "MORTO";
        }
    }

    public static void main(String[] args) {
        System.out.println(tentativaDesenhar(4, 10, 12, 6, 7, 33));  // MORTO
        System.out.println(tentativaDesenhar(3, 1, 2, 3, 1, 2));  // RICO
    }
}
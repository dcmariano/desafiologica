package application;

import java.util.HashMap;
import java.util.Map;

public class ResistorCores {
    private static final Map<String, String> cores = new HashMap<>();

    static {
        cores.put("0", "preto");
        cores.put("1", "marrom");
        cores.put("2", "vermelho");
        cores.put("3", "laranja");
        cores.put("4", "amarelo");
        cores.put("5", "verde");
        cores.put("6", "azul");
        cores.put("7", "violeta");
        cores.put("8", "cinza");
        cores.put("9", "branco");
    }

    public static String resistorCores(String valor) {
        valor = valor.replace("ohms", "").trim();

        double valorDouble;
        if (valor.contains("k")) {
            valorDouble = Double.parseDouble(valor.replace("k", "")) * 1000;
        } else if (valor.contains("M")) {
            valorDouble = Double.parseDouble(valor.replace("M", "")) * 1000000;
        } else {
            valorDouble = Double.parseDouble(valor);
        }

        String valorStr = String.valueOf((int) valorDouble);

        String cor1 = cores.get(String.valueOf(valorStr.charAt(0)));
        String cor2 = cores.get(String.valueOf(valorStr.charAt(1)));
        String cor3 = cores.get(String.valueOf(valorStr.length() - 2));

        String cor4 = "dourado";

        return cor1 + " " + cor2 + " " + cor3 + " " + cor4;
    }

    public static void main(String[] args) {
        System.out.println(resistorCores("47 ohms"));  // amarelo violeta preto dourado
        System.out.println(resistorCores("4.7k ohms"));  // amarelo violeta vermelho dourado
        System.out.println(resistorCores("1M ohms"));  // marrom preto verde dourado
        System.out.println(resistorCores("10 ohms"));  // marrom preto preto dourado
        System.out.println(resistorCores("100 ohms"));  // marrom preto marrom dourado
        System.out.println(resistorCores("220 ohms"));  // vermelho vermelho marrom dourado
        System.out.println(resistorCores("330 ohms"));  // laranja laranja marrom dourado
        System.out.println(resistorCores("470 ohms"));  // amarelo violeta marrom dourado
        System.out.println(resistorCores("680 ohms"));  // azul cinza marrom dourado
        System.out.println(resistorCores("1k ohms"));  // marrom preto vermelho dourado
        System.out.println(resistorCores("2M ohms"));  // vermelho preto verde dourado
    }
}
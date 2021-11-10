import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> numeros = new ArrayList<>();

        for (int i = 1; i < 11; i++) {
            numeros.add(String.valueOf(i * 2));
        }

        System.out.println(numeros);
        System.out.println();
        mostraMedia(numeros);
        mostraMenor(numeros);
        mostraMaior(numeros);
    }

    public static void mostraMedia(List<String> numeros) {

        int media = 0;

        for (int i = 0; i < numeros.size(); i++) {
            media = media + Integer.parseInt(numeros.get(i));

        }

        System.out.println("Media: " + media / numeros.size());

    }

    public static void mostraMenor(List<String> numeros) {

        int menor = 0;

        for (int i = 0; i < numeros.size(); i++) {
            if (menor > Integer.parseInt(numeros.get(i))) {
                menor = Integer.parseInt(numeros.get(i));
            }
        }

        System.out.println("Menor: " + menor);
    }

    public static void mostraMaior(List<String> numeros) {

        int maior = 0;

        for (int i = 0; i < numeros.size(); i++) {
            if (maior < Integer.parseInt(numeros.get(i))) {
                maior = Integer.parseInt(numeros.get(i));
            }
        }

        System.out.println("Maior: " + maior);
    }

}

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

    }

    public static void mostraMedia(List<String> numeros) {

        int media = 0;

        for (int i = 0; i < numeros.size(); i++) {
            media = media + Integer.parseInt(numeros.get(i));

        }

        System.out.println(media / numeros.size());

    }
}

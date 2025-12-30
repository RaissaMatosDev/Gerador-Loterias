import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class GeradorNumeros {

    public static int[] gerarNumerosUnicos(int quantidade, int limite) {

        Set<Integer> numeros = new HashSet<>();
        Random random = new Random();

        while (numeros.size() < quantidade) {
            int numero = random.nextInt(limite) + 1;
            numeros.add(numero);
        }

        int[] resultado = new int[quantidade];
        int i = 0;

        for (int n : numeros) {
            resultado[i++] = n;
        }

        return resultado;
    }
}

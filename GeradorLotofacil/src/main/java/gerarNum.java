import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class gerarNum {

    public int[] gerar (int quantidade, int limite) {

       Set<Integer> numerosUnicos = new HashSet<>();
        Random random = new Random();

        while (numerosUnicos.size() < quantidade)
        for (int i = 0; i < quantidade; i++) {
            numerosUnicos[i] = random.nextInt(limite) + 1;
        }
        return numerosUnicos;
    }


}

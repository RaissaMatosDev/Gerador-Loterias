import java.util.Scanner;

public class Jogo {

    public void escolherJogo() {

        Scanner scan = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("""
                    Digite o número correspondente à opção desejada:
                    [1] LOTOFÁCIL
                    [2] QUINA
                    [3] MEGA-SENA
                    """);

            opcao = scan.nextInt();

            if (opcao < 1 || opcao > 3) {
                System.out.println("Opção inválida. Tente novamente.\n");
            }

        } while (opcao < 1 || opcao > 3);

        int quantidade = 0;
        int limite = 0;
        String nomeJogo = "";

        switch (opcao) {
            case 1 -> {
                nomeJogo = "LOTOFÁCIL";
                quantidade = 15;
                limite = 25;
            }
            case 2 -> {
                nomeJogo = "QUINA";
                quantidade = 5;
                limite = 80;
            }
            case 3 -> {
                nomeJogo = "MEGA-SENA";
                quantidade = 6;
                limite = 60;
            }
        }

        System.out.println("\n" + nomeJogo);
        System.out.println("Gerando números...\n");

        GeradorNumeros gerador = new GeradorNumeros();
        int[] numeros = gerador.gerarNumerosUnicos(quantidade, limite);

        System.out.println("Números gerados:");
        for (int n : numeros) {
            System.out.print(n + " ");
        }

        scan.close();
    }
}

import java.util.Scanner;

public class jogo {

    public void escolherJogo() {
        Scanner scan = new Scanner(System.in);

        int opcao = 0;

        boolean repetir = false;

        do {
            System.out.println("""
                    Digite o número correspondente a opçao desejada: 
                    [1] LOTOFACIL
                    [2] QUINA
                    [3] MEGA-SENA""");
            opcao = scan.nextInt();
            scan.nextLine();

            if (opcao < 1 || opcao > 3) {
                System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao < 1 || opcao > 3);

        int quantidade = 15;
        int limite = 25;

        switch (opcao) {

                case 1:
                    System.out.println("LOTOFACIL");
                    System.out.println("Gerando 15 números para sua aposta");
                    System.out.println();
                    quantidade = 15;
                    limite = 25;
                    break;

                case 2:
                    System.out.println("QUINA");
                    System.out.println("Gerando 5 números para sua aposta");
                    quantidade = 5;
                    limite = 80;
                    break;

                case 3:
                    System.out.println("MEGA-SENA");
                    System.out.println("Gerando 6 números para sua aposta");
                    quantidade = 6;
                    limite = 60;
                    break;
        }
        gerarNum gerador = new gerarNum();
        int[] numeros = gerador.gerar(quantidade, limite);

        System.out.println("Números gerados: ");
        for (int n : numeros) {
            System.out.print(n + " - ");
        }
        System.out.println();
    }
}
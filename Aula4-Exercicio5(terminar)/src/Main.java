import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Personagem p = new Personagem();
        Arma a = new Arma();
        int x = 0;
        Scanner scanner = new Scanner(System.in);

        p.nome = "Mateus";

        System.out.println("Quantos pontos de vida " + p.nome + " tem?");
        p.pontos = scanner.nextInt();

        a.nome = "Pistola";

        System.out.println("Qual o poder da arma: " + a.nome + " ?");
        a.poder = scanner.nextInt();

        System.out.println("Quantos pontos de resistencia " + a.nome + " tem?");
        a.resistencia = scanner.nextInt();

        a.descricao = "Uma arma rapida e compacta, mas com pouco poder de fogo.";

        System.out.println("Escolha uma opcao:");
        x = scanner.nextInt();

        if(x == 1){
            a.mostraInfoArma();
        }

    }
}
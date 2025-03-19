import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Personagem p = new Personagem();
        Arma a = new Arma();
        int x = 0;
        Scanner scanner = new Scanner(System.in);

        p.nome = "Mateus";

        p.a = a;

        System.out.println("Quantos pontos de vida " + p.nome + " tem?");
        p.pontos = scanner.nextInt();

        a.nome = "Pistola";

        System.out.println("Qual o poder da arma: " + a.nome + " ?");
        a.poder = scanner.nextInt();

        System.out.println("Quantos pontos de resistencia " + a.nome + " tem?");
        a.resistencia = scanner.nextInt();

        a.descricao = "Uma arma rapida e compacta, mas com pouco poder de fogo.";

        System.out.println("Escolha uma opcao: 1- Mostrar info da arma / 2- Usar arma / 3- Sofrer dano / 4- Sair");
        x = scanner.nextInt();

        do{
            if(x == 1){
                a.mostraInfoArma();
            }
            else if(x == 2){
                p.usarArma();
                System.out.println("Nova resistencia apos o uso: " + a.resistencia);
            }
            else if(x == 3){
                p.tomarDano();
                System.out.println("Vida total apos sofrer dano: " + p.pontos);
            }

            System.out.println("Escolha uma opcao: 1- Mostrar info da arma / 2- Usar arma / 3- Sofrer dano / 4- Sair");
            x = scanner.nextInt();

        }while(x != 4);

    }
}
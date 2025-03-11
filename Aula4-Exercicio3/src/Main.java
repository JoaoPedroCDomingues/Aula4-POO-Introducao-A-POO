import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Zumbi z1 = new Zumbi();
        Zumbi z2 = new Zumbi();
        Scanner scanner = new Scanner(System.in);

        z1.nome = "Igor";
        z2.nome = "Cleiton";
        double qtd1;
        double qtd2;
        double ali1;
        double ali2;

        System.out.println("Quanta vida " + z1.nome + " possui?");
        z1.vida = scanner.nextInt();

        System.out.println("Quanta vida " + z2.nome + " possui?");
        z2.vida = scanner.nextInt();

        qtd1 = z1.mostraVida();
        qtd2 = z2.mostraVida();

        System.out.println("Quanta vida " + z1.nome + " ganhou ao se alimentar?");
        ali1 = scanner.nextInt();

        System.out.println("Quanta vida " + z2.nome + " ganhou ao se alimentar?");
        ali2 = scanner.nextInt();

        System.out.println("O zumbi " + z1.nome + " possui " + qtd1 + " de vida.");

        z1.transfereVida(z1, ali1);

        System.out.println("O zumbi " + z1.nome + " se alimentou e agora tem " + z1.vida + " de vida.");

        System.out.println("O zumbi " + z2.nome + " possui " + qtd2 + " de vida.");

        z2.transfereVida(z2, ali2);

        System.out.println("O zumbi " + z2.nome + " se alimentou e agora tem " + z2.vida + " de vida.");
    }

}
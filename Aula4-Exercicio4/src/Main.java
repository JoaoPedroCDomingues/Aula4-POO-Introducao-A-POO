import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Zumbi z = new Zumbi();

        z.nome = "Igor";
        z.vida = 100;
        double transf;
        double qtd;
        boolean teste;

        System.out.println("Como a vida do zumbi mudou ao se alimentar?");
        transf = scanner.nextDouble();

        qtd = z.mostraVida();

        System.out.println("O zumbi " + z.nome + " possui " + qtd + " de vida.");

        teste = z.transfereVida(z, transf);

        if(teste == false)
        {
            System.out.println("O zumbi " + z.nome + " falhou ao se alimentar.");
        }
        else if(teste == true)
        {
            System.out.println("O zumbi " + z.nome + " se alimentou e agora tem " + z.vida + " de vida.");
        }


    }

}
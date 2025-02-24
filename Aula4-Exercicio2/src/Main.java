public class Main {
    public static void main(String[] args) {

        Zumbi z = new Zumbi();

        z.nome = "Igor";
        z.vida = 100;
        double qtd;

        qtd = z.mostraVida();

        System.out.println("O zumbi " + z.nome + " possui " + qtd + " de vida.");

        z.transfereVida(z, 150);

        System.out.println("O zumbi " + z.nome + " se alimentou e agora tem " + z.vida + " de vida.");
    }

}

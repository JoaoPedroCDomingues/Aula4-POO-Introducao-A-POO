public class Zumbi {

    double vida;
    String nome;

    double mostraVida() {
        return this.vida;
    }

    boolean transfereVida(Zumbi zumbiAlvo, double quantia) {
        if((zumbiAlvo.vida + quantia) <= 0)
        {
            return false;
        }
        else
        {
            zumbiAlvo.vida = zumbiAlvo.vida + quantia;
            return true;
        }
    }

}
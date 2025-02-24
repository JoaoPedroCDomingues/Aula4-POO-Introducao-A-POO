public class Zumbi {

    double vida;
    String nome;

    double mostraVida() {
        return this.vida;
    }

    void transfereVida(Zumbi zumbiAlvo, double quantia) {
        zumbiAlvo.vida = zumbiAlvo.vida + quantia;
    }

}

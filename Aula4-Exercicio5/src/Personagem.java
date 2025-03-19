public class Personagem {

    String nome;
    int pontos;
    Arma a;

    void usarArma(){
        a.resistencia -= 2;
    }

    void tomarDano(){
        this.pontos -= 2;
    }
}
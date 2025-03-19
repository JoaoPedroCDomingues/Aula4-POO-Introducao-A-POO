public class Arma {

    String nome;
    int poder;
    int resistencia;
    String descricao;

    void mostraInfoArma(){
        System.out.println("Poder da arma: " + this.poder);
        System.out.println("Resistencia da arma: " + this.resistencia);
        System.out.println(this.descricao);
    }
}
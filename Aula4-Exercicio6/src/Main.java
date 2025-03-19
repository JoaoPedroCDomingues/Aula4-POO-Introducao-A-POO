import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    String cili;
    boolean testeloop;
    Scanner scanner = new Scanner(System.in);
    Kart k1 = new Kart();
    Kart k2 = new Kart();
    Piloto p1 = new Piloto();
    Piloto p2 = new Piloto();

    k1.nome = "Blue";
    k2.nome = "Red";
    p1.nome = "Carlos";
    p2.nome = "Vigarista";

    System.out.println("Quantas cilindradas tem o primeiro kart? -> 1- 50 / 2- 100 / 3- 150");
    cili = scanner.nextLine();

    do{

    }while(testeloop = false);

    if(cili.equals(50) || cili.equals(100) || cili.equals(150)){
        k1.mot.cilindradas = cili;
    }
    else {
        System.out.println("Valores invalidos!");
        testeloop = false;
    }

    System.out.println("Qual a velocidade do primeiro kart?");
    k1.mot.velocidadeMaxima = scanner.nextInt();




    }
}
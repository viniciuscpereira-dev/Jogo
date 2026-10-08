public class Comida {

    String nome;
    int posicaoX;
    int posicaoY;
    int pontos;

    public Comida() {

        nome = "Maçã";
        posicaoX = 15;
        posicaoY = 10;
        pontos = 10;

    }

    public void mostrarDados() {

        System.out.println("----- COMIDA -----");
        System.out.println("Nome: " + nome);
        System.out.println("Posição X: " + posicaoX);
        System.out.println("Posição Y: " + posicaoY);
        System.out.println("Pontos: " + pontos);

    }

}
public class Cobra {

        String nome;
        int tamanho;
        int posicaoX;
        int posicaoY;
        String direcao;

        public Cobra() {

            nome = "Cobra";
            tamanho = 3;

            posicaoX = 10;
            posicaoY = 10;

            direcao = "Direita";

        }

        public void mostrarDados() {

            System.out.println("----- COBRA -----");
            System.out.println("Nome: " + nome);
            System.out.println("Tamanho: " + tamanho);
            System.out.println("Posição X: " + posicaoX);
            System.out.println("Posição Y: " + posicaoY);
            System.out.println("Direção: " + direcao);

        }

        public void andarDireita() {

            posicaoX = posicaoX + 1;
            direcao = "Direita";

        }

        public void andarEsquerda() {

            posicaoX = posicaoX - 1;
            direcao = "Esquerda";

        }

        public void andarCima() {

            posicaoY = posicaoY - 1;
            direcao = "Cima";

        }

        public void andarBaixo() {

            posicaoY = posicaoY + 1;
            direcao = "Baixo";

        }

        public void crescer() {

            tamanho = tamanho + 1;

            System.out.println("A cobra cresceu!");
            System.out.println("Novo tamanho: " + tamanho);

        }

    }


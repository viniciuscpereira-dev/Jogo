public class Jogo {

        String nome;
        int pontuacao;
        int nivel;

        Cobra cobra;
        Comida comida;

        public Jogo() {

            nome = "Jogo da Cobrinha";
            pontuacao = 0;
            nivel = 1;

            cobra = new Cobra();
            comida = new Comida();

        }

        public void iniciar() {

            System.out.println("================================");
            System.out.println("       JOGO DA COBRINHA"         );
            System.out.println("================================");

            System.out.println();

            cobra.mostrarDados();
            comida.mostrarDados();

            System.out.println();

            System.out.println("Pontuação: " + pontuacao);
            System.out.println("Nível: " + nivel);

            System.out.println();
            System.out.println("Jogo iniciado!");

        }

        public void ganharPontos() {

            pontuacao = pontuacao + 10;

            cobra.crescer();

            System.out.println("A cobra comeu!");
            System.out.println("Pontuação: " + pontuacao);

        }

        public void aumentarNivel() {

            nivel = nivel + 1;

            System.out.println("Novo nível: " + nivel);

        }
    }


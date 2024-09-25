import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int numenos[] = new int[10];

        Jogador jogador = new Jogador("Marcelo", 10, 26);

        for(int i = 0; i < numenos.length; i++) {
            numenos[i] = (int)Math.round(Math.random() * 100);
            for(int j = 0; j < i; j++) {
                if (numenos[i] == numenos[j]) {
                    numenos[i] = (int)Math.round(Math.random() * 100);
                }
            }
        }

        for (int i = 0; i < jogador.getJogo().length; i++) {
            for(int j = 0; j < numenos.length; j++) {
                if (jogador.getJogo()[i] == numenos[j]) {
                    jogador.inserirPremiacao();
                }
            }
        }



        Arrays.sort(numenos);
        System.out.println(Arrays.toString(numenos));
        System.out.println(jogador);
    }
}

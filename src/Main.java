import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        int numenos[] = new int[10];

        List<Jogador> jogadoresParticipantes = new ArrayList<>();
        List<Jogador> jogadoresVencedores = new ArrayList<>();
        Jogador marcelo = new Jogador("Marcelo", 10, 26);
        Jogador lucas = new Jogador("Lucas", 42, 85);
        Jogador daniel = new Jogador("Daniel", 4, 47);
        jogadoresParticipantes.add(marcelo);
        jogadoresParticipantes.add(lucas);
        jogadoresParticipantes.add(daniel);

        for(int i = 0; i < numenos.length; i++) {
            numenos[i] = (int)Math.round(Math.random() * 100);
            for(int j = 0; j < i; j++) {
                if (numenos[i] == numenos[j]) {
                    numenos[i] = (int)Math.round(Math.random() * 100);
                }
            }
        }

        for (Jogador jogador: jogadoresParticipantes) {
            for (int i = 0; i < jogador.getJogo().length; i++) {
                for (int j = 0; j < numenos.length; j++) {
                    if (jogador.getJogo()[i] == numenos[j]) {
                        jogador.inserirPremiacao();
                    }
                }
            }
            if (jogador.getPremiado() > 0) {
                jogadoresVencedores.add(jogador);
            }
        }


        Arrays.sort(numenos);
        System.out.println(Arrays.toString(numenos));
        System.out.println(jogadoresVencedores);
    }
}

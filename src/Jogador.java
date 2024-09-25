import java.util.Arrays;

public class Jogador {
    private String nome;
    private int[] jogo = new int[2];
    private double premiado = 0;

    public Jogador(String nome, int primeiroNumero, int segundoNumero) {
        this.nome = nome;
        this.jogo[0] = primeiroNumero;
        this.jogo[1] = segundoNumero;
    }

    public int[] getJogo() {
        return jogo;
    }

    public void inserirPremiacao() {
        this.premiado = premiado + 0.5;
    }

    public double getPremiado() {
        return premiado;
    }

    @Override
    public String toString() {
        return "Jogador{" +
                "nome='" + nome + '\'' +
                ", jogo=" + Arrays.toString(jogo) +
                ", premiado=" + premiado +
                '}';
    }
}

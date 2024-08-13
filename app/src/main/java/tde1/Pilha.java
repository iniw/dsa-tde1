package tde1;

public class Pilha {
    private int[] dados;
    private int topo;
    private int capacidade;

    Pilha(int capacidade) {
        this.capacidade = capacidade;

        dados = new int[this.capacidade];
        topo = -1;
    }

    public void insere(int item) throws Exception {
        if (vazia()) {
            dados[0] = item;
            topo = 1;
        } else if (cheia()) {
            throw new Exception("Lista não tem capacidade o suficiente");
        } else {
            dados[topo++] = item;
        }
    }

    public boolean vazia() {
        return topo == -1;
    }

    public boolean cheia() {
        return topo == capacidade;
    }

    public int remove() {
        return dados[--topo];
    }

    public void imprime() {
        for (int i = 0; i < topo; ++i)
            System.out.println(dados[i]);
    }
}

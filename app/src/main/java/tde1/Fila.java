package tde1;

public class Fila {
    private int[] dados;
    private int primeiro;
    private int ultimo;
    private int capacidade;

    Fila(int capacidade) {
        this.capacidade = capacidade;

        dados = new int[this.capacidade];
        primeiro = ultimo = 0;
    }

    public boolean vazia() {
        return ultimo == 0;
    }

    public boolean cheia() {
        return ultimo == capacidade;
    }

    public void insere(int item) throws Exception {
        if (cheia()) {
            throw new Exception("Fila não tem capacidade o suficiente");
        } else {
            dados[ultimo++] = item;
        }
    }

    public int remove() {
        var result = dados[primeiro++];
        if (primeiro == ultimo)
            primeiro = ultimo = 0;
        return result;
    }

    public void imprime() {
        for (int i = primeiro; i < ultimo; ++i)
            System.out.println(dados[i]);
    }
}

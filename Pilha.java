class Pilha {
    private int capacidade;
    private int topo;
    private int[] dados;

    public Pilha(int capacidade) {
        this.capacidade = capacidade;
        this.topo = -1;
        this.dados = new int[capacidade];
    }

    public void insere(int elemento) throws Exception {
        if (cheia()) {
            throw new Exception("Pilha cheia");
        }
        dados[++topo] = elemento;
    }

    public boolean cheia() {
        return topo == capacidade - 1;
    }

    public boolean vazia() {
        return topo == -1;
    }

    public int remove() throws Exception {
        if (vazia()) {
            throw new Exception("Pilha vazia");
        }
        return dados[topo--];
    }

    public void imprime() {
        if (vazia()) {
            System.out.println("Vazia");
        } else {
            for (int i = 0; i <= topo; i++) {
                System.out.print(dados[i] + " ");
            }
            System.out.println();
        }
    }
}
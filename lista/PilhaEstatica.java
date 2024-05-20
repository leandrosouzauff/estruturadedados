public class PilhaEstatica implements Pilha {
    private int[] dados;
    private int topo = -1;

    public PilhaEstatica(int capacidade) {
        dados = new int[capacidade];
    }

    @Override
    public boolean isVazia() {
        return topo == -1;
    }

    @Override
    public boolean isCheia() {
        return topo == dados.length - 1;
    }

    @Override
    public void adicionar(int dado) {
        if (isCheia()) {
            throw new IllegalStateException("Pilha cheia");
        }

        topo = topo + 1;
        dados[topo] = dado;
    }

    @Override
    public int remover() {
        if (isVazia()) {
            throw new IllegalStateException("Pilha está vazia");

        }
        int valor = dados[topo];
        dados[topo] = 0;
        topo = topo - 1;
        return valor;
    }

    @Override
    public void limpar() {

        for (int i = 0; i <= topo; i++) {

            dados[i] = 0;
        }
        topo = -1;
    }

}

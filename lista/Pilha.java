public interface Pilha {
    void adicionar(int valor);

    int remover();

    boolean isCheia();

    boolean isVazia();

    void limpar();
}

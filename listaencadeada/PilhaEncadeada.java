public class PilhaEncadeada<T> implements Pilha<T> {
    private static class No<T> {
        public No<T> anterior;
        public T dado;
    }

    private No<T> topo = null;

    @Override
    public void adicionar(T valor) {
        // TODO Auto-generated method stub
        var novo = new No<T>();
        novo.dado = valor;
        novo.anterior = topo;
        topo = novo;
    }

    @Override
    public T remover() {
        // TODO Auto-generated method stub
        if (isVazia()) {
            throw new IllegalStateException("FPilha vazia");
        }
        var dado = topo.dado;
        topo = topo.anterior;
        return dado;
    }

    @Override
    public boolean isCheia() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean isVazia() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public void limpar() {
        // TODO Auto-generated method stub
        topo = null;
    }

}

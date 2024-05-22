public class FilaEncadeada<T> implements Fila<T> {
    private static class No<T> {
        public No<T> proximo;
        public T dado;
    }

    private No<T> topo = null;
    private No<T> base = null;

    @Override
    public void adicionar(T valor) {
        // TODO Auto-generated method stub
        var novo = new No<T>();
        novo.dado = valor;
        if (isVazia()) {
            topo = novo;
            base = novo;
        } else {
            topo.proximo = novo;
            topo = novo;
        }
    }

    @Override
    public T remover() {
        // TODO Auto-generated method stub
        if (isVazia()) {
            throw new IllegalStateException("Fila vazia");
        }
        T dado = base.dado;
        base = base.proximo;
        if (base == null) {
            topo = null;
        }

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
        return base == null;
    }

    @Override
    public void limpar() {
        // TODO Auto-generated method stub
        topo = null;
        base = null;
    }

}
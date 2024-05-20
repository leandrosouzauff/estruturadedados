public class TestePilhaEstatica {
    public static void main(String[] args) {
        Pilha ps = new PilhaEstatica(10);

        for (int i = 0; i < 10; i++) {
            ps.adicionar(i);
        }
        System.out.println(!ps.isVazia());

        while (!ps.isVazia()) {
            System.out.println(ps.remover() + "");

        }

    }
}

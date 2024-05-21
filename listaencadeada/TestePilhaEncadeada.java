public class TestePilhaEncadeada {
    public static void main(String[] args) {
        Pilha<Integer> ps = new PilhaEncadeada<>();

        for (int i = 0; i < 10; i++) {
            ps.adicionar(i);
        }
        System.out.println(!ps.isVazia());

        while (!ps.isVazia()) {
            System.out.println(ps.remover() + "");

        }

    }
}

public class TesteFilaCircular {

    public static void main(String[] args) {
        Fila<Integer> fi = new FilaCircular<>(100);

        for (int i = 0; i < 10; i++) {
            fi.adicionar(i);
            System.out.println(fi);
            // fi.remover();
        }
        fi.remover();
        fi.remover();
        // fi.limpar();
        System.out.println(fi);
        System.out.println(fi.isVazia());

        while (!fi.isVazia()) {
            System.out.println(fi.remover() + "");
        }

    }
}

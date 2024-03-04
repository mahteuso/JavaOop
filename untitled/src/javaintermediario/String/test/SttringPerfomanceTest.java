package javaintermediario.String.test;

public class SttringPerfomanceTest {
    public static void main(String[] args) {
        double inicio = System.currentTimeMillis();
        concatString(100_000);
        double fim = System.currentTimeMillis();
        double total = fim - inicio;

        System.out.println("Tempo gasto concatenando Strings: git add ."+total+ " ms");
        System.out.println("------------------");

        inicio = System.currentTimeMillis();
        concatStringBuilder(100_000);
        fim = System.currentTimeMillis();
        total = fim - inicio;

        System.out.println("Tempo gasto com StringBuilder: "+total+ " ms");
        System.out.println("------------------");
    }

    public static void concatString(int tamanho){
        String test = "";
        for (int i = 0; i < tamanho; i++){
            test += i;
        }

    }

    public static void concatStringBuilder(int tamanho){
        StringBuilder test = new StringBuilder(tamanho);
        for (int i = 0; i < tamanho; i++){
            test.append(i);
        }

    }
}

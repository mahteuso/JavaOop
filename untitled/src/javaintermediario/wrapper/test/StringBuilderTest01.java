package javaintermediario.wrapper.test;

public class StringBuilderTest01 {
    public static void main(String[] args) {
        System.out.println("------------------------");
        String nome = "Mateus";
        nome.concat(" Silva"); // cria uma concatenação em outro região de memória
        System.out.println(nome);
        System.out.println("------------------------");

        StringBuilder name = new StringBuilder("Mateus");
        name.append(" Silva").append(" Laranjeira");
        System.out.println(name);
        System.out.println("------------------------");

    }

}

package javaintermediario.wrapper.test;

public class StringsTest01 {
    public static void main(String[] args) {
        String nome = "Mateus";
        String nome2 = "Mateus";

        System.out.println(nome == nome2);
        System.out.println(nome2);

        String chapeu = "Luffy";
        System.out.println(chapeu.charAt(3));
        System.out.println(chapeu.toLowerCase());
        System.out.println(chapeu.toUpperCase());
        System.out.println(chapeu.replace("f", "m"));
        System.out.println(chapeu.substring(0,4));

    }
}

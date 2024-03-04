package javaintermediario.wrapper.test;

public class WrapperTest01 {
    public static void main(String[] args) {
        Integer intW = 10; // autoboxing

        int i = intW; // unboxing

        boolean falso = Boolean.parseBoolean("False");
        System.out.println(falso);
        System.out.println("---------------------------------------");

        System.out.println(Character.isDigit('A'));
        System.out.println("---------------------------------------");
        System.out.println(Character.isAlphabetic('A'));
        System.out.println("---------------------------------------");
    }
}

package excecao.tests;

public class RuntimeTest01 {
    public static void main(String[] args) {
        divide(1,0);
    }

    private static int divide(int a,int b){
        if (b == 0){
            throw new IllegalArgumentException("O argumento b não pode ser igual a zero");
        }
        return a/b;
    }
}

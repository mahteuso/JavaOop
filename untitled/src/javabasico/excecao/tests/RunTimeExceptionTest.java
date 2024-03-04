package javabasico.excecao.tests;

public class RunTimeExceptionTest {
    public static void main(String[] args) {
        try{
            throw new IllegalArgumentException();
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Dentro do ArrayIndexOutOfBoundsException");
        } catch(IndexOutOfBoundsException e){
            System.out.println("Dentro do IndexOutOfBoundsException");
        } catch(IllegalArgumentException e){
            System.out.println(("Dentro IllegalArgumentException"));
        }
    }
}

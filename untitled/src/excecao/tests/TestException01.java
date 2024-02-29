package excecao.tests;

import java.io.File;
import java.io.IOException;

public class TestException01 {
    public static void main(String[] args) {
        criaArquivo();
        System.out.println(imprimi());
    }

    private static void criaArquivo(){
        File file = new File("/home/mateus/JavaOop/arquivo/file.txt");

        try{
            file.createNewFile();
            System.out.println("Arquivo criado");
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    private static String imprimi(){
        try{
            System.out.println("Abrindo arquivo");
            System.out.println("Lendo arquivo");
            return "Mensagem do return";
        } catch (Exception e){
            e.printStackTrace();
        } finally {
            System.out.println("Fechando arquivo antes do return");
        }
        return null;
    }
}

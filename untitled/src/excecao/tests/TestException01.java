package excecao.tests;

import java.io.File;
import java.io.IOException;

public class TestException01 {
    public static void main(String[] args) {
        criaArquivo();
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
}

package javabasico.tests;

import java.io.File;
import java.io.IOException;

public class TestException01 {
    public static void main(String[] args) {
        criaArquivo();
    }

    private static void criaArquivo(){
        File file = new File("/home/mateus/cloneJavaOop/file/mateus.txt");
        try {
            file.createNewFile();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}

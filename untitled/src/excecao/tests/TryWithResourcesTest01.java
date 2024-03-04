package excecao.tests;

import excecao.domain.Leitor1;
import excecao.domain.Leitor2;

import java.io.*;

public class TryWithResourcesTest01 {
    public static void main(String[] args) {
        lerArquivo();
    }

    public static void lerArquivo() {
        try (Leitor1 leitor1 = new Leitor1();
             Leitor2 leitor2 = new Leitor2()) { // Try with resources

        } catch (IOException e) {

        }
    }

    public static void readFile() {
        Reader reader = null;
        try {
            reader = new BufferedReader(new FileReader("test.txt")); // normal try and catch

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }
}

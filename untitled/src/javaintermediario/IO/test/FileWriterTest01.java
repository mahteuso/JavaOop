package javaintermediario.IO.test;

import java.io.*;

// File criar e deletar arquivos
// FileWriter para escrever -> lowLevel
// FileReader para leitura
// BufferFileWriter para escrever otimizado com dados em memória
// BufferFileReader para leitura otimizada

public class FileWriterTest01 {
    public static void main(String[] args) {
        File file = new File("/home/mateus/JavaOop/arquivo/new_file.txt");
        try (FileWriter writer = new FileWriter(file)) {
            writer.write("Estou aprendendo a escrever num arquivo usando o Javinha\nMais uma linha no meu aqruivo");
            writer.flush();
            try (FileReader reader = new FileReader(file)){
               /* char[] leitura = new char[100];
                int j = reader.read(leitura);
                System.out.println("número de linhas: "+j);
                for (char letra : leitura){
                    System.out.print(letra);
                }*/

                int i;
                while ((i = reader.read()) != -1){
                    System.out.print((char)i);
                }

            }catch (IOException e){
               throw new RuntimeException(e);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}

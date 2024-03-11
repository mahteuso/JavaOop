package javaintermediario.IO.test;

import java.io.*;
import java.util.ArrayList;

public class BufferFileWriterTest01 {
    public static void main(String[] args) {
        File file = new File("/home/mateus/JavaOop/arquivo/new_file.txt");
        try (FileWriter writer = new FileWriter(file);
             BufferedWriter bfw = new BufferedWriter(writer)) {
            bfw.write("Estou aprendendo a escrever num arquivo usando o Javinha");
            bfw.newLine();
            bfw.write("Estou aprendendo a escrever uma nova linha, utilizando a classe BufferedWrite");
            bfw.flush();

            try (FileReader reader = new FileReader(file);
                 BufferedReader bfr = new BufferedReader(reader)) {
                /*ArrayList<String> n = new ArrayList<>();
                while (bfr.readLine() != null){
                    n.add(bfr.readLine());
                }
                System.out.println(n);*/

                String letras;
                while ((letras = bfr.readLine()) != null ){
                    System.out.println(letras);
                }


                } catch (IOException e) {
                throw new RuntimeException(e);
            }
            } catch (IOException e) {
                throw new RuntimeException(e);
        }
    }
}
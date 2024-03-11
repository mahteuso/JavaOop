package javaintermediario.IO.test;

import java.io.*;

public class FileTest02 {
    public static void main(String[] args) {
        File fileDir = new File("/home/mateus/JavaOop/arquivo/folder");
        boolean dir = fileDir.mkdir();
        if (dir){
            System.out.println("Directory was created.");
        }
        File  file = new File("/home/mateus/JavaOop/arquivo/folder/file.txt");

        try {
            boolean isFile = file.createNewFile();
            if (isFile){
                System.out.println("File was created");
            }
            FileWriter writer = new FileWriter(file);
            BufferedWriter bfw = new BufferedWriter(writer);
            bfw.write("Criando um parágrafo no meu arquivo");
            bfw.flush();

            File newFile = new File(fileDir, "file.txt");
            file.renameTo(newFile);


        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}

package javaintermediario.IO.test;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileTest01 {
    public static void main(String[] args) {
        File file = new File("/home/mateus/JavaOop/arquivo/new_file.txt");
        try {
            boolean create = file.createNewFile();
            System.out.println("Was the file created? " + create);
            System.out.println("Absolute path " + file.getAbsolutePath());
            System.out.println("Is directory " + file.isDirectory());
            System.out.println("Is file " + file.isFile());
            System.out.println("Last modified " + new Date(file.lastModified()));
            if (file.exists()){
                boolean delete = file.delete();
                System.out.println("Was the file deleted? " + delete);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

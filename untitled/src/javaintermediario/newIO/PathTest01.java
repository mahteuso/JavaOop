package javaintermediario.newIO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest01 {
    public static void main(String[] args) {
        Path path = Paths.get("/home/mateus/JavaOop/arquivo/folder/new");
        // Criação de uma cascata de diretórios que não existem
        Path subPath = Paths.get("pasta/subPasta/subSubPasta");
        try {
            Path newSubPath = Files.createDirectories(subPath);
            // Criação de arquivo na cadeia de diretórios

            Path filePath = Paths.get(newSubPath.toString(), "file.txt");
            if (Files.notExists(filePath)){
                Files.createFile(filePath);

            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            if (Files.notExists(path)) {
                Path newPath = Files.createDirectory(path);
            }
            System.out.println("The directory already exists");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

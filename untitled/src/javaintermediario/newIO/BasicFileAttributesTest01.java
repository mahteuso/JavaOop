package javaintermediario.newIO;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileTime;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

public class BasicFileAttributesTest01 {
    public static void main(String[] args) {
        LocalDateTime date1 = LocalDateTime.now();
        LocalDateTime date2 = LocalDateTime.now().minusDays(10);

        System.out.println(date1);
        System.out.println(date2);

        File file = new File("/home/mateus/JavaOop/pasta/subPasta/novo.txt");

        if (!file.exists()) {
            try {
                file.createNewFile();
                file.setLastModified(date2.toInstant(ZoneOffset.UTC).toEpochMilli());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        Path path = Paths.get("/home/mateus/JavaOop/pasta/subPasta/new.txt");
        if (Files.notExists(path)) {
            try {
                Files.createFile(path);
                FileTime fTime = FileTime.from(date2.toInstant(ZoneOffset.UTC));
                System.out.println(fTime);
                Files.setLastModifiedTime(path, fTime);
                System.out.println(Files.isDirectory(path));
                System.out.println(Files.isExecutable(path));
                System.out.println(Files.isWritable(path));
                System.out.println(Files.isHidden(path));
                System.out.println(Files.isReadable(path));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }
}

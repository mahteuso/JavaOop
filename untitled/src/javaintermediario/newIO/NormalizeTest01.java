package javaintermediario.newIO;

import java.nio.file.Path;
import java.nio.file.Paths;

public class NormalizeTest01 {
    public static void main(String[] args) {
        String dirProjects = "pasta/subPasta/subSubPasta";
        String arquivoTxt = "../../file.txt";
        Path path01 = Paths.get(dirProjects, arquivoTxt);

        System.out.println(path01.normalize());

        // Resolvendo paths
        Path absolute = Paths.get("/arquivo/folder");
        Path relative = Paths.get("new");
        Path file = Paths.get("file.txt");

        System.out.println(absolute.resolve(relative).resolve(file));
        System.out.println(relative.resolve(absolute));
        System.out.println(relative.resolve(file));

    }
}

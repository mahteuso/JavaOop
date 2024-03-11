package javaintermediario.newIO;

import java.nio.file.Path;
import java.nio.file.Paths;

public class NormalizeTest01 {
    public static void main(String[] args) {
        String dirProjects = "pasta/subPasta/subSubPasta";
        String arquivoTxt = "../../file.txt";
        Path path01 = Paths.get(dirProjects, arquivoTxt);

        System.out.println(path01.normalize());
    }
}

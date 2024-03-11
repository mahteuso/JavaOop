package javaintermediario.newIO;

import java.nio.file.Path;
import java.nio.file.Paths;

public class RelativizeTest01 {
    public static void main(String[] args) {
        String absolute = "/pasta/subPasta";
        String relative = "/pasta/subPasta/subSubPasta/file.txt";
        Path pathAbsolute = Paths.get(absolute);
        Path pathRelative = Paths.get(relative);
        Path pathToFile = pathAbsolute.relativize(pathRelative);

        System.out.println(pathToFile);

        Path pAbsolute = Paths.get("/home/new");
        Path pRelatiuve = Paths.get("/home/new/folder/Pessoa.java");

        Path pathToclazz = pAbsolute.relativize(pRelatiuve);
        System.out.println(pathToclazz);


    }
}

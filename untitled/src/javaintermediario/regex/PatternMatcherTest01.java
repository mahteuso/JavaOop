package javaintermediario.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest01 {
    public static void main(String[] args) {
        // Usado para validações em determinados contextos: email, urls, etc
        // Metacaracteres como \d -> Todos os digitos
        // \D -> Tudo o que não for dígito
        // \s -> Todos os espaços em branco
        // \S -> Todos os caracteres excuindo os brancos
        // \w -> Exclui todos os caracteres especiais
        // \W -> Retorna caracteres especiais e espaços

        String regex = "\\W";
        String text = "da12_3abk3 4aba #$@65b";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        System.out.println("Texto:   " + text);
        System.out.println("posição: 012345678910");
        System.out.println("regex :" + regex);
        System.out.println("Posições encontradas");

        while (matcher.find()) {
            System.out.print("índice: "+matcher.start() + " -> " + matcher.group() + "\n");
        }
    }
}

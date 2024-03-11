package javaintermediario.regex;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ScannerTest01 {
    public static void main(String[] args) {
        String text = "Mateus,Marco,Rogério,23,false,22,56";
        String[] vetor = text.split(",");
        // Usando o for tradicional
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i].trim());
        }
        System.out.println("--------------------------");
        // Usando o foreach
        for (String nomes : vetor) {
            System.out.println(nomes.trim());
        }
        System.out.println("--------------------------");
        System.out.println("Usando a classe Scanner para verificar um delimitador");
        // Usando a classe Scanner para captutar string e retornar valores diferentes de Strings

        Scanner verify = new Scanner(text);
        verify.useDelimiter(",");
        while (verify.hasNext()) {
            if (verify.hasNextInt()) {
                int i = verify.nextInt();
                System.out.println("int: " + i);

            } else if (verify.hasNextBoolean()){
                boolean b = verify.nextBoolean();
                System.out.println("boolean: " + b);
            } else {
                System.out.println(verify.next());
            }
        }
    }
}

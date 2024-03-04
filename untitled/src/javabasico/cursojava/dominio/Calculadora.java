package javabasico.cursojava.dominio;

public class Calculadora {
    //Usando arrays para somar
    public int somaArray(int[] number){
        int soma = 0;
        for (int num : number){
            soma += num;
        }
        return soma;
    }

    //Usando varargs para somar
    public int somarArgs(int... number){
        int soma = 0;
        for (int num : number){
            soma += num;
        }
        return soma;
    }
}

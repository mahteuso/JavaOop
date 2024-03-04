package javabasico.polimorfismo.control;

import javabasico.polimorfismo.domain.Produto;

public class ImpostoProduto {
    public static double calculaImposto(Produto produto){
        return produto.calculoDoImposto();
    }
}

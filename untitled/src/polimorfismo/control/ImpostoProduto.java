package polimorfismo.control;

import polimorfismo.domain.CalcularImposto;
import polimorfismo.domain.Produto;

public class ImpostoProduto {
    public static double calculaImposto(Produto produto){
        return produto.calculoDoImposto();
    }
}

package polimorfismo.test;

import polimorfismo.control.ImpostoProduto;
import polimorfismo.domain.Computador;
import polimorfismo.domain.Mesa;
import polimorfismo.domain.Produto;

public class PolimorfismoTest01 {
    public static void main(String[] args) {
        Produto computador = new Computador("Asus i7", 4000);
        Produto mesa = new Mesa("Mesa de vidro", 7000);

        System.out.println("Nome do produto: "+computador.getName()+" .Valor do produto: R$"+computador.getValue());
        System.out.println("Valor do imposto: R$"+ImpostoProduto.calculaImposto(computador));
        System.out.println("-----------------------------------------------");
        System.out.println("Nome do produto: "+mesa.getName()+" .Valor do produto: R$"+mesa.getValue());
        System.out.println("Valor do imposto: R$"+ImpostoProduto.calculaImposto(mesa));
    }

}

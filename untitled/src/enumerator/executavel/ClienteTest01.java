package enumerator.executavel;

import enumerator.domain.Cliente;
import enumerator.domain.TipoCliente;
import enumerator.domain.Cliente.TipoPagamento;

import java.lang.ref.Cleaner;

public class ClienteTest01 {
    public static void main(String[] args) {
        Cliente cliente01 = new Cliente("Mateus", TipoCliente.PESSOA_FISICA, TipoPagamento.DEBITO);
        Cliente cliente02 = new Cliente("Marco", TipoCliente.PESSOA_JURIDICA, TipoPagamento.CREDITO);

        System.out.println(cliente01);
        System.out.println(cliente02);

        System.out.println("Valor de $200,00 do pagamento com cŕedito: R$"+TipoPagamento.CREDITO.calcularDesconto(200));
        System.out.println("----------------------------------------");
        System.out.println("Valor de $200,00 do pagamento com débito: R$"+TipoPagamento.DEBITO.calcularDesconto(200));

    }
}

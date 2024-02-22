package enumerator.domain;

public class Cliente {
    public enum TipoPagamento{
        DEBITO('D'){
            @Override
            public double calcularDesconto(double valor) {
                return valor * 0.9;
            }
        },
        CREDITO('C'){
            @Override
            public double calcularDesconto(double valor) {
                return valor * 1.1;
            }
        };

        public final char VALOR;

        TipoPagamento(char valor){
            this.VALOR = valor;
        }
        public abstract double calcularDesconto(double valor);

    }
    private String nome;
    private TipoCliente tipoCliente;
    private TipoPagamento tipoPagamento;

    public Cliente(String nome, TipoCliente tipoCliente, TipoPagamento tipoPagamento) {
        this.nome = nome;
        this.tipoCliente = tipoCliente;
        this.tipoPagamento = tipoPagamento;
    }


    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", tipoCliente=" + tipoCliente +
                ", tipoCliente=" + tipoCliente.VALOR +
                ", tipoPagamento=" + tipoPagamento +
                ", tipoPagamento=" + tipoPagamento.VALOR +
                '}';
    }
}

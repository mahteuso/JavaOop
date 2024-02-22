package heranca.domain;

public class Funcionario extends Pessoa{
    private String salario;

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }

    @Override
    public void Imprimir() {
        super.Imprimir();
        System.out.println("nome: "+salario);
    }
}

package javabasico.heranca.domain;

public class Funcionario extends Pessoa{
    private String salario;

    public Funcionario(String nome){
        super(nome);
    }

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

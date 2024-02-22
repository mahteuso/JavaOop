package heranca.excecute;

import heranca.domain.Endereco;
import heranca.domain.Funcionario;
import heranca.domain.Pessoa;

public class TesteHeranca01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Mateus");
        Funcionario funcionario = new Funcionario("Mateus");
        Endereco endereco = new Endereco();

        endereco.setRua("Rua dos Sabiás");
        pessoa.setCpf("123456678-90");
        pessoa.setEndereco(endereco);

        pessoa.Imprimir();
        System.out.println("----------------");

        funcionario.setCpf("123456678-90");
        funcionario.setEndereco(endereco);
        funcionario.setSalario("R$ 2000.00");

        funcionario.Imprimir();
    }
}

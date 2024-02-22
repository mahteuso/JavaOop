package heranca.domain;

public class Pessoa {
    private String nome;
    private String cpf;
    private Endereco endereco;


    public void Imprimir(){
        System.out.println("nome: "+nome);
        System.out.println("cpf: "+cpf);
        System.out.println("rua: "+endereco);
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}

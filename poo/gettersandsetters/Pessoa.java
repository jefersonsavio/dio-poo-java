package poo.gettersandsetters;

public class Pessoa {

    private String nome;
    private String cpf;
    private String endereco;

    public Pessoa(String cpf, String nome) {

        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    int idade;

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String string) {
    }

}

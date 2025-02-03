package model;

public class Paciente {
    private String nome;
    private String telefone;
    private String dataNascimento;
    private Endereco endereco;

    public Paciente(String nome, String telefone, String dataNascimento, Endereco endereco) {
        this.nome = nome;
        this.telefone = telefone;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public Endereco getEndereco() {
        return endereco;
    }

}
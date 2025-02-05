package model;

public abstract class Funcionario {
    private String nome;
    private String telefone;
    private String dataNascimento;
    private Endereco endereco;
    private double salario;

    public Funcionario(String nome, String telefone, String dataNascimento, Endereco endereco, double salario) {
        this.nome = nome;
        this.telefone = telefone;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
        this.salario = salario;
    }


    public abstract double calculoSalario();

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

    public double getSalario() {
        return salario;
    }

}

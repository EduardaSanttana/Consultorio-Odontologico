package model;

public class Secretaria extends Funcionario {

    public Secretaria(String nome, String telefone, String dataNascimento, Endereco endereco, double salario) {
        super(nome, telefone, dataNascimento, endereco, salario);
    }

    @Override
    public double calculoSalario() {
        return super.getSalario();
    }
}

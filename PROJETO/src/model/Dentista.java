package model;

public class Dentista extends Funcionario {

    private double cro;

    public Dentista(String nome, String telefone, String dataNascimento, Endereco endereco, double salario, double cro) {
        super(nome, telefone, dataNascimento, endereco, salario);
        this.cro = cro;
    }

    public double getCro() {
        return cro;
    }

    @Override
    public double calculoSalario() {
        double comissaoTotal = super.getSalario() * 0.1;
        
        return super.getSalario() + comissaoTotal;
    }
}

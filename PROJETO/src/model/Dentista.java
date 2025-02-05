package model;

    // A classe Dentista herda da classe Funcionario
    public class Dentista extends Funcionario {
        private double cro;
        private double comissao; 

        public Dentista(String nome, String telefone, String dataNascimento, Endereco endereco, double salario, double cro) {
            super(nome, telefone, dataNascimento, endereco, salario);
            this.cro = cro;
            this.comissao = 0;
        }

        public double getCro() {
            return cro;
        }
        //Adicionar comissão do Dentista com base no valor da consulta
        public void adicionarComissao(double valorConsulta) {
            this.comissao += valorConsulta * 0.1; 
        }

        @Override
        public double calculoSalario() {
            return super.getSalario() + comissao; 
        }
    }

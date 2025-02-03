package model;

public class Endereco {
    private String logradouro;
    private int numero;
    private String bairro;
    private String cep;

    public Endereco(String logradouro, int numero, String bairro, String cep) {
        this.logradouro = logradouro;
        this.numero = numero;
        this.bairro = bairro;
        this.cep = cep;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public int getNumero() {
        return numero;
    }

    public String getBairro() {
        return bairro;
    }

    public String getCep() {
        return cep;
    }
}

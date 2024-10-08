package br.com.fiap.beans;

public class Colaborador {

    private String nome;
    private String cargo;
    private double valorHora;
    private double quantidadeHoras;
    private Endereco endereco;

    //Método construtor vazio
    public Colaborador(){
        super();
    }

    //Método construtor cheio (sem atributos de referencia)

    public Colaborador(String nome, String cargo, double valorHora, double quantidadeHoras) {
        super();
        this.nome = nome;
        this.cargo = cargo;
        this.valorHora = valorHora;
        this.quantidadeHoras = quantidadeHoras;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public double getQuantidadeHoras() {
        return quantidadeHoras;
    }

    public void setQuantidadeHoras(double quantidadeHoras) {
        this.quantidadeHoras = quantidadeHoras;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Colaborador{" +
                "nome='" + nome + '\'' +
                ", cargo='" + cargo + '\'' +
                ", valorHora=" + valorHora +
                ", quantidadeHoras=" + quantidadeHoras +
                ", endereco=" + endereco +
                '}';
    }
}
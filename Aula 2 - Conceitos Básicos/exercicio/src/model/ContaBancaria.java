package model;

public class ContaBancaria {
    private String nome;
    private int numero;
    private Boolean ativa;
    private double saldo;

    public ContaBancaria(String nome, int numero, Boolean ativa, double saldo) {
        this.nome = nome;
        this.numero = numero;
        this.ativa = ativa;
        this.saldo = saldo;
    }
}

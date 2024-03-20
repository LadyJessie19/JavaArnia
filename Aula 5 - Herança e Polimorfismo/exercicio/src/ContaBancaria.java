public class ContaBancaria {
    private String nome;
    private int numero;
    private Boolean ativa;
    protected double saldo;
    private Cliente cliente;

    public ContaBancaria(String nome, int numero, Boolean ativa, double saldo) {
        this.nome = nome;
        this.numero = numero;
        this.ativa = ativa;
        this.saldo = saldo;
    }

    public String getSaldo() {
        return "Saldo: " + saldo;
    }

    public void depositar(double valor) {
        this.saldo += valor;
    }

    public void sacar(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            System.err.println("Saque efetuado com sucesso");
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

    // método para setar o cliente

    // método para retornar os dados dos cliente
}

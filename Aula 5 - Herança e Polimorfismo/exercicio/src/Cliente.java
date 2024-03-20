public class Cliente {
    private String nome;
    private String cpf;
    private String endereco;

    public Cliente(String nome, String cpf, String endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
    }

    public String getClienteInfo() {
        return "Nome: " + nome + "\nCPF: " + cpf + "\nEndereço: " + endereco;
    }
}

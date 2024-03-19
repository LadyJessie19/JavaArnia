public class Pessoa {
    private String nome;
    private int idade;
    private Boolean isMaiorDeIdade;
    private double altura;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int newIdade) {
        this.idade = newIdade;
    }
}

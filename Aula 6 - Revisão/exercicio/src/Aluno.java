public class Aluno extends Pessoa {
    private String turma;

    public Aluno(String nome, int idade, String turma) {
        super(nome, idade);
        this.turma = turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    public String getTurma() {
        return this.turma;
    }

    @Override
    public void mostrarDados() {
        super.mostrarDados();
        System.out.println("Turma: " + this.turma);
    }

}

public class App {
    public static void main(String[] args) throws Exception {
        Aluno aluno = new Aluno("Jéssica", 25, "1B50");

        Professor professor = new Professor("Isabelle", 19, "Matemática");

        aluno.mostrarDados();
        professor.mostrarDados();
    }
}

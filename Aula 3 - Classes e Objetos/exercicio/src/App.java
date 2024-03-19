public class App {
    public static void main(String[] args) throws Exception {
        Pessoa pessoa = new Pessoa("João", 30);
    
        System.out.println("A idade da pessoa é: " + pessoa.getIdade());

        pessoa.setIdade(35);

        System.out.println("A nova idade da pessoa é: " + pessoa.getIdade());
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        Animal animal = new Animal("bicho");

        animal.numeroDePatas = 4;

        Cachorro cachorro = new Cachorro("Denver", "Jéssica");

        Gato gato = new Gato("Jon Snow");

        System.out.println(animal.emitirSom());
        System.out.println(cachorro.emitirSom());
        System.out.println(gato.emitirSom());
    }
}

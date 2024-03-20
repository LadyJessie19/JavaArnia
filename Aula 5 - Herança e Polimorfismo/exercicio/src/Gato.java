public class Gato extends Animal {

    public Gato(String name) {
        super(name);
    }

    @Override
    public String emitirSom() {
        return "Miau";
    }
}

public class Cachorro extends Animal {
    private String dono;

    public Cachorro(String name, String dono) {
        super(name);
        this.dono = dono;
    }

    @Override
    public String emitirSom() {
        return "Au Au";
    }

}

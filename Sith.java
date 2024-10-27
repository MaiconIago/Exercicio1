public class Sith extends Forca {
    public Sith(String nome, int vida) {
        super(nome, vida); 
        setGenero("Sith"); 
    }

    @Override
    public void atacar(Forca f) {
        super.atacar(f); 
        System.out.println(getNome() + "usou um ataque Sith!");
    }
}


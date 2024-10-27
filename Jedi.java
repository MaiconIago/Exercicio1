public class Jedi extends Forca {
    public Jedi(String nome, int vida) {
        super(nome, vida); 
        setGenero("Jedi"); 
    }

    @Override
    public void atacar(Forca f) {
        super.atacar(f); 
        System.out.println(getNome() + "usou o poderzinho!");
    }
}




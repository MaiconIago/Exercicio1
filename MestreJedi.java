public class MestreJedi extends Jedi {
    public MestreJedi(String nome, int vida) {
        super(nome, vida);
        setForca(100); 
    }

    @Override
    public void atacar(Forca f) {
        super.atacar(f);
        System.out.println(getNome() + " esquece que o homen tem poder");
    }
}



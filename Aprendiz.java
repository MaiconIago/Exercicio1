public class Aprendiz extends Sith {
    public Aprendiz(String nome, int vida) {
        super(nome, vida);
        setForca(120); 
    }

    @Override
    public void atacar(Forca f) {
        super.atacar(f);
        System.out.println(getNome() + " isso sim que é poder!");
    }
    
}
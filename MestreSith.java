public class MestreSith extends Sith {
    public MestreSith(String nome, int vida) {
        super(nome, vida);
        setForca(120); 
    }

    /**
     *
     * @param f
     */
    @Override
    public void atacar(Forca f) {
        super.atacar(f);
        System.out.println(getNome() + "isso sim que é poder!");
    }
    public void usarRaio() {
        System.out.println(getNome() + "lançou raio!");
    }
}
    
    


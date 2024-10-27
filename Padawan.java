public class Padawan extends Jedi {
    public Padawan(String nome, int vida) {
        super(nome, vida);
        setForca(20); 
    }

    @Override
    public void atacar(Forca f) {
        super.atacar(f);
        System.out.println(getNome() + "muito fraco");
    }
}

    

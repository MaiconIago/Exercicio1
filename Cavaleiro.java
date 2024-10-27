public class Cavaleiro extends Jedi {
    public Cavaleiro(String nome, int vida) {
        super(nome, vida);
        setForca(70); 
    }

    @Override
    public void atacar(Forca f) {
        super.atacar(f);
        System.out.println(getNome() + "tá começando a mandar bem!");
    }
    }

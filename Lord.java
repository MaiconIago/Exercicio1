public class Lord extends Sith {
    public Lord(String nome, int vida) {
        super(nome, vida);
        setForca(80); 
    }

    @Override
    public void atacar(Forca f) {
        super.atacar(f);
        System.out.println(getNome() + "é um Lord Sith temido por todos!");
    }
}


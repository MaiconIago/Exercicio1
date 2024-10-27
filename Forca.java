public class Forca {
    private int forca;
    private int vida;
    private String genero;
    private String nome;

    public Forca(String nome, int vida) {
        this.nome = nome;
        this.vida = vida;
    }

    public static void main(String[] args) {
        Forca jedi1Forca = new Forca("Padawan", 20);
        Forca jedi2Forca = new Forca("Cavaleiro", 70);
        Forca jedi3Forca = new Forca("Mestre Jedi", 100);

        Forca sith1Forca = new Forca("Aprendiz Sith", 40);
        Forca sith2Forca = new Forca("Lord Sith", 80);
        Forca sith3Forca = new Forca("Mestre Sith", 120);
        
        // Imprimindo informações de cada Jedi
        System.out.println("Nome: " + jedi1Forca.getNome() + ", Vida: " + jedi1Forca.getVida());
        System.out.println("Nome: " + jedi2Forca.getNome() + ", Vida: " + jedi2Forca.getVida());
        System.out.println("Nome: " + jedi3Forca.getNome() + ", Vida: " + jedi3Forca.getVida());

       System.out.println("Nome: " + sith1Forca.getNome() + ", Vida: " + sith1Forca.getVida());
       System.out.println("Nome: " + sith2Forca.getNome() + ", Vida: " + sith2Forca.getVida());
       System.out.println("Nome: " + sith3Forca.getNome() + ", Vida: " + sith3Forca.getVida());
    }



    public int getForca() {
        return forca;
    }

    public int getVida() {
        return vida;
    }

    public String getGenero() {
        return genero;
    }

    public String getNome() {
        return nome;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void atacar(Forca f) {
        System.out.println(nome + " puxou o sabre para atacar " + f.nome);
    }
}

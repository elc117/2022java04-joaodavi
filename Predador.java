class Predador {
    protected String nome;
    protected int numPresas;

    public Predador (String nome, int numPresas) {
        this.nome  = nome;
        this.numPresas = numPresas;
    }

    public Predador () {
        this.nome = "";
        this.numPresas = 0;
    }

    public String getNome() {
        return nome;
    }

    public int getNumPresas() {
        return numPresas;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNumPresas(int numPresas) {
        this.numPresas = numPresas;
    }

    public void addPresa () {
        numPresas += 1;
    }

    public void predando () {
        System.out.println("O predador esta predando...");
    }
}
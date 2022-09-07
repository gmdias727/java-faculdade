public class Pessoa {
    private String nome, rg;

    // Construtor padrão
    public Pessoa() {
        nome = "";
        rg = "";
    }

    // Construtor parametrizado
    public Pessoa(String nome, String rg) {
        this.nome = nome;
        this.rg = rg;
    }

    // Construtor de cópia
    public Pessoa(Pessoa p) {
        nome = p.nome;
        rg = p.rg;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public void setPerfil(String valNome, String valRg) {
        nome = valNome;
        rg = valRg;

        System.out.println(nome + rg);
    }
}

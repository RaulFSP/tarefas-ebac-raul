package classes;

public abstract class Pessoa {
    protected String nome;
    protected int cep;

    public Pessoa(String nome, int cep) {
        this.nome = nome;
        this.cep = cep;
    }

    public Pessoa() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCep() {
        return cep;
    }

    public void setCep(int cep) {
        this.cep = cep;
    }

    public abstract void pagarImposto();
    public abstract void abrirContaBancaria();
}

package classes;

public class PessoaFisica extends Pessoa{
    private String dataNascimento;
    private String cpf;
    public PessoaFisica(String nome,int cep,String dataNascimento,String cpf) {
        super(nome,cep);
        this.dataNascimento = dataNascimento;
        this.cpf = cpf;
    }

    public PessoaFisica() {
    }

    public void votar(){
        System.out.printf("%s votou nas eleições!%n",this.getNome());
    }

    @Override
    public void pagarImposto() {
        System.out.printf("%s pagou seu IRPF!%n",this.getNome());
    }

    @Override
    public void abrirContaBancaria() {
        System.out.printf("%s abriu uma conta poupança no banco!%n",this.getNome());
    }

    @Override
    public String toString() {
        return "PessoaFisica{" +
                "dataNascimento='" + dataNascimento + '\'' +
                ", cpf=" + cpf +
                ", nome='" + nome + '\'' +
                ", cep=" + cep +
                '}';
    }
}

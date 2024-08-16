package classes;

import java.sql.SQLOutput;

public class PessoaJuridica extends Pessoa{

    private String cnpj;

    public PessoaJuridica(String nome, int cep, String cnpj) {
        super(nome, cep);
        this.cnpj = cnpj;
    }

    public PessoaJuridica() {

    }

    @Override
    public void pagarImposto() {
        System.out.printf("%s pagou o simples nacional!%n",this.getNome());
    }

    @Override
    public void abrirContaBancaria() {
        System.out.printf("%s abriu um conta empresarial no banco!",this.getNome());
    }

    @Override
    public String toString() {
        return "PessoaJuridica{" +
                "cnpj='" + cnpj + '\'' +
                ", nome='" + nome + '\'' +
                ", cep=" + cep +
                '}';
    }
}

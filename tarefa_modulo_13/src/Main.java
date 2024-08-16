import classes.PessoaFisica;
import classes.PessoaJuridica;

public class Main {
    public static void main(String[] args) {

        PessoaFisica fulano = new PessoaFisica("Fulano",12340888,"01/01/2000","111.222.333-89");
        System.out.println(fulano.toString());
        fulano.votar();
        fulano.abrirContaBancaria();
        fulano.pagarImposto();

        PessoaJuridica fulanoLTDA = new PessoaJuridica("FulanoLTDA",12340900, "00.623.904/0001-73");
        System.out.println(fulanoLTDA.toString());
        fulanoLTDA.pagarImposto();
        fulanoLTDA.abrirContaBancaria();
    }
}
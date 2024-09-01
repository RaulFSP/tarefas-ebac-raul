package tarefa_annotation;

@TabelaAnnotation(nome = "primeiraTabela")
public class TabelaClasse
{
	
	private String nome;
	public TabelaClasse() {
		this.nome = getClass().getAnnotation(TabelaAnnotation.class).nome();
	}
	public String getNome()
	{
		return nome;
	}
	public void setNome(String nome)
	{
		this.nome = nome;
	}
	
}

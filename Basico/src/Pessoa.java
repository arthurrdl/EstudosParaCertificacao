
public class Pessoa {
	private int  pessoaId;
	private String  nome;
	private int  idade;
	
	public int getPessoaId() {
		return pessoaId;
	}
	public void setPessoaId(int pessoaId) {
		this.pessoaId = pessoaId;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	@Override
	public String toString() {
		return   "ID    : "+this.pessoaId+
				 "Nome  : "+this.nome+
				 "Idade : "+this.idade;
	}
}
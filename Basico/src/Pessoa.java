
public class Pessoa {
	private int id;
	private int idade;
	private String nome;
	private Endereco endereco;
	
	
	public void setId(int id) {
		this.id = id;
	}
	public int getId() {
		return this.id;
	}
	public void setIdade(int idade) {
		this.idade= idade;
	}
	public int getIdade() {
		return this.idade;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return this.nome;
	}	
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public Pessoa (int id , String nome, int idade ) {
		this.id = id;
		this.idade= idade;
		this.nome = nome;
	}
	public Pessoa() {}
	
	public String toString() {
		return " \n Nome : "+this.nome+
				"\n Idade : "+this.idade+
				"\n Id : "+this.id + "\n -------------------------------------\n"+ getEndereco();
				
	}
	
	
}


public class Endereco {
	private String logradouro;
	private int numero;
	private String bairro;
	private String cidade;
	private String estado;
	
	public Endereco() {}
	public Endereco(String rua, int numero, String bairro, String cidade, String estado) {
		this.logradouro = rua;
		this.numero = numero;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
	}
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	public String toString() {
		return  " Rua : "+this.logradouro+
				" N� : "+this.numero+
				"\n Bairro : "+this.bairro+
				" Cidade : "+this.cidade+
				" UF : "+this.estado;
				
	}
	
}

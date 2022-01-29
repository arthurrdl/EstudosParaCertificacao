import java.util.Date;

public class Casa {
	private int id;
	private String noma;
	private Endereco endereco;
	private Comodo[] comodo;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNoma() {
		return noma;
	}
	public void setNoma(String noma) {
		this.noma = noma;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public Comodo[] getComodo() {
		return comodo;
	}
	public void setComodo(Comodo[] comodo) {
		this.comodo = comodo;
	}
	
	
	
}


public class Teste {
	public static void main(String[] args) {
		Endereco endereco = new Endereco();
		endereco.setLogradouro("Rua 0");
		Pessoa p = new Pessoa();
		p.setNome("Arthur");
		p.setEndereco(endereco);		
		System.out.println(p);
	}
}

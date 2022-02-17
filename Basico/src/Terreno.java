	
public class Terreno {
	private double largura;
	private double  comprimento;
	private double precoMetroQuadrado;
	private double areaDoTerreno;
	private double precoDoTerreno;
	
	public Terreno( double largura, double comprimento, double precoMetroQuadrado) { 
			this.comprimento = comprimento;
			this.largura = largura;
			this.precoMetroQuadrado = precoMetroQuadrado;
			calcularArea();
			calcularPreco();
		
	}	
	private void calcularArea() {
		areaDoTerreno = this.comprimento * this.largura; 
	}	
	private void calcularPreco() {
		precoDoTerreno = this.precoMetroQuadrado * this.areaDoTerreno;
	}	
	 @Override
	public String toString() {		
		return  "\n Largura do terreno       : "+String.format("%.1f", this.largura)+
				"\n Comprimento do terreno   : "+String.format("%.1f", this.comprimento)+
				"\n Valor por metro quadrado : "+String.format("%.2f", this.precoMetroQuadrado)+
				"\n Área do terreno          : "+String.format("%.2f", this.areaDoTerreno)+
				"\n Preço do terreno         : "+String.format("%.2f", this.precoDoTerreno);
	}
	
}


public class Eixos {
	private double x;
	private double y;
	private String localizacao;
	
	public Eixos(double x , double y) {
		this.x = x;
		this.y = y;
		if (x==y && x == 0 ) {
			localizacao = "Origem";
		}else if(x==0 && y!=x) {
			localizacao = "Eixo Y";
		}else if(y==0 && x!=y) {
			localizacao = "Eixo X";
		}else if(x>0 && y>0 ) {
			localizacao = "Q1";
		}else if(x>0 && y<0 ) {
			localizacao="Q4";
		}else if(x<0 && y>0) {
			localizacao="Q2";
		}else { 
			localizacao="Q3";
		}
	}
	@Override
	public String toString() {		
		return "\n Valor de X : "+String.format("%.1f",this.x)+
			   "\n Valor de Y : "+String.format("%.1f",this.y)+
			   "\n "+this.localizacao;
	}
}

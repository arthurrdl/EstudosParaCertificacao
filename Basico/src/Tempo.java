	
public class Tempo {
	private int segundos;
	private int horas;
	private int minutos;
	
	public Tempo (int segundos) {		
		 this.horas = segundos / 3600;
		 segundos = segundos % 3600;
		 this.minutos = segundos / 60; 
		 segundos = segundos % 60 ;
		 this.segundos = segundos;
	}
	
	@Override
	public String toString() {		
		return this.horas+":"+this.minutos+":"+this.segundos;
	}	
	 
}

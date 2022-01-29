
public enum EnumMobilia {
	CAMADECASAL("Cama de Casal"),
	CAMADESOLTEIRO("Cama de solteiro"),
	SOFADOISLUGARES("Sofa dois lugares"),
	SOFATRESLUGARES("Sofa tres lugares"),
	SOFAQUATROLUGARES("Sofa quatro lugares");
	private String mobilia;
	EnumMobilia(String furniture ){ mobilia = furniture;}
	public String getMobilia() {return mobilia;}
	
}


public enum EnumTipoDeLimpeza {
	LIMPAR("Limpar"),
	ASPIRAR("Aspirar"),
	VARRER("Varrer"),
	LUSTRAMOVEIS("Lustrar os móveis"),
	LAVAR("Lavar");
	
	private String 	tipo;
	EnumTipoDeLimpeza(String tipoDeLimpeza){ tipo = tipoDeLimpeza;}
	public String getTipoDeLimpeza() {return tipo;}
}

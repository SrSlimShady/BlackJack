public class Carta {
	
	private String Naipe;
    private String Tipo;
    private int Valor;
    
	public Carta(String naipe, String tipo){
    	 
        Naipe = naipe;
        Tipo = tipo;
        if(Tipo.equals("A")){
            Valor = 1; // especificar na hora de chamar se vale 1 ou 11
        } else if (Tipo.equals("J") || Tipo.equals("Q") || Tipo.equals("K")){
            Valor = 10;
        } else {
            Valor = Integer.parseInt(tipo);
        }
	}
	
	public int getValor() {
		return Valor;
	}
	
	public String getNaipe() {
		return Naipe;
	
	}
	public String getTipo() {
		return Tipo;
	}

	
}
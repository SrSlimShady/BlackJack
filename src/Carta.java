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
    
	public void Mostrar() {
		String naipe;
		String tipo;
		
		if(Naipe.equals("P"))
			naipe = "Paus";
		else if(Naipe.equals("O"))
			naipe = "Ouro";
		else if(Naipe.equals("C"))
			naipe = "Copas";
		else
			naipe = "Espadas";
		
		if(Tipo.equals("A"))
			tipo = "Ás";
		else if(Tipo.equals("J"))
			tipo = "Valete";
		else if(Tipo.equals("Q"))
			tipo = "Dama";
		else if(Tipo.equals("K"))
			tipo = "Rei";
		else
			tipo = Tipo;
		
		System.out.println(tipo + " De " + naipe);
			
	}
	
}
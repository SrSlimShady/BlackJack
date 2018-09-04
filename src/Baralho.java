import java.util.ArrayList;
import java.util.Random;

 public class Baralho {
	 
    private ArrayList<Carta> baralho;
    private String[] Naipes = {"P","O","C","E"}; //Paus, Ouro, Copa, Espadas
    private String[] Tipos = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
    
     public Baralho(){
        baralho = new ArrayList<Carta>();
        for (String naipe : Naipes ) {
            for (String tipo : Tipos ) {
                baralho.add(new Carta(naipe,tipo));
            }
        }
    }
    
    public void Embaralhar(){
    	ArrayList<Carta> NovoBaralho = new ArrayList<Carta>();
    	Random aleatorio = new Random();
    	int tamanho = baralho.size();
    	
    	//For para embaralhar
    	for(int i = 0; i < tamanho; i++) {
    		
    	}
    	
    	//Baralho atual recebe o baralho embaralhado
    	baralho = NovoBaralho;
    }
    
    public void MostrarBaralho(){
    	for(Carta carta : baralho) {
    		carta.Mostrar();
    	}
    }
}
import java.util.ArrayList;
import java.util.Random;

 public class Baralho {
	 
    private ArrayList<Carta> baralho;
    private String[] Naipes = {"P","O","C","E"}; //Paus, Ouro, Copa, Espadas
    private String[] Tipos = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
    
    // somente instacie esta classe, que ela já inicia as cartas.
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
    	int maximo = 0;
    	//For para embaralhar
    	for(int i = 0; i < tamanho; i++) {
    		maximo = tamanho - i;
    		// o aleatorio vai de 0 até o valor que eu passei. que é o tamanho menos o index
    		int index = aleatorio.nextInt(maximo);
    		Carta a = baralho.get(index);
    		baralho.remove(index);
    		NovoBaralho.add(i, a);
    	}
    	//Baralho atual recebe o baralho embaralhado
    	baralho = NovoBaralho;
    }
    
    public void MostrarBaralho(){
    	for(Carta carta : baralho) {
    		carta.Mostrar();
    	}
    }
    
    public Carta receberCarta() {
    	return baralho.remove(0);
    }
    
}
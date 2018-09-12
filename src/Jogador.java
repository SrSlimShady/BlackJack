import java.util.ArrayList;

public class Jogador {

    private String apelido;
    private double Money;
    private ArrayList<Carta> cartaJogador;
    private double pontuacao=0;

    //Constructor: jogador recebe um apelido.
    public Jogador(String apelido, double money){
        this.apelido = apelido;
        Money = money;
        cartaJogador = new ArrayList<>();
    }

    
    /******************* MÉTODOS CONTROLE JOGADOR *****************************/
    //Método Get Apelido
    public String getApelido() {
        return apelido;

    }

    //Método Set Apelido
    public void setApelido(String apelido) {
        this.apelido = apelido;
    }
    
    /******************* MÉTODOS CONTROLE DO DINHEIRO *****************************/
    //Metodo Get money
    public double getMoney() {
        return Money;
    }
    
    //Adicionar dinheiro ao jogador
    public void AddMoney(double money) {
    	Money += money;
    }
    
    //Remover dinheiro do jogador
    public boolean RemoveMoney(double money) {
    	if(money > Money)
    		return false;
    	else {
    		Money = Money - money;
    		return true;
    	}
    }
    
    /******************* MÉTODOS CONTROLE CARTAS *****************************/
    //Método para adicionar uma carta ao jogador
    public void addCartaJogador(Carta carta){
        cartaJogador.add(carta);
    }
    
    
    //Método para limpar uma carta do jogador
    public void LimparCartas() {
    	cartaJogador.clear();		
	}
    
    //Método para somar potuação das cartas
    public int somarCartas() {
    	int soma=0, contAce=0;
    	
		for(Carta carta : cartaJogador){
        	soma +=carta.getValor();
        	if (carta.getTipo()=="A") contAce++;
        }
		if(contAce>0 && (soma+10)<=21) soma += 10;
		return soma;
	}
    
    //Método para impressão das cartas do jogador
    public void imprimeCartasJogador(){
        if(cartaJogador != null){

        	Molde mol = new Molde();
        	
        	int n = cartaJogador.size();
        	
        	String[][] cartasImp = new String[n][n];
    		int tmIMPARhz = 11;
    		int tmIMPARvt = 7;
    		int moldeOpt=1;
    		
    		int i=0;
    		for(Carta carta : cartaJogador){
            	
            	cartasImp[0][i] = carta.getTipo();
            	cartasImp[1][i] = carta.getNaipe();
            	i++;
            }
    		
			mol.MoldeCartas(cartasImp, moldeOpt, tmIMPARhz, tmIMPARvt);
            
        }
    }
    
    //Método para guardar potuação da partida
  //Metodo Get money
    public double getPontuacao() {
        return pontuacao;
    }
    
    public void setPontuacao(double pontos ) {
        this.pontuacao=pontos;
    }

}
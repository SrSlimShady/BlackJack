import java.util.ArrayList;

public class Jogador {

    private String apelido;
    private double money = 100;
    private ArrayList<Carta> cartaJogador;

    //Constructor: jogador recebe um apelido.
    public Jogador(String apelido, double money){
        this.apelido = apelido;
        this.money = money;
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
        return money;
    }
    
    //Metodo para Setar o money
    /*
    * Metodo Setter do Dinheiro.
    * @<b>Sitaxe:</b><i>Srint setMoney (double money, boolean option)</i>
    * @money : é o dinheiro a ser usado.
    * @option : true or 1 = adicionar dinheiro; false, 0 or default = retirar dinheiro;
    *@autor Johnny Lima
    */
    public void setMoney(double money, int option ) {
        switch (option) {
            case 1: //Adicionar money
                    this.money += money;
                break;

            case 0: //retirar money
                    this.money -= money;
                break;

            default: //retirar money
                    this.money -= money;
                break;
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

}
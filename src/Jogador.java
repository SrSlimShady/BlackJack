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
    
    //Método para retornar valor da carta    
    public int ValorCartasJogador(){
        int valor = 0;
        for(Carta carta : cartaJogador){
            
            if(carta.getValor() < 11){
                valor += carta.getValor();
            }else if(carta.getValor() > 10 && carta.getValor() < 15){
                valor += 10;
            }
            
            //falta colocar a regra para o ACE que pode ser 1 ou 11
        }
        return valor;
    }
    
    //Método para impressão das cartas do jogador
    public void imprimeCartasJogador(){
        if(cartaJogador != null){
            for(Carta carta : cartaJogador){
            	
//            	carta.naipe
//            	carta.tipo
//            	
                System.out.print(carta.toString() + " ");
            }                
        }
        
        System.out.println("");
    }

}
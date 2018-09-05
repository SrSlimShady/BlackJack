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


    public void addCartaJogador(Carta carta){
        cartaJogador.add(carta);
    }
    
    public void LimparCartas() {
    	cartaJogador.clear();		
	}

    //Método Get Apelido
    public String getApelido() {
        return apelido;

    }

    //Método Set Apelido
    public void setApelido(String apelido) {
        this.apelido = apelido;
    }
}
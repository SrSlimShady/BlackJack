import java.util.ArrayList;
 public class Jogador {
     private String apelido;
    private money;
    private double money = 100;
    private ArrayList<Carta> cartaJogador;
     //Constructor: jogador recebe um apelido.
    public jogador(String apelido){
    public jogador(String apelido, double money){
        this.apelido = apelido;
        this.money = money;
        cartaJogador = new ArrayList<>();
    }
     //Método Get money
    public double getMoney() {
        return money;
    }
     //Método para Setar o money
    /*
    * Método Setter do Dinheiro.
    * @<b>Sitaxe:</b><i>Srint setMoney (double money, boolean option)</i>
    * @money : é o dinheiro a ser usado.
    * @option : true or 1 = adicionar dinheiro; false, 0 or default = retirar dinheiro;
    *@autor Johnny Lima
    */
    public void setMoney(double money, boolean option ) {
        private err ;
        switch (option) {
            case true: //Adicionar money
                    this.money += money;
                break;
             case false: //retirar money
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
     //Método Get Apelido
    public String getApelido() {
        return apelido;
     }
     //Método Set Apelido
     public void setApelido(String apelido) {
         this.apelido = apelido;
     }
 }
public class Carta {
    private String Naipe;
    public Integer Valor;
    public String Tipo;

    public Carta(String naipe, String tipo){
        Naipe = naipe;
        Tipo = tipo;
        if(tipo.equals("A")){
            Valor = 1;
        } else if(tipo.equals("K") || tipo.equals("J") || tipo.equals("Q")){
            Valor = 10;
        } else {
            Valor = Integer.parseInt(tipo);
        }
    }

    public void Mostrar(){

    }

}

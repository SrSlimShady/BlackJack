import java.util.ArrayList;

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

    }

    public void MostrarBaralho(){

    }
}

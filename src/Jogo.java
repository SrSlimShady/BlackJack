
public class Jogo {
	
	private Baralho brl;
	
	public Jogo() {
		brl = new Baralho();
		brl.CriarBaralho();// Imagino que esta classe já está no constructor. //Confirmar
		brl.MostrarBaralho();
	}
	
	public void Rodada(double aposta, Jogador jogador) {
		
		//Ao ser iniciado um novo jogo, devemos limpar todas as classes.
		brl.Embaralhar();
		jogador.LimparCartas();
		
		//Fazendo retirada da aposta.
		jogador.setMoney(aposta, 0);// 1 = add; 0 = ret;
		
		//Início
		System.out.println("\nRodada Iniciada");
		
		
		
		
	}
	

}

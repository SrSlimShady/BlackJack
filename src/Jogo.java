import java.util.ArrayList;
import java.util.Scanner;

public class Jogo {
	
	private Baralho brl;
	
	public Jogo() {
		brl = new Baralho();
		//brl.CriarBaralho();// Imagino que esta classe j� est� no constructor. // est� no construtor, n�o precisa chamar isso
		//brl.MostrarBaralho();
		
	}
	
	public void Rodada(double aposta, Jogador jogador1,  Jogador jogador2) {
		
		//PAGINA
				int tmPag = 40;
				tmPag -= 1; //necess�rio diminuir 1
				int dec=0; //contador de decremento de linha
		//MOLDE
				int moldeOpt = 1;
				int tm = 83;
		//MENU
				int optMolde = 0; //0 = simples ou 1 = duplo
				int tmMolde = 25;
				
				Molde mol = new Molde();
				
				
				Scanner entrada = new Scanner(System.in);
				
				
		
		
		/************************************************************************/
		/*******************      CONFIGURANDO O JOGO          ******************/
		/************************************************************************/
		//Ao ser iniciado um novo jogo, devemos limpar todas as classes.
		brl.Embaralhar();
		jogador1.LimparCartas();
		jogador2.LimparCartas();
		
		//Fazendo retirada da aposta. de todos os jogadores
		jogador1.setMoney(aposta, 0);// 1 = add; 0 = ret;
		jogador2.setMoney(aposta, 0);// 1 = add; 0 = ret;
		
		/************************************************************************/
		/*******************           1� RODADA               ******************/
		/************************************************************************/
		
		
		
		/******************************||||||||||||||||||||||||||||||||||************************************/
		//IMPRESS�O DO TOPO
		for (int i = 0; i < 50; ++i) System.out.println(); //ESPA�O BRANCO	
		//IMPRESS�O DO TOPO
		mol.Titulo(); /*9 LINHAS*/ dec += 9;
		mol.Molde("1� RODADA", moldeOpt, tm); /* 3 LINHAS */ dec += 3;
		/**********************************************************************/
		System.out.printf("\n");  /* 1 LINHA */ dec += 1;
		mol.Molde(("1 - "+jogador1.getApelido()+" | R$ "+jogador1.getMoney())		,optMolde,tmMolde);  /* 3 LINHAS */ dec += 3;
		mol.Molde(("1 - "+jogador2.getApelido()+" | R$ "+jogador2.getMoney())		,optMolde,tmMolde);  /* 3 LINHAS */ dec += 3;	
		
		System.out.printf("\n\n\n");  /* 1 LINHA */ dec += 3;
		
		System.out.println("--> Rodada Iniciada");  /* 1 LINHA */ dec += 1;
		System.out.println("--> Valor da aposta R$ "+(aposta));  /* 1 LINHA */ dec += 1;
		System.out.println("--> A banca est� distribuindo as cartas...\n");  /* 1 LINHA */ dec += 1;
		
		
		
		/*>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>*/
		//nessa parte ocorre a distribui��o das cartas ao jogadores. Cada jogador recebem 2 cartas para come�ar.
		
		//1� CARTA
		jogador1.addCartaJogador(brl.receberCarta()); //M�todo de retirar uma carta da cole��o
		//2� CARTA
		jogador1.addCartaJogador(brl.receberCarta()); //M�todo de retirar uma carta da cole��o
		
		//1� CARTA
		jogador2.addCartaJogador(brl.receberCarta()); //M�todo de retirar uma carta da cole��o
		//2� CARTA
		jogador2.addCartaJogador(brl.receberCarta()); //M�todo de retirar uma carta da cole��o

		
		jogador1.ValorCartasJogador();
		/*>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>*/
		
		
		
		/*ESPA�O BRANCO*/
		for (int i = 0; i < (tmPag - dec - 1 ); ++i) System.out.println(); /*zerar dec*/ dec=0;						
		System.out.println(""); // 1 LINHA

		/******************************||||||||||||||||||||||||||||||||||************************************/
		
		
		
		
		
		
		
		
		
		
		
//		System.out.println("Voc� somou "+ jogador1.ValorCartasJogador()+" pontos com as seguintes cartas: ");

		
		
		
		
	}
	

}

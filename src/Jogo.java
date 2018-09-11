import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;



public class Jogo {
	
	private Baralho brl;
	private double apostaRodada=0;
	
	ArrayList<Jogador> Jogadores = new ArrayList<Jogador>();
	ArrayList<Jogador> Ganhador = new ArrayList<Jogador>();
	
	public Jogo() {
		brl = new Baralho();
	}
	
	
	public void Rodada(Jogador jogador1,  Jogador jogador2) {
		

		Jogadores.add(jogador1);
		Jogadores.add(jogador2);
		
		//PAGINA
				int tmPag = 40;
				int dec=0; //contador de decremento de linha
		//MOLDE
				int moldeOpt = 1;
				int tm = 83;
		//MENU
				int optMolde = 0; //0 = simples ou 1 = duplo
				int tmMolde = 25;
				
				Molde mol = new Molde();
				
				
				Scanner entrada = new Scanner(System.in);
				
		//VARI�VEIS
				int opt=1, i=0, j=0, rodada=1, novaRodada=0;
				boolean end=false, perdeu=false, empate=false, ultimo=false;
				double somaAtual=1, somaMaior=0, segundaMaior=0;
				List pontuacoes = new ArrayList();
				
		
		
		/******************************||||||||||||||||||||||||||||||||||************************************/
		
		do {
			//IMPRESS�O DO TOPO
			mol.Titulo(true, "INICIAR APOSTA", moldeOpt, tm); /*9 LINHAS*/ dec += 9+3+1;
			do{
				mol.Molde(((j+1)+" - "+Jogadores.get(j).getApelido()+" | R$ "+Jogadores.get(j).getMoney())		,optMolde,25);  /* 3 LINHAS */ dec += 3;
				j++;
			}while(j==Jogadores.size()-1);
			j=0;
			
			
			/*RODAP�*/
			dec = mol.RodapeOpt(tmPag, dec, "Porfavor, digite o o valor da aposta: "); // RECEBE ZERO	
			
			double aposta = entrada.nextDouble();
	//		double aposta = 10;
					
			
			/************************************************************************/
			/*******************      CONFIGURANDO O JOGO          ******************/
			/************************************************************************/
			//Ao ser iniciado um novo jogo, devemos limpar todas as classes.
			brl.Embaralhar();
			jogador1.LimparCartas();
			jogador2.LimparCartas();
			
			//Fazendo retirada da aposta. de todos os jogadores
			do{
				Jogadores.get(j).setMoney(aposta, 0);// 1 = add; 0 = ret;
				setApostaRodada(aposta, 1);// 1 = add; 0 = zera;
				j++;
			}while(j==Jogadores.size()-1);
			j=0;
	
			
			/************************************************************************/
			/*******************             RODADA                ******************/
			/************************************************************************/
			
			
			
			/******************************||||||||||||||||||||||||||||||||||************************************/
			
			/*>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>*/
			//nessa parte ocorre a distribui��o das cartas ao jogadores. Cada jogador recebem 2 cartas para come�ar.
			
			for(Jogador jogador: Jogadores) {
				//1� CARTA
				jogador.addCartaJogador(brl.receberCarta()); //M�todo de retirar uma carta da cole��o
				//2� CARTA
				jogador.addCartaJogador(brl.receberCarta()); //M�todo de retirar uma carta da cole��o			
			}
			/*>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>*/
			
			
			String head = rodada+"� RODADA   |   APOSTA: "+aposta;
	
			
			do {
				if(ultimo)end=true;
				//IMPRESS�O DO TOPO
				mol.Titulo(true, head, moldeOpt, tm); /*9 LINHAS*/ dec += 9+3+1;
	
				//MEIO
				
				System.out.println("--> A banca distribuiu as duas primerias cartas!");  /* 1 LINHA */ dec += 1;
				System.out.println("\n");  /* 1 LINHA */ dec += 1;
				
				//IMPRESS�O DAS CARTAS
				do {
					//CABE�ALHO JOGADOR
					String[] menu={((j+1)+" - "+Jogadores.get(j).getApelido()+" | R$ "+Jogadores.get(j).getMoney()),("PONTUA��O: "+Jogadores.get(j).somarCartas())};
					mol.MoldeHZ(menu, optMolde, tmMolde, true);  /* 3 LINHAS */ dec += 3;	
					
					//IMPRIME CARTAS
					Jogadores.get(j).imprimeCartasJogador(); /* 7 LINHAS */ dec += 7;
					
					if(j==0)System.out.println();  /* 1 LINHA */ dec += 1;
					j++;
				}while(j==Jogadores.size()-1);
				
				//CONDI��O SOBRE POTUA��O
				pontuacoes.clear();//zerando o array de pontua��es
				for(Jogador jogador: Jogadores) {
					
					//Somando a pontua��o atual do jogador
					somaAtual = jogador.somarCartas();
					//Jogador recebendo pontua��o atual
					jogador.setPontuacao(somaAtual);
					
					//Se a pontua��o do jogador for maior ou igual a 21 o jogo encerra (s� serve para dois jogadores)
					if (jogador.getPontuacao()>=21) end=true;
					
					//Se pontua��o do jogador atual foi maior que a ultima registrada, temos um novo ganhador.
					if(somaAtual>somaMaior && somaAtual<=21) {
						//Soma maior recebe a soma atual
						somaMaior = somaAtual;
						//Ganhador definido
						Ganhador.clear();
						Ganhador.add(jogador);
					}					
					//Guardando as pontua��es para fazer compara��es
					pontuacoes.add(jogador.getPontuacao());
				}somaMaior=0;somaAtual=0;
				
				//CONDI��O DE EMPATE
				Collections.sort(pontuacoes); //Colocando em ordem
				
				for(int b=1; b<pontuacoes.size() ; b++) {
					if(pontuacoes.get(b-1).equals(pontuacoes.get(b))) {
						empate = true;
					}
				}
				//zerando lista de pontua��es
				pontuacoes.clear();
				
				if(!end) { //conferir se � o ultimo jogador
					
					/*RODAP�*/
					dec = mol.RodapeOpt(tmPag, dec, (Jogadores.get(i).getApelido()+", deseja receber mais cartas (1=sim, 0=n�o)? ")); // RECEBE ZERO
	
					opt = entrada.nextInt();
					
					if (opt == 1) {
						Jogadores.get(i).addCartaJogador(brl.receberCarta());
						j=0;
					}else {
						i++;
						j=0;
						if(Jogadores.size()==i) ultimo=true;
					}
				}else {
					System.out.println();  /* 1 LINHA */ dec += 1;
					if(empate==true) {
						
						System.out.println("O Jogo ficou empatado, as aposta ser�o devolvidas");  /* 1 LINHA */ dec += 1;
						
						for(Jogador jogador: Jogadores) {
							jogador.setMoney(aposta, 1);// 1 = add; 0 = ret;
						}
						
						setApostaRodada(0, 0);//ZERANDO A APOSTA
					}else {
						Ganhador.get(0).setMoney(getApostaRodada(), 1); //VALOR DA APOSTA AO VENCEDOR
						setApostaRodada(0, 0);//ZERANDO A APOSTA
						System.out.println("Parab�ns "+Ganhador.get(0).getApelido()+", voc� ganhdou com "+Ganhador.get(0).getPontuacao()+" pontos. Seu novo Saldo ser� de R$ "+Ganhador.get(0).getMoney());  /* 1 LINHA */ dec += 1;
					}
					end=true;
				}
				
			}while (end==false);
			
			/******************************||||||||||||||||||||||||||||||||||************************************/
			//ZERAR TODAS AS VARI�VEIS
			opt=1; i=0; j=0; rodada+=1; novaRodada=0;
			end=false; perdeu=false; empate=false; ultimo=false;
			somaAtual=1; somaMaior=0; segundaMaior=0;
			pontuacoes.clear(); Ganhador.clear();
			
			
			/*RODAP�*/
			dec = mol.RodapeOpt(tmPag, dec, "Iniciar nova Rodada (1=sim, 0=n�o)? "); // RECEBE ZERO
			
			//LENDO NOVA RODADA
			novaRodada =  entrada.nextInt();
		}while (novaRodada==1);	
		System.out.println("saiu2");
	//		System.out.println("Voc� somou "+ jogador1.ValorCartasJogador()+" pontos com as seguintes cartas: ");
	}
	
	
	
	
	
	public void setApostaRodada(double aposta, int option ) {
        switch (option) {
            case 1: //juntar aposta
                    this.apostaRodada += aposta;
                break;

            case 0: //zerar aposta
                    this.apostaRodada=0;
                break;
               
            default: //zerar aposta
                    this.apostaRodada=0;
                break;
        }
    }
	public double getApostaRodada(){
		return apostaRodada;
	}

	
}

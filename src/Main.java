import java.util.Scanner;
import java.util.function.Function;

import javax.sql.RowSetMetaData;



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Jogo BJ = new Jogo();
		
		//Obter o Total de linhas do quadro
//		for (int i = 0; i < 100; ++i) System.out.println(i); //41 LINHAS, contando com o 0
//		System.exit(0);
		
		//PAGINA
		int tmPag = 40;
//		tmPag -= 1; //necessário diminuir 1
		int dec=0; //contador de decremento de linha
		
		String[][] cartas = {{"3","A","2","5","K","J","8"},{"♣","♠","♥","♠","♦","♣","♥"}};
		
		
		
		
		
		//MOLDE
		int moldeOpt = 1;
		int tm = 83;
		
		//MENU
		int optMolde = 0; //0 = simples ou 1 = duplo
		int tmMolde = 25;
		
		Molde mol = new Molde();
		
		
		Scanner entrada = new Scanner(System.in);
		int opcao=0, opt = 0, temMolde=0, opt3=0;
		String msg="", head="", apelido1="", apelido2="";
		double money1=0, money2=0;
		boolean existeJogadores=false;
		
		//CRIANDO O 1º JOGADOR
		Jogador jogador1 = new Jogador(null,0);
		Jogador jogador2 = new Jogador(null,0);
		
		int tmIMPARhz = 11;
		int tmIMPARvt = 7;
		
		//COMEÇO
		do {			
			if (temMolde==0) {
				
				//IMPRESSÃO DO TOPO
				mol.Titulo(); /*9 LINHAS*/ dec += 9;
				
				System.out.printf("\n%s\n",msg); /*o espaço da mensagem contem 2 linhas*/ dec += 2;
				msg="";
				//MENU
				mol.Molde("1 - Jogar"		,optMolde,tmMolde); /* 3 LINHAS */ dec += 3;
				mol.Molde("99 - Sair"		,optMolde,tmMolde);		 /* 3 LINHAS */ dec += 3;
				
				/*RODAPÉ*/
				dec = mol.RodapeOpt(tmPag, dec, "Digite a opcao desejada para 'Lista': "); // RECEBE ZERO	
				opcao = entrada.nextInt();
			}
			else {
				//chamar as opções
				switch (opt) {
				case 1:

					
					if(!existeJogadores) {
						
					
						/************************************************************************/
						/*******************         1º JOGADOR                ******************/
						/************************************************************************/
						
						//IMPRESSÃO DO TOPO
						mol.Titulo(true, head, moldeOpt, tm); /*9 LINHAS*/ dec += 9+3+1;
						
						
						/*RODAPÉ*/
						dec = mol.RodapeOpt(tmPag, dec, "Porfavor, digite o Nome do 1º Jogador: ");
						apelido1 = entrada.next();
//						apelido1 = "JOÃO";
						
						/******************************||||||||||||||||||||||||||||||||||************************************/
						//IMPRESSÃO DO TOPO
						mol.Titulo(true, head, moldeOpt, tm); /*9 LINHAS*/ dec += 9+3+1;
						
						mol.Molde(("1 - "+apelido1)		,optMolde,25);  /* 3 LINHAS */ dec += 3;
						
						
						/*RODAPÉ*/
						dec = mol.RodapeOpt(tmPag, dec, "Porfavor, digite o valor (R$) total do 1º Jogador: "); // RECEBE ZERO
						money1 = entrada.nextDouble();
//						money1 = 500;
	
						/******************************||||||||||||||||||||||||||||||||||************************************/
						//IMPRESSÃO DO TOPO
						mol.Titulo(true, head, moldeOpt, tm); /*9 LINHAS*/ dec += 9+3+1;
						
						mol.Molde(("1 - "+apelido1+" | R$ "+money1)		,optMolde,25);  /* 3 LINHAS */ dec += 3;
						
						//CRIANDO O 1º JOGADOR
						jogador1 = new Jogador(apelido1, money1);
						
						/*                ************************************************************************/
						/*<---------------*******************         2º JOGADOR                ******************/
						/*                ***********************************************************************/
						
						/*RODAPÉ*/
						dec = mol.RodapeOpt(tmPag, dec, "Porfavor, digite o Nome do 2º Jogador: "); // RECEBE ZERO
						apelido2 = entrada.next();
//						apelido2 = "CAIO";
						
						/******************************||||||||||||||||||||||||||||||||||************************************/
						//IMPRESSÃO DO TOPO
						mol.Titulo(true, head, moldeOpt, tm); /*9 LINHAS*/ dec += 9+3+1;
	
						mol.Molde(("1 - "+apelido1+" | R$ "+money1)		,optMolde,25);  /* 3 LINHAS */ dec += 3;
						mol.Molde(("1 - "+apelido2)		,optMolde,25);  /* 3 LINHAS */ dec += 3;
						
						
						/*RODAPÉ*/
						dec = mol.RodapeOpt(tmPag, dec, "Porfavor, digite o o valor (R$) total 2º Jogador: "); // RECEBE ZERO				
						money2 = entrada.nextDouble();
//						money2 = 400;
						
						//CRIANDO O 2º JOGADOR
						jogador2 = new Jogador(apelido2, money2);
						existeJogadores=true;
					}
					
					/******************************||||||||||||||||||||||||||||||||||************************************/
					//IMPRESSÃO DO TOPO
					mol.Titulo(true, head, moldeOpt, tm); /*9 LINHAS*/ dec += 9+3+1;
					
					mol.Molde(("1 - "+apelido1+" | R$ "+money1)		,optMolde,25);  /* 3 LINHAS */ dec += 3;
					mol.Molde(("1 - "+apelido2+" | R$ "+money2)		,optMolde,25);  /* 3 LINHAS */ dec += 3;
					
					
					
		
					/*RODAPÉ*/
					dec = mol.RodapeOpt(tmPag, dec, "Precione 1 para JOGAR ou 0 para voltar ao MENU: "); // RECEBE ZERO		
					
					int opt2 = entrada.nextInt();
//					int opt2 = 1;
					
					
					/************************************************************************/
					/*******************        INICIAR O JOGO             ******************/
					/************************************************************************/

					if (opt2==1) {
						//TODO
						Jogo novoJogo = new Jogo();
						novoJogo.Rodada(jogador1, jogador2);
						
						System.out.print("\n\nDeseja voltar ao MENU inicial (1=sim, 0=não)? ");
						
						//Zerar Jogadores...
						jogador1 = null;
						jogador2 = null;
						existeJogadores=false;
						
						//Caso os jogadores já tenham sido cadastrados não cadastrar novamente...
						
						//LENDO NOVA RODADA
						opt3 =  entrada.nextInt();
						
						
						if(opt3==1) {
							/******************************||||||||||||||||||||||||||||||||||************************************/
							//IMPRESSÃO DO TOPO
							for (int i = 0; i < 50; ++i) System.out.println(); //ESPAÇO BRANCO	
							mol.Titulo(); /*9 LINHAS*/ dec += 9;
							
							System.out.printf("\n%s\n",msg); /*o espaço da mensagem contem 2 linhas*/ dec += 2;
							msg="";
							//MENU
							mol.Molde("1 - Novos Jogadores"		,optMolde,tmMolde); /* 3 LINHAS */ dec += 3;
							mol.Molde("99 - Sair"		,optMolde,tmMolde);		 /* 3 LINHAS */ dec += 3;
							
							/*RODAPÉ*/
							dec = mol.RodapeOpt(tmPag, dec, "Digite a opcao desejada para 'Lista': "); // RECEBE ZERO
							opcao = entrada.nextInt();
							
						}else opcao=99;
						
						

						/******************************||||||||||||||||||||||||||||||||||************************************/
					}
					else {
						
						/******************************||||||||||||||||||||||||||||||||||************************************/
						//IMPRESSÃO DO TOPO
						for (int i = 0; i < 50; ++i) System.out.println(); //ESPAÇO BRANCO	
						mol.Titulo(); /*9 LINHAS*/ dec += 9;
						
						System.out.printf("\n%s\n",msg); /*o espaço da mensagem contem 2 linhas*/ dec += 2;
						msg="";
						//MENU
						mol.Molde("1 - Jogar"		,optMolde,tmMolde); /* 3 LINHAS */ dec += 3;
						mol.Molde("99 - Sair"		,optMolde,tmMolde);		 /* 3 LINHAS */ dec += 3;
						
						/*RODAPÉ*/
						dec = mol.RodapeOpt(tmPag, dec, "Digite a opcao desejada para 'Lista': "); // RECEBE ZERO
						opcao = entrada.nextInt();
						
					}
					
					break;

				default:
					break;
				}
				
				
				head="";
				temMolde=0;
				
			}
			
			
//			opcao = 1;
			switch (opcao) {
				case 1: // criar
					head="Novos Jogadores";
					temMolde=1;
					for (int i = 0; i < 50; ++i) System.out.println(); /* EM BRANCO */
					//Chamar classe
					opt = 1;
					break;
				case 99: //sair
					//IMPRESSÃO DO TOPO
					mol.Titulo(true, "SAIR", moldeOpt, tm); /*9 LINHAS*/ dec += 9+3+1;
					
					/*RODAPÉ*/
					dec = mol.RodapeOpt(tmPag, dec, "Você saiu do Jogo."); // RECEBE ZERO	
					break;
				default: // opcao invalida
					msg = "Opcao Invalida!";
					for (int i = 0; i < 50; ++i) System.out.println(); dec=0;
			}
		} while (opcao != 99); // opcao de saida

	}
	
	public void gerarCabeçalho() {
		
	}
	
	
	

}

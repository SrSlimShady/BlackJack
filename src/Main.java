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
		int opcao, opt = 0, temMolde=0;
		String msg="", head="";
		
		int tmIMPARhz = 11;
		int tmIMPARvt = 7;
//		mol.MoldeCartas(cartas, moldeOpt, tmIMPARhz, tmIMPARvt);
//		String[] menu = {"1 - Novos Jogadores","APOSTA = R$ 30.0","99 - Sair"};
//		mol.MoldeHZ(menu, 1, tmMolde, true);
		
		//COMEÇO
		do {			
			if (temMolde==0) {
				
				//IMPRESSÃO DO TOPO
				mol.Titulo(); /*9 LINHAS*/ dec += 9;
				
				System.out.printf("\n%s\n",msg); /*o espaço da mensagem contem 2 linhas*/ dec += 2;
				//MENU
				mol.Molde("1 - Novos Jogadores"		,optMolde,tmMolde); /* 3 LINHAS */ dec += 3;
				mol.Molde("99 - Sair"		,optMolde,tmMolde);		 /* 3 LINHAS */ dec += 3;
				
				/*RODAPÉ*/
				dec = mol.RodapeOpt(tmPag, dec, "Digite a opcao desejada para 'Lista': "); // RECEBE ZERO	
				
			}
			else {
				//chamar as opções
				switch (opt) {
				case 1:

					/************************************************************************/
					/*******************         1º JOGADOR                ******************/
					/************************************************************************/
					
					//IMPRESSÃO DO TOPO
					mol.Titulo(true, head, moldeOpt, tm); /*9 LINHAS*/ dec += 9+3+1;
					
					
					/*RODAPÉ*/
					dec = mol.RodapeOpt(tmPag, dec, "Porfavor, digite o Nome do 1º Jogador: ");
//					String apelido1 = entrada.next();
					String apelido1 = "JOÃO";
					
					/******************************||||||||||||||||||||||||||||||||||************************************/
					//IMPRESSÃO DO TOPO
					mol.Titulo(true, head, moldeOpt, tm); /*9 LINHAS*/ dec += 9+3+1;
					
					mol.Molde(("1 - "+apelido1)		,optMolde,25);  /* 3 LINHAS */ dec += 3;
					
					
					/*RODAPÉ*/
					dec = mol.RodapeOpt(tmPag, dec, "Porfavor, digite o valor (R$) total do 1º Jogador: "); // RECEBE ZERO
//					double money1 = entrada.nextDouble();
					double money1 = 500;

					/******************************||||||||||||||||||||||||||||||||||************************************/
					//IMPRESSÃO DO TOPO
					mol.Titulo(true, head, moldeOpt, tm); /*9 LINHAS*/ dec += 9+3+1;
					
					mol.Molde(("1 - "+apelido1+" | R$ "+money1)		,optMolde,25);  /* 3 LINHAS */ dec += 3;
					
					//CRIANDO O 1º JOGADOR
					Jogador jogador1 = new Jogador(apelido1, money1);
					
					/*                ************************************************************************/
					/*<---------------*******************         2º JOGADOR                ******************/
					/*                ***********************************************************************/
					
					/*RODAPÉ*/
					dec = mol.RodapeOpt(tmPag, dec, "Porfavor, digite o Nome do 2º Jogador: "); // RECEBE ZERO
//					String apelido2 = entrada.next();
					String apelido2 = "CAIO";
					
					/******************************||||||||||||||||||||||||||||||||||************************************/
					//IMPRESSÃO DO TOPO
					mol.Titulo(true, head, moldeOpt, tm); /*9 LINHAS*/ dec += 9+3+1;

					mol.Molde(("1 - "+apelido1+" | R$ "+money1)		,optMolde,25);  /* 3 LINHAS */ dec += 3;
					mol.Molde(("1 - "+apelido2)		,optMolde,25);  /* 3 LINHAS */ dec += 3;
					
					
					/*RODAPÉ*/
					dec = mol.RodapeOpt(tmPag, dec, "Porfavor, digite o o valor (R$) total 2º Jogador: "); // RECEBE ZERO				
//					double money2 = entrada.nextDouble();
					double money2 = 400;

					/******************************||||||||||||||||||||||||||||||||||************************************/
					//IMPRESSÃO DO TOPO
					mol.Titulo(true, head, moldeOpt, tm); /*9 LINHAS*/ dec += 9+3+1;
					
					mol.Molde(("1 - "+apelido1+" | R$ "+money1)		,optMolde,25);  /* 3 LINHAS */ dec += 3;
					mol.Molde(("1 - "+apelido2+" | R$ "+money2)		,optMolde,25);  /* 3 LINHAS */ dec += 3;
					
					//CRIANDO O 2º JOGADOR
					Jogador jogador2 = new Jogador(apelido2, money2);
					
		
					/*RODAPÉ*/
					dec = mol.RodapeOpt(tmPag, dec, "Precione 1 para JOGAR ou 0 para voltar ao MENU: "); // RECEBE ZERO		
					
//					int opt2 = entrada.nextInt();
					int opt2 = 1;
					
					
					/************************************************************************/
					/*******************        INICIAR O JOGO             ******************/
					/************************************************************************/

					if (opt2==1) {
						//TODO
						Jogo novoJogo = new Jogo();
						novoJogo.Rodada(jogador1, jogador2);

						/******************************||||||||||||||||||||||||||||||||||************************************/
					}
					else {
						
						/******************************||||||||||||||||||||||||||||||||||************************************/
						//IMPRESSÃO DO TOPO
						for (int i = 0; i < 50; ++i) System.out.println(); //ESPAÇO BRANCO	
						mol.Titulo(); /*9 LINHAS*/ dec += 9;
						
						System.out.printf("\n%s\n",msg); /*o espaço da mensagem contem 2 linhas*/ dec += 2;
						//MENU
						mol.Molde("1 - Novos Jogadores"		,optMolde,tmMolde); /* 3 LINHAS */ dec += 3;
						mol.Molde("99 - Sair"		,optMolde,tmMolde);		 /* 3 LINHAS */ dec += 3;
						
						/*RODAPÉ*/
						dec = mol.RodapeOpt(tmPag, dec, "Digite a opcao desejada para 'Lista': "); // RECEBE ZERO	
						
						
						//fazendo a leitura da opção
					}
					
					
					
					
					
					/*ESPAÇO BRANCO*/
//					for (int i = 0; i < (tmPag - dec ); ++i) System.out.println(); /*zerar dec*/ dec=0;
					break;

				default:
					break;
				}
				
				
				head="";
				temMolde=0;
				
			}
			
			opcao = entrada.nextInt();
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

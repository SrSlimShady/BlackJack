import java.util.Scanner;
import java.util.function.Function;



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Jogo BJ = new Jogo();
		
		//Obter o Total de linhas do quadro
//		for (int i = 0; i < 100; ++i) System.out.println(i); //40 LINHAS
//		System.exit(0);
		
		//PAGINA
		int tmPag = 40;
		tmPag -= 1; //necessário diminuir 1
		int dec=0; //contador de decremento de linha
		
			
		
		//MOLDE
		int moldeOpt = 1;
		int tm = 79;
		
		//MENU
		int optMolde = 0; //0 = simples ou 1 = duplo
		int tmMolde = 25;
		
		Molde mol = new Molde();
		
		
		Scanner entrada = new Scanner(System.in);
		int opcao, opt = 0, temMolde=0;
		String msg="", head="";
		
		//COMEÇO
		do {
			
			
			if (temMolde==0) {
				
				//IMPRESSÃO DO TOPO
				mol.Titulo(); /*9 LINHAS*/ dec += 9;
				
				System.out.printf("\n%s\n",msg); /*o espaço da mensagem contem 2 linhas*/ dec += 2;
				//MENU
				mol.Molde("1 - Novos Jogadores"		,optMolde,tmMolde); /* 3 LINHAS */ dec += 3;
				mol.Molde("99 - Sair"		,optMolde,tmMolde);		 /* 3 LINHAS */ dec += 3;
				for (int i = 0; i < (tmPag - dec - 1 ); ++i) System.out.println(); /*zerar dec*/ dec=0;
				System.out.printf("\nDigite a opcao desejada para 'Lista': "); // 1 LINHA
				
				
				//fazendo a leitura da opção
				
				
				
			}
			else {
				
				//IMPRESSÃO DO TOPO
				mol.Titulo(); /*9 LINHAS*/ dec += 9;
				mol.Molde(head, moldeOpt, tm); /* 3 LINHAS */ dec += 3;
				
				//chamar as opções
				switch (opt) {
				case 1:
					
					/*
					 * São 52 cartas sendo, A,2,3,4,5,6,7,8,9,10,J,Q,K
					 * 
					 * 
					 * 
					 * */
					
					
					/************************************************************************/
					/*******************         1º JOGADOR                ******************/
					/************************************************************************/
					
					/*ESPAÇO BRANCO*/
					for (int i = 0; i < (tmPag - dec - 1 ); ++i) System.out.println(); /*zerar dec*/ dec=0;
					System.out.println("Porfavor, digite o Nome do 1º Jogador: "); // 1 LINHA
					String apelido1 = entrada.next();
					
					/******************************||||||||||||||||||||||||||||||||||************************************/
					//IMPRESSÃO DO TOPO
					for (int i = 0; i < 50; ++i) System.out.println(); //ESPAÇO BRANCO	
					//IMPRESSÃO DO TOPO
					mol.Titulo(); /*9 LINHAS*/ dec += 9;
					mol.Molde(head, moldeOpt, tm); /* 3 LINHAS */ dec += 3;
					/**********************************************************************/
					System.out.printf("\n");  /* 1 LINHA */ dec += 1;
					mol.Molde(("1 - "+apelido1)		,optMolde,25);  /* 3 LINHAS */ dec += 3;
					
					
					/*ESPAÇO BRANCO*/
					for (int i = 0; i < (tmPag - dec - 1 ); ++i) System.out.println(); /*zerar dec*/ dec=0;					
					System.out.println("Porfavor, digite o valor (R$) total do 1º Jogador: "); // 1 LINHA
					double money1 = entrada.nextDouble();

					/******************************||||||||||||||||||||||||||||||||||************************************/
					//IMPRESSÃO DO TOPO
					for (int i = 0; i < 50; ++i) System.out.println(); //ESPAÇO BRANCO	
					//IMPRESSÃO DO TOPO
					mol.Titulo(); /*9 LINHAS*/ dec += 9;
					mol.Molde(head, moldeOpt, tm); /* 3 LINHAS */ dec += 3;
					/**********************************************************************/
					System.out.printf("\n");  /* 1 LINHA */ dec += 1;
					mol.Molde(("1 - "+apelido1+" | R$ "+money1)		,optMolde,25);  /* 3 LINHAS */ dec += 3;
					
					//CRIANDO O 1º JOGADOR
					Jogador jogador1 = new Jogador(apelido1, money1);
					
					/************************************************************************/
					/*******************         2º JOGADOR                ******************/
					/************************************************************************/
					
					/*ESPAÇO BRANCO*/
					for (int i = 0; i < (tmPag - dec - 1 ); ++i) System.out.println(); /*zerar dec*/ dec=0;
					System.out.println("Porfavor, digite o Nome do 2º Jogador: "); // 1 LINHA
					String apelido2 = entrada.next();
					
					/******************************||||||||||||||||||||||||||||||||||************************************/
					//IMPRESSÃO DO TOPO
					for (int i = 0; i < 50; ++i) System.out.println(); //ESPAÇO BRANCO	
					//IMPRESSÃO DO TOPO
					mol.Titulo(); /*9 LINHAS*/ dec += 9;
					mol.Molde(head, moldeOpt, tm); /* 3 LINHAS */ dec += 3;
					/**********************************************************************/
					System.out.printf("\n");  /* 1 LINHA */ dec += 1;
					mol.Molde(("1 - "+apelido1+" | R$ "+money1)		,optMolde,25);  /* 3 LINHAS */ dec += 3;
					mol.Molde(("1 - "+apelido2)		,optMolde,25);  /* 3 LINHAS */ dec += 3;
					
					
					/*ESPAÇO BRANCO*/
					for (int i = 0; i < (tmPag - dec - 1 ); ++i) System.out.println(); /*zerar dec*/ dec=0;					
					System.out.println("Porfavor, digite o o valor (R$) total 2º Jogador: "); // 1 LINHA
					double money2 = entrada.nextDouble();

					/******************************||||||||||||||||||||||||||||||||||************************************/
					//IMPRESSÃO DO TOPO
					for (int i = 0; i < 50; ++i) System.out.println(); //ESPAÇO BRANCO	
					//IMPRESSÃO DO TOPO
					mol.Titulo(); /*9 LINHAS*/ dec += 9;
					mol.Molde(head, moldeOpt, tm); /* 3 LINHAS */ dec += 3;
					/**********************************************************************/
					System.out.printf("\n");  /* 1 LINHA */ dec += 1;
					mol.Molde(("1 - "+apelido1+" | R$ "+money1)		,optMolde,25);  /* 3 LINHAS */ dec += 3;
					mol.Molde(("1 - "+apelido2+" | R$ "+money2)		,optMolde,25);  /* 3 LINHAS */ dec += 3;
					
					//CRIANDO O 2º JOGADOR
					Jogador jogador2 = new Jogador(apelido2, money2);
					
		
					/*ESPAÇO BRANCO*/
					for (int i = 0; i < (tmPag - dec - 1 ); ++i) System.out.println(); /*zerar dec*/ dec=0;	
					
					System.out.println("Precione 1 para JOGAR ou 0 para voltar ao MENU: "); // 1 LINHA
					int opt2 = entrada.nextInt();

					
					
					/************************************************************************/
					/*******************        INICIAR O JOGO             ******************/
					/************************************************************************/

					if (opt2==1) {
						//TODO
						/******************************||||||||||||||||||||||||||||||||||************************************/
						//IMPRESSÃO DO TOPO
						for (int i = 0; i < 50; ++i) System.out.println(); //ESPAÇO BRANCO	
						//IMPRESSÃO DO TOPO
						mol.Titulo(); /*9 LINHAS*/ dec += 9;
						mol.Molde("1ª RODADA", moldeOpt, tm); /* 3 LINHAS */ dec += 3;
						/**********************************************************************/
						System.out.printf("\n");  /* 1 LINHA */ dec += 1;
						mol.Molde(("1 - "+apelido1+" | R$ "+money1)		,optMolde,25);  /* 3 LINHAS */ dec += 3;
						mol.Molde(("1 - "+apelido2+" | R$ "+money2)		,optMolde,25);  /* 3 LINHAS */ dec += 3;	
						
						/*ESPAÇO BRANCO*/
						for (int i = 0; i < (tmPag - dec - 1 ); ++i) System.out.println(); /*zerar dec*/ dec=0;						
						System.out.println("Porfavor, digite o o valor da aposta: "); // 1 LINHA
						double aposta = entrada.nextDouble();
						
						Jogo novoJogo = new Jogo();
						novoJogo.Rodada(aposta, jogador1, jogador2);

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
						for (int i = 0; i < (tmPag - dec - 1 ); ++i) System.out.println(); /*zerar dec*/ dec=0;
						System.out.printf("\nDigite a opcao desejada para 'Lista': "); // 1 LINHA
						
						
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
			switch (opcao) {
				case 1: // criar
					head="Novos Jogadores";
					temMolde=1;
					for (int i = 0; i < 50; ++i) System.out.println(); /* EM BRANCO */
					//Chamar classe
					opt = 1;
					break;
				case 99: //sair
//					for (int i = 0; i < 17; ++i) System.out.println();
					mol.Titulo();
					mol.Molde("Sair", moldeOpt, tm);
					System.out.printf("\n\nVocê saiu do Jogo.");
					for (int i = 0; i < 25; ++i) System.out.println();
					break;
				default: // opcao invalida
					msg = "Opcao Invalida!";
					for (int i = 0; i < 50; ++i) System.out.println();
			}
		} while (opcao != 99); // opcao de saida
		
		
		
		
		

		

	}
	
	public void gerarCabeçalho() {
		
	}
	
	
	

}

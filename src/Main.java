import java.util.Scanner;
import java.util.function.Function;



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Jogo BJ = new Jogo();
		
		
			
		
		//MOLDE
		int moldeOpt = 1;
		int tm = 79;
		
		//MENU
		int optMolde = 0; //0 = simples ou 1 = duplo
		int tmMolde = 20;
		
		Molde mol = new Molde();
		
		
		Scanner entrada = new Scanner(System.in);
		int opcao, temMolde=0;
		String msg="", head="";
		
		//COMEÇO
		do {
			
			mol.Titulo();
			if (temMolde==0) {
				
				System.out.printf("\n%s\n",msg);
				//MENU
				mol.Molde("1 - Novo Jogo"		,optMolde,tmMolde);
				mol.Molde("99 - Sair"		,optMolde,tmMolde);
				System.out.printf("\nDigite a opcao desejada para 'Lista': ");
				for (int i = 0; i < 21; ++i) System.out.println();
				
				//fazendo a leitura da opção
				
				
				
			}
			else {
				
				mol.Molde(head, moldeOpt, tm);
				head="";
				temMolde=0;
				for (int i = 0; i < 27; ++i) System.out.println();
				
				
				
			}
			
			opcao = entrada.nextInt();
			switch (opcao) {
				case 1: // criar
					head="Novo Jogo";
					temMolde=1;
					for (int i = 0; i < 50; ++i) System.out.println();
					//Chamar classe
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
	
	
	

}

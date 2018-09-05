
public class Molde {
	
	
	
	public  void Molde(String menu, int moldeOpt, int tm){ //moldeOpt -> 0 = simples ou 1 = duplo
		int tmMenu = menu.length();
		int meio = (tm/2) - (tmMenu/2); // onde começa o meio do botão
		
		int [][] molde =  {{9484,9488,9492,9496,9472,9474},{9556,9559,9562,9565,9552,9553}};
		
		int i,j;
		for(i=0; i<3;i++){
			for(j=0; j<tm;j++){
				if(i==0){
					if(j==0) System.out.printf("%c", molde[moldeOpt][0]); //canto superior esquerdo
					else if(j==(tm-1)) System.out.printf("%c", molde[moldeOpt][1]);//canto superior direito
				}
				else if(i==2){
					if(j==0) System.out.printf("%c", molde[moldeOpt][2]);//canto inferior esquerdo
					else if(j==(tm-1)) System.out.printf("%c", molde[moldeOpt][3]);//canto inferior direito
				}
				if(i!=1 && j!=0 && j!=(tm-1)) System.out.printf("%c", molde[moldeOpt][4]); //meio superior e inferior
				
				if(i==1){
					if(j==0 || j==(tm-tmMenu))System.out.printf("%c", molde[moldeOpt][5]); // barra vertical do inicio e do fim
					else if(j==meio && j!=0 && j!=(tm-1))System.out.printf("%s",menu);
						else if(j<(tm-tmMenu)) System.out.printf(" ");
				}
			}
			System.out.printf("\n");
		}
//		for (int c=32; c<1356; c++) {
//		    System.out.println(c + ": " + (char)c);
//		   }
	}
	
	public void Titulo() {
		//SAÍDA DE TELA
		//Impressão do título
		System.out.println("_┌───────────┐___________________________________________________┌───────────┐_");
		System.out.println(" │A          │  ______ _            _      ___            _      │K          │ ");
		System.out.println(" │           │  | ___ | |          | |    |_  |          | |     │           │ ");
		System.out.println(" │           │  | |_/ | | __ _  ___| | __   | | __ _  ___| | __  │           │ ");
		System.out.println(" │     ♥     │  | ___ | |/ _` |/ __| |/ /   | |/ _` |/ __| |/ /  │     ♠     │ ");
		System.out.println(" │           │  | |_/ | | (_| | (__|   </\\__/ | (_| | (__|   <   │           │");
		System.out.println(" │           │  \\____/|_|\\__,_|\\___|_|\\_\\____/ \\__,_|\\___|_|\\_\\  │           │");
		System.out.println("_│          A│___________________________________________________│          K│_");
		System.out.println(" └───────────┘                                                   └───────────┘");
	}
	
	
	
	

}

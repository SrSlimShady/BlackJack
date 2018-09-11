
public class Molde {
	
	public void Molde(String menu, int moldeOpt, int tm){ //moldeOpt -> 0 = simples ou 1 = duplo
		// TODO Auto-generated method stub
		MoldeVT(menu, moldeOpt, tm);
	}
	
	
	public  void MoldeVT(String menu, int moldeOpt, int tm){ //moldeOpt -> 0 = simples ou 1 = duplo
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
	
	
	
	public  void MoldeHZ(String[] menu, int moldeOpt, int tm, boolean hz ){ //moldeOpt -> 0 = simples ou 1 = duplo
		int tmMenu;
		int meio, pos=0;
		
		int blocLenth = menu.length, ctBloc = 0;
		
		int [][] molde =  {{9484,9488,9492,9496,9472,9474},{9556,9559,9562,9565,9552,9553}};
		
		int i,j;
		for(i=0; i<3;i++){
			
			tmMenu = menu[pos].length();
			meio = (tm/2) - (tmMenu/2); // onde começa o meio do botão
			
			
			for(j=0; j<tm;j++){
				if(i==0){
					if(j==0) System.out.printf("%c", molde[moldeOpt][0]); //canto superior esquerdo
					else if(j==(tm-1)) {
						System.out.printf("%c", molde[moldeOpt][1]);//canto superior direito
						if(hz==true) ctBloc +=1;
					}
				}
				else if(i==2){
					if(j==0) System.out.printf("%c", molde[moldeOpt][2]);//canto inferior esquerdo
					else if(j==(tm-1)) {
						System.out.printf("%c", molde[moldeOpt][3]);//canto inferior direito
						if(hz==true) ctBloc +=1;
					}
				}
				if(i!=1 && j!=0 && j!=(tm-1)) System.out.printf("%c", molde[moldeOpt][4]); //meio superior e inferior
				
				if(i==1){
					if(j==0 || j==( tm-menu[pos].length() )) {
						System.out.printf("%c", molde[moldeOpt][5]); // barra vertical do inicio e do fim
						if (j==(tm-menu[pos].length())) {
							if(hz==true) {
								ctBloc ++;
								j=99;
							}
						}
					}
					else if(j==meio && j!=0 && j!=(tm-1)) {
						System.out.printf("%s",menu[pos]);
						
						if ((pos+1)<blocLenth)pos++;
					}
						else if(j<(tm-tmMenu)) System.out.printf(" ");
				}
				
				if(hz==true) {
					if(ctBloc!=blocLenth && j==(tm-1) || ctBloc!=blocLenth && j==99) {
						j=-1;

						tmMenu = menu[pos].length();
						meio = (tm/2) - (tmMenu/2); // onde começa o meio do botão
						
						System.out.printf(" ");
					}
					else if (ctBloc==blocLenth) {
						ctBloc = 0;
					}
				}
				
			}
			System.out.printf("\n");
		}
//		for (int c=32; c<1356; c++) {
//		    System.out.println(c + ": " + (char)c);
//		   }
	}
	
	
	
	public  void MoldeCartas(String[][]  cartas, int moldeOpt, int tmIMPARhz, int tmIMPARvt){ //moldeOpt -> 0 = simples ou 1 = duplo
		int tmMenu = cartas[0].length;
		
		if (tmIMPARhz<5) tmIMPARhz=5; //tamanho mínimo
		if (tmIMPARvt<7) tmIMPARvt=7; //tamanho mínimo
		
//		tmIMPARhz -=1;
		tmIMPARvt -=1;
		
		int meioHz = (tmIMPARhz/2); // onde começa o meio do botão
		int meioVt = (tmIMPARvt/2); // onde começa o meio do botão
		
		int pos = 0; //posição na coluna da matriz
		
		int blocLenth = tmMenu, ctBloc = 0;
		
		int [][] molde =  {{9484,9488,9492,9496,9472,9474},{9556,9559,9562,9565,9552,9553}};
		
		int i,j;
		for(i=0; i<=tmIMPARvt;i++){
			for(j=0; j<tmIMPARhz;j++){
				if(i==0){
					if(j==0) System.out.printf("%c", molde[moldeOpt][0]); //canto superior esquerdo
					else if(j==(tmIMPARhz-1)) {
						System.out.printf("%c", molde[moldeOpt][1]);//canto superior direito
						ctBloc ++;
					}
					else if(j!=0 && j!=(tmIMPARhz-1) || i==tmIMPARvt && j!=0 && j!=(tmIMPARhz-1) ) System.out.printf("%c", molde[moldeOpt][4]); //meio superior e inferior
					
				}
				else if(i==tmIMPARvt){
					if(j==0) System.out.printf("%c", molde[moldeOpt][2]);//canto inferior esquerdo
					else if(j==(tmIMPARhz-1)) {
						System.out.printf("%c", molde[moldeOpt][3]);//canto inferior direito
						ctBloc ++;
					}
					else if(j!=0 && j!=(tmIMPARhz-1) || i==tmIMPARvt && j!=0 && j!=(tmIMPARhz-1) ) System.out.printf("%c", molde[moldeOpt][4]); //meio superior e inferior
					
				}
				//LINHA 1
				else if(i==1){
					if(j==0 || j==(tmIMPARhz-1)) {
						System.out.printf("%c", molde[moldeOpt][5]); // barra vertical do inicio e do fim
						if (j==(tmIMPARhz-1)) {
							ctBloc ++;
							j=99;
						}
					}
					else if(j==1) {
						if(cartas[0][pos].length()==2)j++;
						System.out.printf("%s", cartas[0][pos]); // NUMERO DA CARTA
						pos++;
					}
						else if(j<(tmIMPARhz-1)) System.out.printf(" ");
				}
				//LINHA DO MEIO
				else if(i==meioVt) {
					if(j==0 || j==(tmIMPARhz-1)) {
						System.out.printf("%c", molde[moldeOpt][5]); // barra vertical do inicio e do fim
						
						if (j==(tmIMPARhz-1)) {
							ctBloc ++;
							j=99;
						}
					}
					else if(j==meioHz) {
						System.out.printf("%s", cartas[1][pos]); // NAIPE DA CARTA
						pos++;
					}
						else if(j<(tmIMPARhz-1)) System.out.printf(" ");
				}//PENULTIMA LINHA
				else if(i==(tmIMPARvt-1)){
					if(j==0 || j==(tmIMPARhz-1)) {
						System.out.printf("%c", molde[moldeOpt][5]); // barra vertical do inicio e do fim
						
						if (j==(tmIMPARhz-1)) {
							ctBloc ++;
							j=99;
						}
					}
					else if( cartas[0][pos].length()==2 && j==(tmIMPARhz-3)) {
						System.out.printf("%s", cartas[0][pos]); // NUMERO DA CARTA 10
						j++;
						pos++;
					}
					else if(j==(tmIMPARhz-2) && cartas[0][pos].length()!=2) {
						System.out.printf("%s", cartas[0][pos]); // NUMERO DA CARTA
//						j+=2;
						pos++;
					}
					else if(j<(tmIMPARhz-1)) System.out.printf(" ");
				}//LINHAS EM BRANCO
				else {
					if(j==0 || j==(tmIMPARhz-1)) {
						System.out.printf("%c", molde[moldeOpt][5]); // barra vertical do inicio e do fim
						
						if (j==(tmIMPARhz-1)) {
							ctBloc ++;
							j=99;
						}
					}
					else if(j<(tmIMPARhz-1)) System.out.printf(" ");
				}
				
				if(ctBloc!=blocLenth && j==(tmIMPARhz-1) || ctBloc!=blocLenth && j==99) {
					j=-1;
					System.out.printf(" ");
				}
				else if (ctBloc==blocLenth) {
					ctBloc = 0;
					pos=0;
				}
				
			}
			System.out.printf("\n");
		}
	}
	
	
	
	public void Titulo() {
		//SAÍDA DE TELA
		//Impressão do título
		System.out.println("___┌───────────┐___________________________________________________┌───────────┐___");
		System.out.println("   │A          │  ______ _            _      ___            _      │K          │ ");
		System.out.println("   │           │  | ___ | |          | |    |_  |          | |     │           │ ");
		System.out.println("   │           │  | |_/ | | __ _  ___| | __   | | __ _  ___| | __  │           │ ");
		System.out.println("   │     ♥     │  | ___ | |/ _` |/ __| |/ /   | |/ _` |/ __| |/ /  │     ♠     │ ");
		System.out.println("   │           │  | |_/ | | (_| | (__|   </\\__/ | (_| | (__|   <   │           │");
		System.out.println("   │           │  \\____/|_|\\__,_|\\___|_|\\_\\____/ \\__,_|\\___|_|\\_\\  │           │");
		System.out.println("___│          A│___________________________________________________│          K│___");
		System.out.println("   └───────────┘                                                   └───────────┘");
	}
	
	public void Titulo(Boolean espaco, String head, int moldeOpt, int tm) {
		//SAÍDA DE TELA
		//IMPRESSÃO DO TOPO
		if (espaco) for (int i = 0; i < 50; ++i) System.out.println(""); //ESPAÇO BRANCO	
		//Impressão do título
		System.out.println("___┌───────────┐___________________________________________________┌───────────┐___");
		System.out.println("   │A          │  ______ _            _      ___            _      │K          │ ");
		System.out.println("   │           │  | ___ | |          | |    |_  |          | |     │           │ ");
		System.out.println("   │           │  | |_/ | | __ _  ___| | __   | | __ _  ___| | __  │           │ ");
		System.out.println("   │     ♥     │  | ___ | |/ _` |/ __| |/ /   | |/ _` |/ __| |/ /  │     ♠     │ ");
		System.out.println("   │           │  | |_/ | | (_| | (__|   </\\__/ | (_| | (__|   <   │           │");
		System.out.println("   │           │  \\____/|_|\\__,_|\\___|_|\\_\\____/ \\__,_|\\___|_|\\_\\  │           │");
		System.out.println("___│          A│___________________________________________________│          K│___");
		System.out.println("   └───────────┘                                                   └───────────┘");
		
		Molde(head, moldeOpt, tm); /* 3 LINHAS */

		System.out.printf("\n");  /* 1 LINHA */
	}
	
	
	public int RodapeOpt(int tmPag, int dec, String qt) {
	
		/*ESPAÇO BRANCO*/
		for (int i = 0; i < (tmPag - dec); ++i) System.out.println(); /*zerar dec*/ dec=0;
		System.out.print(qt); // 1 LINHA
		
		return dec;
		
	}
	

}

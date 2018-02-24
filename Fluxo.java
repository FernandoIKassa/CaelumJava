class Fluxo {

	public static void main (String [] args){
		
		boolean condicao = 32 > 45 & 10>30 | 8==8;
		if (condicao){
			System.out.println("é maior");		
		}else{

			System.out.println("é menor");			
		
		}
		
		int limite = 0;
		while(limite < 10){

			System.out.println("Rodando");
			limite++;
		
		}

		for (int i = 0; i < 10; i++){
			for(int j = 0 ; j < 10 ; j++){

				System.out.println("[" + ";" + ","+ j +"]");

			}
			//System.out.println("Rodando: " + i);

		}

		for (int i = 0 ; i < 100 ; i++){

			if(i % 2 == 1) continue;
			System.out.println(i);


			if (i > 50) break;
		}


	}
	

}

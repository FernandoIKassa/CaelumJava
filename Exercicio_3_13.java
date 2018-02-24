class Exercicio313 {

	public static void main (String [] args){

		//exercicio 1
		for (int i = 150 ; i <= 300 ; i++){

			//System.out.println(i);

		}

		//exercício 2
		int total = 0;
		for (int i = 0 ; i <= 1000 ; i++){

			total  = total + i;
			
		}
		//System.out.println(total);
			

		//exercício 3
		for (int i = 1 ; i <= 100 ; i++){

			if (i %3 > 0) continue;

			//System.out.println(i);	

		}

		//exercício 4 e 5
		long fatorial = 1;
		for (long n = 1 ; n <= 30 ; n++){
			
			//fatorial = fatorial * n
			
			System.out.println(fatorial);
			fatorial *= n;

		}

		
		//exercício 
		int proximo = 0,atual = 0,anterior = 1;
		while(proximo <= 1000){
		    proximo = atual + anterior;
			System.out.print(proximo+",");
			anterior = atual;
			atual = proximo;
		}
	
	}
}

class TestaConta{

	public static void main (String [] args){

		Conta conta = new Conta();
		
		conta.numero = 224;
		conta.titular = "Collor";
		conta.deposita(20000.0);
		conta.limite = 5000.0;
		
		conta.recuperaDadosParaImpressao();
		conta.saca(10000);
		conta.recuperaDadosParaImpressao();

		boolean sacou = conta.saca(-1000);
		if(sacou){

			System.out.println("Sacado");
		
		}else{
			System.out.println("Erro ao sacar");
		}
	}

}

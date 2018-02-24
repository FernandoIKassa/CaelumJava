class TestaTransferencia{

	public static void main (String [] args){

		Conta origem = new Conta();
		origem.deposita(10000.0);
		origem.numero = 70;
		origem.titular = "Bolsonaro";
		
		Conta destino = new Conta();
		destino.deposita(30000.0);
		destino.titular = "Pablo";
		destino.numero = 100;
		origem.recuperaDadosParaImpressao();
		destino.recuperaDadosParaImpressao();

		origem.transfere(destino, 500);
		origem.recuperaDadosParaImpressao();
		destino.recuperaDadosParaImpressao();
	}

}

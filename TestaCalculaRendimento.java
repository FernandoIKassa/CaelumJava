class TestaCalculaRendimento{

		public static void main (String [] args){

			Conta fer = new Conta();
			fer.titular = "Fernando";			
			fer.deposita(1000);		
			fer.recuperaDadosParaImpressao();
			System.out.println("Rendimento mensal: " + fer.calculaRendimento());
			fer.deposita(fer.calculaRendimento());
			fer.recuperaDadosParaImpressao();		
		}
}

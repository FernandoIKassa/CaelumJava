public class TestaContaComModificador {

	public static void main (String [] args){

		Conta c1 = new Conta();
		/*c1.deposita(10000.0);
		c1.deposita(2000.0);
		System.out.println(c1.recuperaDadosParaImpressao());*/
		c1.setNumero(50);
		c1.setTitular("Asdrubal");
		c1.deposita(5000);
		c1.setLimite(1000);
	
		System.out.println(c1.getTitular() + " " + c1.getSaldo());

		Conta contaComLimite = new Conta();
		System.out.println(contaComLimite.getLimite());

		Conta contaComTitular = new Conta("Gilmar");
		System.out.println(contaComTitular.getTitular());
		System.out.println(contaComTitular.getLimite());
	}
}

public class Conta{

	private int numero;
	private String titular;
	private double saldo;
	private double limite;
	
	
	public int getNumero(){
		return numero;
	}

	public void setNumero(int Numero){
		this.numero = numero;
	}

	public String getTitular(){
		return titular;
	}


	public void setTitular(String Titular){
		this.titular = titular;
	}

	public double getSaldo(){
		return saldo;
	}

	public void setSaldo(double Saldo){
		this.saldo = saldo;
	}

	public double getLimite(){
		return limite;
	}

	public void setLimite(double limite){
		this.limite= limite;
	}

	public Conta (){
		limite = 1000;
	}

	public Conta (String titular){
		this.titular = titular;
	}

	
	public boolean saca(double valor){
	
		
		if(valor > 0){
			if (saldo + limite >= valor){

				saldo -= valor;

			} return true;

		}
		return false;

	}	

	public String recuperaDadosParaImpressao(){

		String dados = "\nTitular: " + this.titular;
		dados += "\nNúmero: " + this.numero;
		return dados;
	}

	public void deposita(double valor){

		saldo += valor;

	}

	public void transfere (Conta destino, double valor){

		if (saca(valor)){
			destino.deposita(valor);
		}
	}

	public double calculaRendimento (){

		return saldo * 0.1;
		
	}
}

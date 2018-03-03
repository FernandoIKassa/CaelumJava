package br.com.caelum.contas.modelo;
/**
 * 
 * @author Fernando
 *
 */


public class Conta{

	private int numero;
	private String titular;
	private double saldo;
	private double limite;
	
	
	public int getNumero(){
		return numero;
	}

	public void setNumero(int numero){
		this.numero = numero;
	}

	public String getTitular(){
		return titular;
	}


	public void setTitular(String titular){
		this.titular = titular;
	}

	public double getSaldo(){
		return saldo;
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

	/**
	 * 
	 * @param valor valor a ser sacado da conta
	 * @return true se sacou
	 */
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
package br.com.caelum.contas.modelo;
import br.com.caelum.contas.modelo.Conta;

public class ContaCorrente extends Conta implements Tributavel {
	@Override
	public boolean saca(double valor){
		if(valor > 0){
			this.saldo -= (valor + 0.10);
			return true;
		}
		else{
			throw new IllegalArgumentException("Voce tentou saca um valor negativo");
		}
	}
	public String getTipo(){
		return "Conta Corrente";
	}
	@Override
	public double getValorImposto() {
		// TODO Auto-generated method stub
		return this.getSaldo() * 0.01;
	}
}

package br.com.caelum.contas.modelo;
import br.com.caelum.contas.modelo.Conta;

public class ContaCorrente extends Conta implements Tributavel, Comparable {
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
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		//if (o instanceof Conta) {}
		ContaCorrente cc = (ContaCorrente) o;
		/*if (cc.getSaldo() > getSaldo()) {
			return 10;
		}else if(cc.getSaldo()<getSaldo()){
			return -1;
		}else{
			return 0;
		}
		return 0;*/
		return (int) (getSaldo() - cc.getSaldo());
	}
}

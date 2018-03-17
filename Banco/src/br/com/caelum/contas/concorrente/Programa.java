package br.com.caelum.contas.concorrente;

public class Programa implements Runnable {
	private int id;
	public Programa(int id){
		this.id = id;
	}
	
	public void run(){
		for (int i = 0; i < 10; i++) {
			System.out.println("Processo " + i + " id" + id);
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
package br.com.caelum.contas;

import java.io.FileNotFoundException;

public class TestaErro {
	public static void main (String [] args){
		try {
			new java.io.FileInputStream("arquivo.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("inicio do main");
		metodo1();
		System.out.println("fim do main");
	}
	
	public static void metodo1(){
		System.out.println("inicio do metodo1");
		metodo2();
		System.out.println("fim do metodo1");
		
	}
	
	public static void metodo2(){
		System.out.println("inicio do metodo2");
		int[] array = new int[10];
		try{
			for (int i=0; i <15; i++){
				
				array[i] = i * i;
				System.out.println(array [i]);
				}
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Deu ruim!");
		}
		                     
		System.out.println("fim do metodo2");
	}
	
}

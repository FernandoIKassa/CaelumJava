package br.com.caelum.contas;

import java.util.List;
import java.util.Set;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;

public class TestaLista {
	public static void main(String[] args) {
		List <String> lista = new LinkedList<>();
		lista.add("Paulo");
		lista.add("Guilherme");
		//lista.add(38);
		lista.add("Sergio");
		System.out.println(lista);
		System.out.println(lista.contains("Paulo"));
		lista.remove("Sergio");
		System.out.println(lista);
		System.out.println(lista.size());
		
		Set<String> linguagem = new HashSet<>();
		linguagem.add("Java");
		linguagem.add("Cobol");
		linguagem.add("C");
		linguagem.add("Java");
		System.out.println(linguagem);
	}
}

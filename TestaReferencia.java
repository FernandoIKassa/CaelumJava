class TestaReferencia{

	public static void main (String [] args){

		Conta c1 = new Conta();
		c1.numero = 10;
		c1.titular = "Maluf";

		Conta c2 = new Conta();
		c2.numero = 10;
		c2.titular = "Maluf";

		System.out.println(c1 == c2); //o Java testa a referëncia, portanto, a comparação retorna false - c1 não é igual a c2
		//Valores primitivos retornam valores e não referencias

		c1 = c2; //os valores do c1 desaparecem, ele passa a ter as propriedades do c2 como referencias
		c2.numero = 20;
		System.out.println(c1.numero);
	}

}

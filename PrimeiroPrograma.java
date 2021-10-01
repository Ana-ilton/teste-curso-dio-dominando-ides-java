package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {

	public static void main(String[] args) {
		
		Gato gato = new Gato();
		Livro livro = new Livro();
		
		System.out.println(gato);
		System.out.println(livro);
		
		/*System.out.println(
				"Olha eu aqui de novo, viver morrer renascer firm e forte feito um touro... Racistas passem por lá.... Levando o seu mau agouro");*/
	}

}


class Livro {
	public String nome;
	public String npag;
	
}
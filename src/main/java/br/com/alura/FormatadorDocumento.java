package br.com.alura;

import br.com.caelum.stella.format.CNPJFormatter;
import br.com.caelum.stella.format.CPFFormatter;
import br.com.caelum.stella.format.TituloEleitoralFormatter;

public class FormatadorDocumento {
	
	public static void main(String[] args) {
	
		String cpf = "862.883.667-57";
		String cnpj = "98.610.832/0001-24";
		String titulo = "417453530116";
		
		CPFFormatter formatadorCPF = new CPFFormatter();
		String cpfSemFormatacao = formatadorCPF.unformat(cpf);
		
		System.out.print(cpf + " ");
		System.out.println(cpfSemFormatacao);
		
		CNPJFormatter formatadorCNPJ = new CNPJFormatter();
		String cnpjSemFormatacao = formatadorCNPJ.unformat(cnpj);

		System.out.print(cnpj + " ");
		System.out.println(cnpjSemFormatacao);

		TituloEleitoralFormatter formatadorTitulo = new TituloEleitoralFormatter();
		String tituloFormatado = formatadorTitulo.format(titulo);
				
		System.out.print(titulo + " ");
		System.out.println(tituloFormatado);
				
	}
	

}

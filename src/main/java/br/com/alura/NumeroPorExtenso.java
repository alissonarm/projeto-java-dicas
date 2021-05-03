package br.com.alura;

import java.math.BigDecimal;

import br.com.caelum.stella.inwords.FormatoDeReal;
import br.com.caelum.stella.inwords.InteiroSemFormato;
import br.com.caelum.stella.inwords.NumericToWordsConverter;

public class NumeroPorExtenso {

	public static void main(String[] args) {
		
		System.out.println(new NumericToWordsConverter(new InteiroSemFormato()).toWords(75.00));
		System.out.println(new NumericToWordsConverter(new InteiroSemFormato()).toWords(13.10));
		BigDecimal valor = new BigDecimal("124.00");
		System.out.println(new NumericToWordsConverter(new InteiroSemFormato()).toWords(valor.doubleValue()));
		
		System.out.println(new NumericToWordsConverter(new FormatoDeReal()).toWords(13.10));
		System.out.println(new NumericToWordsConverter(new FormatoDeReal()).toWords(1));
		System.out.println(new NumericToWordsConverter(new FormatoDeReal()).toWords(30.52));
		System.out.println(new NumericToWordsConverter(new FormatoDeReal()).toWords(0.49));
		
	}

}

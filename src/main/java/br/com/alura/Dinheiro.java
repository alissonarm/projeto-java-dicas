package br.com.alura;

import java.math.BigDecimal;
import java.util.Collection;

import javax.money.CurrencyUnit;
import javax.money.Monetary;
import javax.money.MonetaryAmount;

import org.javamoney.moneta.Money;
import org.javamoney.moneta.function.MonetaryOperators;

import br.com.caelum.stella.inwords.FormatoDeReal;
import br.com.caelum.stella.inwords.NumericToWordsConverter;

public class Dinheiro {

	public static void main(String[] args) {
		CurrencyUnit moeda = Monetary.getCurrency("BRL");
		MonetaryAmount valorDaParcela = Money.of(new BigDecimal("25"), moeda);
		System.out.println(Money.of(1, moeda));
		
		
		System.out.println(valorDaParcela);
		System.out.println(valorDaParcela.multiply(10));
		
		System.out.println(Money.of(new BigDecimal("78.32"), Monetary.getCurrency("USD")));
		System.out.println(Money.of(new BigDecimal("78.32"), Monetary.getCurrency("USD")).multiply(2));
		
		
		System.out.println(Money.of(new BigDecimal("120.50"), Monetary.getCurrency("BRL")).with(MonetaryOperators.percent(10)));
		
		
		
		MonetaryAmount x = Money.of(new BigDecimal("900"), Monetary.getCurrency("BRL")).with(MonetaryOperators.percent(10));
		System.out.println(x);
		System.out.println(new NumericToWordsConverter(new FormatoDeReal()).toWords(x.getNumber().doubleValue()));
	}
	
}

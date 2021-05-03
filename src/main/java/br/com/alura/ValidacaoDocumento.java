package br.com.alura;

import br.com.caelum.stella.validation.CNPJValidator;
import br.com.caelum.stella.validation.CPFValidator;
import br.com.caelum.stella.validation.InvalidStateException;
import br.com.caelum.stella.validation.TituloEleitoralValidator;
import br.com.caelum.stella.validation.Validator;

public class ValidacaoDocumento {

	public static void main(String[] args) {
		String cpf = "862.883.667-57";
		String cnpj = "82588641000173";
		String titulo = "417453530116";

		try {
			validarDocumentos(new CPFValidator(), cpf);
			System.out.println("CPF valido");

		} catch (InvalidStateException e) {
			System.out.println("CPF Invalido  " + e);
		}

		try {
			validarDocumentos(new CNPJValidator(), cnpj);
			System.out.println("CNPJ valido");

		} catch (InvalidStateException e) {
			System.out.println("CNPJ Invalido  " + e);
		}

		try {
			validarDocumentos(new TituloEleitoralValidator(), titulo);
			System.out.println("Titulo valido");

		} catch (InvalidStateException e) {
			System.out.println("Titulo Invalido  " + e);
		}

	}

	private static void validarDocumentos(Validator<String> validador, String documento) {
		validador.assertValid(documento);
	}
}

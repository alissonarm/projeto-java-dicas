package br.com.alura;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class Data {

	public static void main(String[] args) {

		System.out.println(LocalDate.now());
		System.out.println(" 1 " + LocalDate.now().format(DateTimeFormatter.ofPattern("dd-MM-yyyy")));
		System.out.println(" 2 " + LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd")));
		System.out.println(" 3 " + LocalDate.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		
		System.out.println(" 4 " + LocalDateTime.now());
		System.out.println(" 5 " + LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm")));
		System.out.println(" 6 " + LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss")));
		
		System.out.println(" 7 " + LocalDateTime.now().format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT)));
		System.out.println(" 8 " + LocalDateTime.now().format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM)));
		System.out.println(" 9 " + LocalDateTime.now().format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM).withLocale(Locale.CHINA)));
		System.out.println(LocalDateTime.now().format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM).withLocale(Locale.JAPAN)));
		System.out.println(LocalDateTime.now().format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM).withLocale(Locale.CANADA_FRENCH)));
		System.out.println(LocalDateTime.now().format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM).withLocale(new Locale("pt" , "br"))));
		
		
		System.out.println(LocalDateTime.now().minusHours(10));
		System.out.println(LocalDateTime.now().plusHours(3));
	}

}

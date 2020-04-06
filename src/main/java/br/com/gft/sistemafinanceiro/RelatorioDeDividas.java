package br.com.gft.sistemafinanceiro;

import java.text.NumberFormat;
import java.util.Locale;

public class RelatorioDeDividas {

	private final Divida divida;

	public RelatorioDeDividas(Divida divida) {
		this.divida = divida;
	}
	
	public void geraRelatorio(NumberFormat formatador) {
		System.out.println("CNPJ credor: "+divida.getDocumentoCredor());
		System.out.println("Credor: "+divida.getCredor());
		
		System.out.println("Valor da divida: "+formatador.format(divida.getTotal()));
		System.out.println("Valor pago: "+formatador.format(divida.getValorPago()));
	}
	

}

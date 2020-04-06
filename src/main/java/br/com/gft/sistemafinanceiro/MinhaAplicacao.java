package br.com.gft.sistemafinanceiro;

import java.text.NumberFormat;
import java.util.Locale;

public class MinhaAplicacao {

	public static void main(String[] args) {
		//BancoDeDados bd = new BancoDeDados("localhost", "root", "root");
		Arquivo bd = new Arquivo();
		BalancoEmpresa balanco = new BalancoEmpresa(bd);
		registraDividas(balanco);
		realizaPagamentos(balanco);
	//	bd.desconecta();

	}
	
	public static void registraDividas(BalancoEmpresa balanco) {
		Divida divida1 = new Divida();
		Divida divida2 = new Divida();
		divida1.setCredor("Uma empresa");
		divida1.setTotal(1000);
		divida1.setDocumentoCredor(new Cnpj("00.000.001/0001-01"));
		

		divida1.setCredor("Meu vizinho");
		divida1.setTotal(100);
		divida1.setDocumentoCredor(new Cpf("000.000.001-01"));

		balanco.registraDividas(divida1);
		balanco.registraDividas(divida2);

	}
	
	public static void realizaPagamentos(BalancoEmpresa balanco) {
	
	
		Pagamento pagamento1 = new Pagamento();
		Pagamento pagamento2 = new Pagamento();

		pagamento1.setDocumentoPagador(new Cnpj("00.000.002/0001-02"));
		pagamento1.setPagador("Uma empresa legal");
		pagamento1.setValor(500);
		
		pagamento2.setDocumentoPagador(new Cpf("000.000.001-01"));
		pagamento2.setPagador("Meu amigo");
		pagamento2.setValor(10);
		
		balanco.pagaDivida(new Cnpj("00.000.002/0001-02"), pagamento1);
		balanco.pagaDivida(new Cpf("000.000.001-01"), pagamento2);

		
//		RelatorioDeDividas relatorio = new RelatorioDeDividas(divida);
//		NumberFormat formatador=NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
//		relatorio.geraRelatorio(formatador);
	}

}

package br.com.gft.sistemafinanceiro;

import java.util.HashMap;

public class BalancoEmpresa {
	
	private HashMap<String, Divida> dividas = new HashMap<String, Divida>(); //com esse mapa conseguimos guardar a divida de acordo com o cnpj do credo
	
	public void registraDividas(String credor, String cnpjCredor, double valor) {
		Divida divida = new Divida();
		divida.setCredor(credor);
		divida.setCnpjCredor(cnpjCredor);
		divida.setTotal(valor);
		
		dividas.put(cnpjCredor, divida);
	}
	
	public void pagaDivida(String cnpjCredor, double valor, String nomePagador, String cnpjPagador) {
		Divida divida = dividas.get(cnpjCredor);
		if (divida != null) {
			Pagamento pagamento = new Pagamento();
			pagamento.setCnpjPagador(cnpjPagador);
			pagamento.setPagador(nomePagador);
			pagamento.setValor(valor);
			divida.registra(pagamento);
		}
		
	}

}

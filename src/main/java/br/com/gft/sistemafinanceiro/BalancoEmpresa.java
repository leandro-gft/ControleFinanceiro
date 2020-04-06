package br.com.gft.sistemafinanceiro;

import java.util.HashMap;
import java.util.Map;

public class BalancoEmpresa {
	
	private BancoDeDados bd;
	
	public BalancoEmpresa(BancoDeDados bd) {
		this.bd=bd;
		
	}
	
	public void registraDividas(Divida divida) {
		bd.salva(divida);
	}
	
	public void pagaDivida(Documento documentoCredor, Pagamento pagamento) {
		Divida divida = bd.carrega(documentoCredor);
		if (divida != null) {
			divida.registra(pagamento);
		}
		registraDividas(divida);
	}
	

}

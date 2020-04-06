package br.com.gft.sistemafinanceiro;

public class BalancoEmpresa {
	
	private ArmazenadorDeDivida dividas;
	
	public BalancoEmpresa(ArmazenadorDeDivida dividas) {
		this.dividas=dividas;
		
	}
	
	public void registraDividas(Divida divida) {
		dividas.salvar(divida);
	}
	
	public void pagaDivida(Documento documentoCredor, Pagamento pagamento) {
		Divida divida = dividas.carrega(documentoCredor);
		if (divida != null) {
			divida.registra(pagamento);
		}
		registraDividas(divida);
	}
	

}

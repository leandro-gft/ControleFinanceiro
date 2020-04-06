package br.com.gft.sistemafinanceiro;

public class GerenciadoraDeDividas {

	public void efetuaPagamento(Divida divida, double valor, String nomePagador, String cnpjPagador) {
		Pagamento pagamento = new Pagamento();
		divida.registra(pagamento);
	}

}

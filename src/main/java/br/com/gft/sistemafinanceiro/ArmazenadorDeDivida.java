package br.com.gft.sistemafinanceiro;

public interface ArmazenadorDeDivida {

	void salvar(Divida divida);
	Divida carrega(Documento documentoCredor);
}

package br.com.gft.sistemafinanceiro;

import java.util.HashMap;
import java.util.Map;

public class BancoDeDados {

	private Map<Documento, Divida> dividasNoBanco = new HashMap<Documento, Divida>(); //com esse mapa conseguimos guardar a divida de acordo com o documento do credor

	public BancoDeDados(String endereco, String usuario, String senha) {
		System.out.println("Conectado");
	}
	
	public void salva(Divida divida) {
		dividasNoBanco.put(divida.getDocumentoCredor(), divida);
	}
	
	public Divida carrega(Documento documentoCredor) {
		return dividasNoBanco.get(documentoCredor);
	}
	
	public void desconecta() {
		System.out.println("Desconectado");
	}
	
}


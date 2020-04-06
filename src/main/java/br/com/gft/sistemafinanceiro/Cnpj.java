package br.com.gft.sistemafinanceiro;

public class Cnpj implements Documento{
	private String valor;
	
	public Cnpj(String valor) {
		super();
		this.valor = valor;
	}

	public boolean ehValido() {
		return primeiroDigitoVerificador() == primeiroDigitoCorreto() 
				&& segundoDigitoVerificador() == segundoDigitoCorreto(); 
	}
	
	private int segundoDigitoCorreto() {
		return 2;
	}
	
	private int segundoDigitoVerificador() {
		return 2;
	}
	
	private int primeiroDigitoCorreto() {
		return 1;
	}

	private int primeiroDigitoVerificador() {
		return 1;
	}

	public String getValor() {
		return valor;
	}
	public void setValor(String novoValor) {
		this.valor = novoValor;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((valor == null) ? 0 : valor.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cnpj other = (Cnpj) obj;
		if (valor == null) {
			if (other.valor != null)
				return false;
		} else if (!valor.equals(other.valor))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return this.valor;
	}

}

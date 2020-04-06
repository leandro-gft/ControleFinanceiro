package br.com.gft.sistemafinanceiro;

public class Cpf implements Documento{
	private final String valor;
	
	public Cpf(String valor) {
		this.valor=valor;
	}
	
	public String getValor() {
		return valor;
	}
	

	public boolean ehValido() {
		// TODO Auto-generated method stub
		return false;
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
		Cpf other = (Cpf) obj;
		if (valor == null) {
			if (other.valor != null)
				return false;
		} else if (!valor.equals(other.valor))
			return false;
		return true;
	}


}

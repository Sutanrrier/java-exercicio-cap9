package br.com.caelum.contas.modelo;

public class ContaCorrente extends Conta{
	
	@Override
	public String getTipo() {
		return super.getTipo() + "Corrente";
	}
	
	public void saca(double valor) {
		saldo -= valor - 0.10;
	}
	
}

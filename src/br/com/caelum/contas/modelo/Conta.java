package br.com.caelum.contas.modelo;

public class Conta {
	private String titular, agencia;
	private int numero, identificador;
	protected double saldo;
	private static int contador_de_contas = 0; //variável que não muda independente do objeto.

	public Conta(String titular){
		this.titular = titular;
		contador_de_contas += 1;
		identificador = Conta.contador_de_contas;
	}
	public Conta(){
		contador_de_contas += 1;
		identificador = Conta.contador_de_contas;
	}
	
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public String getAgencia() {
		return agencia;
	}
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public String getTipo() {
		return "Conta ";
	}
	
	public void saca(double valor) {
		saldo -= valor;
	}
	public void deposita(double valor) {
		saldo += valor;
	}
	
	public double calcularRendimento() {
		return saldo * 0.1;
	}
	
	public void transfere(double valor, Conta destino) {
		this.saca(valor);
		destino.deposita(valor);
	}
	
	public void recuperaDadosParaImpressao() {
		System.out.println("Identificador " + identificador);
		System.out.println("Nome do titular: " + titular);
		System.out.println("Número da Conta: " + numero + " | Agência: " + agencia);
		System.out.println("Saldo na conta: " + saldo);
	}
}

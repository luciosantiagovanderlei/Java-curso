package entities;

public class ContaCliente {
	
	private int numconta;
	private String nome;
	private double saldo;
	
	public ContaCliente() {
		
	}
	
	
	public ContaCliente(int numconta, String nome, double saldoinicial) {
		super();
		this.numconta = numconta;
		this.nome = nome;
		deposito(saldoinicial);
	}


	public ContaCliente(int numconta, String nome) {
		super();
		this.numconta = numconta;
		this.nome = nome;
	}


	public int getNumconta() {
		return numconta;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public double getSaldo() {
		return saldo;
	}


	public void deposito(double montante) {
		
		saldo += montante;
		
	}
	
	public void saque(double montante) {
		
		saldo -=  montante + 5.00;
	}
	@Override
	public String toString() {
		return "ContaCliente: numconta: " 
							+ numconta 
							+ ", nome: " 
							+ nome 
							+ ", saldo: $" 
							+ String.format("%.2f", saldo) ;
	}
	
	
	

}

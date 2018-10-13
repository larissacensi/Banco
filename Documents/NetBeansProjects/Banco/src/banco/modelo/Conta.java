/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco.modelo;

/**
 *
 * @author Larissa Censi
 */
public class Conta {
    private int agencia;
    private int numero;
    private Cliente cliente;
    private double saldo;
    
    public Conta(int agencia, int numero, Cliente cliente, double saldo) {
        this.agencia = agencia;
        this.numero = numero;
        this.cliente = cliente;
        this.saldo = saldo;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public Pessoa getCliente() {
        return cliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Agência: " + getAgencia()		
			+ "\nNúmero: " + getNumero()
			+ "\nCliente: " + getCliente()
			+ String.format("\nSaldo: R$ %.2f", 
					getSaldo());
	}
}

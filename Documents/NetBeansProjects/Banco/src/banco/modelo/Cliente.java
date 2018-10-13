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
public class Cliente extends Pessoa {
    private double rendaMensal;

    public Cliente (){super();}
    
    public Cliente(String nome, String endereco, long CPF, long telefone, double rendaMensal) {
        super(nome, endereco, CPF, telefone);
        this.rendaMensal = rendaMensal;
        
    }
    
    public double getRendaMensal() {
        return rendaMensal;
    }

    public void setRendaMensal(double rendaMensal) {
        this.rendaMensal = rendaMensal;
    }
    
    @Override
	public String toString() {
            return super.toString()	
                + String.format("\nRenda mensal: R$ %.2f", 
		getRendaMensal());
	}
    
}

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
public class Pessoa {
    private String nome;
    private String endereco;
    private long CPF;
    private long RG;
    private long telefone;
    
    public Pessoa (){        
    }

    public Pessoa(String nome, String endereco, long CPF, long telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.CPF = CPF;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public long getCPF() {
        return CPF;
    }

    public long getRG() {
        return RG;
    }

    public long getTelefone() {
        return telefone;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setCPF(long CPF) {
        this.CPF = CPF;
    }

    public void setRG(long RG) {
        this.RG = RG;
    }

    public void setTelefone(long telefone) {
        this.telefone = telefone;
    }
    	@Override
	public String toString() {
		return "nome: " + getNome() 
				+ "\nendereço: " + getEndereco()
				+ "\nCPF: " 
						+ String.valueOf(getCPF())
						.replaceFirst("(\\d{3})(\\d{3})(\\d{3})(\\d{2})", 
								"$1.$2.$3-$4")
			    + "\nRG: "
						+ String.valueOf(getRG())
						.replaceFirst("(\\d{1})(\\d{3})(\\d{3})(\\d*)", 
								"$1.$2.$3")
				+ "\nTelefone: "	
					+ String.valueOf(getTelefone())
					.replaceFirst("(\\d{2})(\\d{4})(\\d{4})", 
							"($1) $2-$3");

	}
    
}

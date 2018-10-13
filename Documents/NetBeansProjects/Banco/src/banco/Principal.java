/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package banco;

import banco.modelo.Banco;
import banco.modelo.Cliente;
import banco.modelo.Conta;
import banco.modelo.Pessoa;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Larissa Censi
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Banco bc = new Banco();
        ArrayList<Conta> banco = new ArrayList<>();
        Cliente cliente;
        cliente = new Cliente();
        Conta conta;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        cliente.setNome(entrada.nextLine());
        System.out.println("Digite seu endereço: ");
        cliente.setEndereco(entrada.nextLine());
        System.out.println("Digite seu CPF: ");
        cliente.setCPF(entrada.nextLong());
        System.out.println("Digite seu RG: ");
        cliente.setRG(entrada.nextLong());
        System.out.println("Digite seu telefone: ");
        cliente.setTelefone(entrada.nextLong());
        System.out.println("Digite sua renda mensal: ");
        cliente.setRendaMensal(entrada.nextDouble());
        System.out.println("Digite a agência bancaria: ");
        int agencia = entrada.nextInt();
        System.out.println("Digite o numero da conta bancária: ");
        int numero = entrada.nextInt();
        System.out.println("Digite o saldo inicial: ");
        double saldo = entrada.nextDouble();
        
  
        
        conta = new Conta(agencia, numero, cliente, saldo);
        System.out.println("----------------------- Conta corrente -----------------------");
        System.out.println(conta);
        entrada.close();
              
    }
    
}

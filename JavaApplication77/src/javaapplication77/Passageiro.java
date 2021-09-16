/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication77;

/**
 *
 * @author Marcos
 */
public class Passageiro extends Pessoa{
    private int codigoCliente;

    public Passageiro(String nome, String cpf) {
        super(nome, cpf);
    }

    public Passageiro(int codigoCliente, String nome, String cpf) {
        super(nome, cpf);
        this.codigoCliente = codigoCliente;
    }
       

    public int getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(int codigoCliente) {
        this.codigoCliente = codigoCliente;
    }
    
    public void imprime(){
        System.out.println("Nome: " + this.getNome());
        System.out.println("Cpf: " + this.getCpf());
    }
    
}

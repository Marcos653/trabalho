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
public class Motorista extends Pessoa{
    private int matricula;
    private String habilitacao;

    public Motorista(String nome, String cpf) {
        super(nome, cpf);
    }

    public Motorista(int matricula, String habilitacao, String nome, String cpf) {
        super(nome, cpf);
        this.matricula = matricula;
        this.habilitacao = habilitacao;
    }
    

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getHabilitacao() {
        return habilitacao;
    }

    public void setHabilitacao(String habilitacao) {
        this.habilitacao = habilitacao;
    }
    
    public void imprime(){
        System.out.println("Nome: " + this.getNome());
        System.out.println("Cpf: "  + this.getCpf());
        System.out.println("Matricula: " + this.getMatricula());
        System.out.println("HabilitaÇão: " + this.getHabilitacao());
    }
    
}

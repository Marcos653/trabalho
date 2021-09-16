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
public class JavaApplication77 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Motorista mot = new Motorista(123456, "B", "Marcelo", "123456789");
       Passageiro pass = new Passageiro(123456, "Bruno", "987654332");
       
        System.out.println("Motorista");
        mot.imprime();
        System.out.println("-------------");
        System.out.println("Passageiro");
        pass.imprime();
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author 123221596
 */
public class TestaVetor {
    public static void main(String[]args){
        Vetor vetor =new Vetor(5);
        System.out.println(vetor);
        vetor.adiciona("elemento 1");
        vetor.adiciona("elemento 2");
        vetor.adiciona("elemento 3");
        System.out.println(vetor);
        vetor.aumentaCapacidade();
        vetor.tamanho();
        vetor.remove(1);
        System.out.println(vetor);
    }
}

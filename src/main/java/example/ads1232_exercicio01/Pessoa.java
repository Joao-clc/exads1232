/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package example.ads1232_exercicio01;

/**
 *
 * @author camar
 */
public class Pessoa {
    private String nome;
    private double peso;
    private double altura;
    private String sexo;
    
    public Pessoa (String nome, double peso, double altura, String sexo){
        this.nome = nome;
        this.peso = peso;
        this.altura = altura; 
        this.sexo = sexo; 
}
    
    public double calcularImc(){
        return (peso/(altura * altura));
    }
}


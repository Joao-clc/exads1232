/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package example.ads1232_exercicio01;

/**
 *
 * @author camar
 */
public class Ads1232_exercicio01 {

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Vanderlei",90,1.77,"masculino");
        
        System.out.println("Seu IMC: " + p1.calcularImc());
    }
}

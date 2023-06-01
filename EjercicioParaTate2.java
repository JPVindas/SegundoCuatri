/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.para.tate.pkg2;

import javax.swing.JOptionPane;

/**
 *
 * @author LABORATORIO 04
 */
public class EjercicioParaTate2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here0
       String segura= JOptionPane.showInputDialog("Digite el numero que desea multiplicar");
        int numero= Integer.parseInt(segura);
        
        System.out.println("Tablas de multiplicar del:" + numero +":");
        for(int i =1; i<=10; i++) {
            int resultado= numero* i;
            System.out.println(numero + "x"+ i +"=" + resultado);
        }
             
      
   

    }
    
}
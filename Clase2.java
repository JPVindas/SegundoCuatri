/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase.pkg2;
import java.util.Scanner;


/**
 *
 * @author user
 */
public class Clase2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese los años de antiguedad: ");
        int antiguedad = scanner.nextInt();

        System.out.print("Ingrese la cantidad de horas laboradas por semana: ");
        int horasLaboradas = scanner.nextInt();

        System.out.print("Ingrese el precio por hora: ");
        double precioPorHora = scanner.nextDouble();

        double salarioBruto = horasLaboradas * precioPorHora * 4; // Se multiplica por 4 semanas en un mes

        if (antiguedad > 10) {
            double bono = salarioBruto * 0.20; // Cálculo del bono del 20%
            salarioBruto += bono;

            if (salarioBruto > 2000) {
                double deduccion = salarioBruto * 0.15; // Cálculo de la deducción del 15% si el salario supera los $2000
                salarioBruto -= deduccion;
            } else if (salarioBruto > 1000) {
                double deduccion = salarioBruto * 0.10; // Cálculo de la deducción del 10% si el salario supera los $1000
                salarioBruto -= deduccion;
            }
        }

        System.out.println("Salario neto final: " + salarioBruto);
    }
    
}

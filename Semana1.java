
package semana.pkg1;

import javax.swing.JOptionPane;


public class Semana1 {

    public static void main(String[] args) {
        //declaracion de variables
        String nombre;
        String cadena;
        double salario;
        String deducciones;
        double deduccionesPorcentaje = 9.34;
        
        
        //Salta la ventana para guardar mis datos.
        
        nombre = JOptionPane.showInputDialog("Digite su nombre : ");
        salario = Double.parseDouble(JOptionPane.showInputDialog("Su salario es de: "));
        deducciones = JOptionPane.showInputDialog("¿Sus deduciones corresponden a un 9.34%?");
        
        double deduccionesValor = salario * (deduccionesPorcentaje / 100);
        double salarioDespuesDeducciones = salario - deduccionesValor;
        
        
        JOptionPane.showMessageDialog(null,"Estimado "+nombre+ ",el salrio de este mes se desglosa de la siguiente manera:" );
        JOptionPane.showMessageDialog(null,"Salario Bruto:"+salario );
        JOptionPane.showMessageDialog(null,"Deducciones:"+ deduccionesPorcentaje);
        JOptionPane.showMessageDialog(null, "Salario Neto:"+salarioDespuesDeducciones);
        
        
        
        
        
        
        
                
                

    }
    
}

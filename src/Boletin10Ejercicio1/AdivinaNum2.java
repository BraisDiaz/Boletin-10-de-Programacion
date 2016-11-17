
package Boletin10Ejercicio1;

import javax.swing.JOptionPane;

/**
 *
 * @author Brais
 */
public class AdivinaNum2 {
    
    public void xogoNum2 (){
        
        int nintentosf = Integer.parseInt(JOptionPane.showInputDialog("Xogador 1: Establezca o número de intentos para adiviñar o número"));
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Xogador 1: Introduzca valor do número a adiviñar (entre 0 e 50)"));
        
        if (num1>0&&num1<=50){        
           
        do {
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Xogador 2: Intente adiviñar o número (entre 0 e 50)"));
        int aux0 = Math.abs(num1-num2);
        
         if (aux0!=0){
         if (aux0<=5){
            System.out.println("Estás moi cerca de acertar o número");
            }
           
         else if (aux0<=20){
            System.out.println("Todavía debes acercarte máis");
            }
         else if (aux0<=35){
            System.out.println("Sorte que non te gañas a vida con esto, estás moi lonxe");
            }
         
         nintentosf--;
         JOptionPane.showMessageDialog(null, "Te quedan " + nintentosf + " número de intentos");
         } else{
            JOptionPane.showMessageDialog(null, "Felicidades, acertache o número");
            break;
         }
    } while (nintentosf!=0);
         JOptionPane.showMessageDialog(null, "Ha agotado o número de intentos ou ha acertado o número");
            
    } else
            JOptionPane.showMessageDialog(null, "No ha introducido un número entre 0 y 50, pulse iniciar");
        }
    }






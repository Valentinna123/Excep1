
package quinto;

import javax.swing.JOptionPane;


public class Quinto {

    
    public static void main(String[] args) {
        division();
    }
    
    public static void division(){
    
        int num=0,div=0,resul=0;
        try{
        num=Integer.parseInt(JOptionPane.showInputDialog(null,"Digite numero"));
         if (num<10)
         throw new NumberFormatException();
         
        div=Integer.parseInt(JOptionPane.showInputDialog(null,"Digite divisor"));
       
        }catch(NumberFormatException nu){
            System.out.println("No use letras");
        }
        
        
        try{
           resul=num/div;
           
        }catch(ArithmeticException nu){
            System.out.println("No divida en 0");
        }
        
        
        JOptionPane.showMessageDialog(null,"La division es"+resul);
        JOptionPane.showMessageDialog(null,"Los numeros son:"+num +"/"+div);
        
    }
    

}

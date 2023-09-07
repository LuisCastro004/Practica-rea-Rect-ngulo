/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operaciones;

/**
 *
 * @author labcca
 */
public class Practica2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nombre = "Jose Luis Lopez Castro";
        System.out.println("Mi nombre es: " + nombre);
                
        int base = 12;
        int altura = 6;
        
        int areaRec = base * altura;
        
        double baseDecimal = 12.5;
        double alturaDecimal = 6.8;
        
        double areaRecDecimales = baseDecimal * alturaDecimal;
        
        System.out.println("El area del rectangulo con enteros es: " + areaRec);
        System.out.println("El area del rectangulo con decimales es: " + areaRecDecimales); 
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

/**
 *
 * @author reroes
 */
public class Problema03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Encuentre la suma de las posiciones 0 de datos y datos2 
        //(use un método recursivo) y el valor de la suma, asignarle a un 
        //arreglo llamado suma
        
        
        double[] datos1 = {100, 90, 80, 70, 60};
        double[] datos2 = {200, 190, 180, 170, 160};
        double[] suma = new double[5];

        for (int f = 0; f < datos1.length; f++) {
            suma[f] = suma(datos1[f], datos2[f]);
            System.out.printf("%s\n", suma[f]);
        }
    }

    public static double suma(double datos1, double datos2) {
        if (datos1 == 0) {
            return datos2;
        } else {
            if (datos2 == 0) {
                return datos1;
            } else {
                return 1 + suma(datos1, datos2 - 1);
            }
        }
    }
}
// 1+ 100, 209 // 1+101, 208 // 1+102, 207....... 1+299, 1 // 1+300, 0
//                                                      a=300 b=0 // retorna a
    
    


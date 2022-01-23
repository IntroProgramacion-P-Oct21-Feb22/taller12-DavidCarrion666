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
public class Problema01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Use un método recursivo que permita encontrar el factorial de cada 
        //posición del arreglo. El resultado de cada posición debe ubicarlo en
        //el siguiente arreglo
        
        
        double[][] datos = {{10, 2}, {1, 5}, {6, 2}, {7, 8}};
        double[][] resultado = new double[4][2];       
        
        for (int f = 0; f < datos.length; f++) {
            for (int c = 0; c < datos[f].length; c++) {
                resultado[f][c] = resultado(datos[f][c]);
                System.out.printf("%s\n", resultado[f][c]);
            }
        }
    }

    public static double resultado(double datos) {
        if (datos <= 1) {
            return 1;
        } else {
            return datos * resultado(datos - 1);
        }
    }
}

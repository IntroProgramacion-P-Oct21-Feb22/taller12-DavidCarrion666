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
public class Problema04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Encuentre la potencia de las posiciones 0 de datos(base) y 
        // datos2(potencia) , use un método recursivo; y el valor de la 
        // potencia, asignarle a un arreglo llamado resultado
               
        double[] bases = {100, 90, 80, 70, 60};
        double[] potencias = {2, 3, 2, 2, 1};
        double[] resultado = new double[5];
              
        for (int f = 0; f < bases.length; f++) {
            resultado[f] = potencia(bases[f], potencias[f]);
        }
        System.out.printf("%s\n", suma(resultado, resultado.length));
    }

    public static double potencia(double base, double potencia) {

        if (potencia == 1) {
            return base;
        } else {
            return base * potencia(base, potencia - 1);
            //     100 * (100, 1)  // 1000
        }
    }

    public static double suma(double[] arreglo, int tamaño) {
        if (tamaño == 1) {
            return arreglo[0];
        } else {
            return arreglo[tamaño - 1] + suma(arreglo, tamaño - 1);
        }
    }
}
    
    


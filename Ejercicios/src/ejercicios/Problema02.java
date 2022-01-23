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
public class Problema02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // A través de un método recursivo encuentre y presente la suma de la 
        //posición datos1[n][n] con la posición2[n][n], el resultado ubicarlo en
        //un nuevo arreglo llamado datos3[n][n].
        
        
        double[][] datos1 = {{10, 2, 3}, {1, 5, 8}, {6, 2, 3}, {7, 8, 1}};
        double[][] datos2 = {{10, 2, 3}, {1, 5, 8}, {6, 2, 3}, {7, 8, 1}};
        double[][] datos3 = new double[4][3];

        for (int f = 0; f < datos1.length; f++) {
            for (int c = 0; c < datos1[f].length; c++) {
                datos3[f][c] = suma(datos1[f][c], datos2[f][c]);
                System.out.printf("%s\n", datos3[f][c]);
            }
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

// 1+10, 9 // 1 + 11,8 // 1 + 12, 7.... // 1 + 20, 0 retorna 20 


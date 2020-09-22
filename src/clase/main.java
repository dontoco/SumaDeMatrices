/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase;

/**
 *
 * @author Victor
 */
public class main {

    public static void main(String[] args) {
        int matriz_uno[][] = new int[3][3];
        int matriz_Dos[][] = new int[3][3];
        int matriz_Resultado[][] = new int[3][3];

        for (int i = 0; i < matriz_uno.length; i++) {
            for (int j = 0; j < matriz_uno.length; j++) {
                matriz_uno[i][j] = (int) (Math.random() * 5);

            }

        }
        for (int i = 0; i < matriz_Dos.length; i++) {
            for (int j = 0; j < matriz_Dos.length; j++) {
                matriz_Dos[i][j] = (int) (Math.random() * 5);

            }

        }
        for (int i = 0; i < matriz_uno.length; i++) {
            for (int j = 0; j < matriz_uno.length; j++) {
                matriz_Resultado[i][j] = matriz_uno[i][j] + matriz_Dos[i][j];

            }

        }
        /// imprimiendo matrices 
        for (int i = 0; i < matriz_uno.length; i++) {
            for (int j = 0; j < matriz_uno.length; j++) {
                System.out.print("[" + matriz_uno[i][j] + "]");

            }
            ///// esto genera el espacio entre las matrices 
            if (i == 1) {
                System.out.print("   +  ");
            }
            else{
                System.out.print("      ");
            }
            for (int j = 0; j < matriz_Dos.length; j++) {

                System.out.print("[" + matriz_Dos[i][j] + "]");

            }
            if (i == 1) {
                System.out.print("   =  ");
            }
            else{
                System.out.print("      ");
            }
            for (int j = 0; j < matriz_Resultado.length; j++) {
                System.out.print("[" + matriz_Resultado[i][j] + "]");
                
                
            }
            System.out.println("");
        }
    }
}

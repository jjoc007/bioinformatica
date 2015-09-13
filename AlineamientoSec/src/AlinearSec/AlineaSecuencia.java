/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AlinearSec;

/**
 *
 * @author JuanC
 */
public class AlineaSecuencia {
    
    int matrizS[][];
    int espacio;

    public AlineaSecuencia() {
        
        matrizS = new int[4][4];
        // Inicializa matriz S
        matrizS[0][0] = 10;
        matrizS[0][1] = -1;
        matrizS[0][2] = -3;
        matrizS[0][3] = -4;
        matrizS[1][0] = -1;
        matrizS[1][1] = 7;
        matrizS[1][2] = -5;
        matrizS[1][3] = -3;
        matrizS[2][0] = -3;
        matrizS[2][1] = -5;
        matrizS[2][2] = 9;
        matrizS[2][3] = 0;
        matrizS[3][0] = -4;
        matrizS[3][1] = -3;
        matrizS[3][2] = 0;
        matrizS[3][3] = 8;
        //Inicializar valor del espacio
        espacio = -5;
    }

    public int[][] getMatrizS() {
        return matrizS;
    }

    public void setMatrizS(int[][] matrizS) {
        this.matrizS = matrizS;
    }

    public int getEspacio() {
        return espacio;
    }

    public void setEspacio(int espacio) {
        this.espacio = espacio;
    }

}

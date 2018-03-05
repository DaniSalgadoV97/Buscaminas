/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heartssweeper;

/**
 *
 * @author Estudiantes
 */
public class Tablero {

    private Celda misCeldas[][];
    private Crono miCrono;
    private Contador miCounter;
    private Emoji miEmoji;

    public Tablero(int ancho, int largo) {

        misCeldas = new Celda[ancho][largo];
        int fila = 0;
        int columna;
        for (fila = 0; fila < largo; fila++) {
            for (columna = 0; columna < ancho; columna++) {
                misCeldas[fila][columna] = new Celda();
            }
        }
        Sembrador miTrabajador = new Sembrador();
        miTrabajador.sembrarCorazones(misCeldas, 50);
        
    }
}

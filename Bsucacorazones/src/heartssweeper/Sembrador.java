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
public class Sembrador {
    
    void sembrarCorazones(Celda lasCeldas[][], int cantidad) {
        for (Celda[] laFila:lasCeldas){
        for(Celda laCelda:laFila){
            Corazón unCorazon=new Corazón();
            laCelda.setMiCorazón(unCorazon);
            
        }
        }
   }
    
}

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
public class Celda {
    private Corazón miCorazón;
    private boolean estado;
    private Bandera miBandera;
    private int CorazonesAlrededor;

    public Corazón getMiCorazón() {
        return miCorazón;
    }

    public void setMiCorazón(Corazón miCorazón) {
        this.miCorazón = miCorazón;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public Bandera getMiBandera() {
        return miBandera;
    }

    public void setMiBandera(Bandera miBandera) {
        this.miBandera = miBandera;
    }

    public int getCorazonesAlrededor() {
        return CorazonesAlrededor;
    }

    public void setCorazonesAlrededor(int CorazonesAlrededor) {
        this.CorazonesAlrededor = CorazonesAlrededor;
    }
    

}

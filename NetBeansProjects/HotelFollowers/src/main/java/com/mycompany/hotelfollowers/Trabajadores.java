/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hotelfollowers;

/**
 *
 * @author saram
 */
public class Trabajadores {
    private String name;
    private float horasTurno;
    private float inicioTurno;
    private float finTurno;

    public Trabajadores(String name, float horasTurno, float inicioTurno, float finTurno) {
        this.name = name;
        this.horasTurno = horasTurno;
        this.inicioTurno = inicioTurno;
        this.finTurno = finTurno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getHorasTurno() {
        return horasTurno;
    }

    public void setHorasTurno(float horasTurno) {
        
        this.horasTurno = horasTurno;
    }

    public float getInicioTurno() {
        return inicioTurno;
    }

    public void setInicioTurno(float inicioTurno) {
        this.inicioTurno = inicioTurno;
    }

    public float getFinTurno() {
        return finTurno;
    }

    public void setFinTurno(float finTurno) {
        this.finTurno = finTurno;
    }
    
    
    
}

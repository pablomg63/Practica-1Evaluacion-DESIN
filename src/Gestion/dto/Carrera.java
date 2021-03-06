/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gestion.dto;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author PABLO
 */
public class Carrera {
    private String nombre;
    private Date fechaCarrera;
    private String lugar;
    private int numPart;
    private int dorsal;
    private ArrayList<Corredor>listaCorredores= new ArrayList<>();
    private ArrayList<Corredor>llegada= new ArrayList<>();

    public Carrera(String nombre, Date fechaCarrera, String lugar, int numPart, int dorsal) {
        this.nombre = nombre;
        this.fechaCarrera = fechaCarrera;
        this.lugar = lugar;
        this.numPart = numPart;
        this.dorsal = dorsal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaCarrera() {
        return fechaCarrera;
    }

    public void setFechaCarrera(Date fechaCarrera) {
        this.fechaCarrera = fechaCarrera;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public int getNumPart() {
        return numPart;
    }

    public void setNumPart(int numPart) {
        this.numPart = numPart;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public ArrayList<Corredor> getListaCorredores() {
        return listaCorredores;
    }

    public void setListaCorredores(ArrayList<Corredor> listaCorredores) {
        this.listaCorredores = listaCorredores;
    }
    
     public String[] toArrayString()
    {
        String[] s = new String[4];
        s[0] = nombre;
        s[1] = lugar;
        s[2] = fechaCarrera.toString();
        s[3] = String.valueOf(numPart);
        //s[4] = String.valueOf(dorsal);
        return s;
    }
     
    public void AñadirCorredor(Corredor corredor){
        dorsal++;
        corredor.setDorsalCarrera(dorsal);
       listaCorredores.add(corredor); 
    }
    
    public void BorrarCorredor(String dni){
        for (int i = 0; i < listaCorredores.size(); i++) {
            if(listaCorredores.get(i).getDni().equals(dni)){
                listaCorredores.remove(i);
            }
        }
    }

    @Override
    public String toString() {
        return "Carrera{" + "nombre=" + nombre + ", fechaCarrera=" + fechaCarrera + ", lugar=" + lugar + ", numPart=" + numPart + ", dorsal=" + dorsal + ", listaCorredores=" + listaCorredores + '}';
    }
    
    
}



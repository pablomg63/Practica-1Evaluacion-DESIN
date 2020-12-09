/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gestion.dto;

import java.util.Date;

/**
 *
 * @author PABLO
 */
public class Corredor {
    String nombre;
    String dni;
    Date fechaNac;
    String direccion;
    String telf;

    public Corredor(String nombre, String dni, Date fechaNac, String direccion, String telf) {
        this.nombre = nombre;
        this.dni = dni;
        this.fechaNac = fechaNac;
        this.direccion = direccion;
        this.telf = telf;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Date getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(Date fechaNac) {
        this.fechaNac = fechaNac;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelf() {
        return telf;
    }

    public void setTelf(String telf) {
        this.telf = telf;
    }
     public String[] toArrayString()
    {
        String[] s = new String[5];
        s[0] = nombre;
        s[1] = direccion;
        s[2] = fechaNac.toString();
        s[3] = telf;
        s[4] = dni;
        return s;
    }

    @Override
    public String toString() {
        return "Corredor{" + "nombre=" + nombre + ", dni=" + dni + ", fechaNac=" + fechaNac + ", direccion=" + direccion + ", telf=" + telf + '}';
    }
    
}


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
public class Gestor {
    private ArrayList<Carrera>listaCarrera= new ArrayList<>();
    private ArrayList<Corredor>listaCorredor=new ArrayList<>();
    private String dniModificar ="";
    private String nombreCarreraModificar ="";

    public void setDniModificar(String dniModificar) {
        this.dniModificar = dniModificar;
    }

    public void setNombreCarreraModificar(String nombreCarreraModificar) {
        this.nombreCarreraModificar = nombreCarreraModificar;
    }

    public String getDniModificar() {
        return dniModificar;
    }

    public String getNombreCarreraModificar() {
        return nombreCarreraModificar;
    }
    
    public ArrayList<Carrera> getListaCarrera() {
        return listaCarrera;
    }

    public ArrayList<Corredor> getListaCorredor() {
        return listaCorredor;
    }
    
    
    public void DarAltaCarrera(String nombre, Date fechaCarrera, String lugar, int numPart, int dorsal){
        Carrera carrera= new Carrera(nombre, fechaCarrera, lugar, numPart, dorsal);
        listaCarrera.add(carrera);
    }
    
    public void DarAltaCorredor(String nombre, String dni, Date fechaNac, String direccion, String telf){
         Corredor corredor= new Corredor(nombre, dni, fechaNac, direccion, telf);
         listaCorredor.add(corredor);
    }
    
    public void DarBajaCarrera(String nombre){
        for (int i = 0; i < listaCarrera.size(); i++) {
            if(listaCarrera.get(i).getNombre().equals(nombre)){
                listaCarrera.remove(i);
            }else{
                System.out.println("No existe dicha carrera");
            }
        }
    }
    
    public void DarBajaCorredor(String dni){
        for (int i = 0; i < listaCorredor.size(); i++) {
            if (listaCorredor.get(i).getDni().equals(dni)) {
                listaCorredor.remove(i);  
            }else{
                System.out.println("No existe dicho corredor");
            }
        }
    }
    public void BorrarCorredorCarrera(String dni){
        for (int i = 0; i < listaCarrera.size(); i++) {
           listaCarrera.get(i).BorrarCorredor(dni);
        }
    }
    public Corredor BuscarCorredor(String dni){
        for (int i = 0; i < listaCorredor.size(); i++) {
            if(listaCorredor.get(i).getDni().equals(dni)){
                return listaCorredor.get(i);
            }
        }
        return null;
    }
    public Carrera BuscarCarrera(String nombreCarrera){
        for (int i = 0; i < listaCarrera.size(); i++) {
           if( listaCarrera.get(i).getNombre().equals(nombreCarrera)){
               return listaCarrera.get(i);
           }
        }
        return null;
    }
    public ArrayList<Corredor> CorredoresCarreras(String nombreCarrera){
        for (int i = 0; i < listaCarrera.size(); i++) {
            if (listaCarrera.get(i).getNombre().equals(nombreCarrera)) {
                return listaCarrera.get(i).getListaCorredores();
            }
        }
        return null;
    }
    public void AñadirCorredorCarrera(String nombreCarrera, String dni){
        Carrera carrera = BuscarCarrera(nombreCarrera);
        Corredor corredor = BuscarCorredor(dni);
        carrera.AñadirCorredor(corredor);
        
        for (int i = 0; i < carrera.getListaCorredores().size(); i++) {
          System.out.println(carrera.getListaCorredores().get(i).toArrayStringDorsal());
        }
    }
    public void ModificarCorredor(String dni,String nuevaDireccion,String nuevoTelefono){
        Corredor c= BuscarCorredor(dni);
        c.setDireccion(nuevaDireccion);
        c.setTelf(nuevoTelefono);
    }
    public void ModificarCarrera(String nombre, String nuevoLugar, Date nuevaFecha, int nuevosParticipantes){
        Carrera c= BuscarCarrera(nombre);
        c.setLugar(nuevoLugar);
        c.setFechaCarrera(nuevaFecha);
        c.setNumPart(nuevosParticipantes);
    }
}

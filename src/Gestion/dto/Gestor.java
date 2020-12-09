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
    ArrayList<Carrera>listaCarrera= new ArrayList<>();
    ArrayList<Corredor>listaCorredor=new ArrayList<>();

    public ArrayList<Carrera> getListaCarrera() {
        return listaCarrera;
    }
    
    public void DarAltaCarrera(String nombre, Date fechaCarrera, String lugar, int numPart, int dorsal){
        Carrera carrera= new Carrera(fechaCarrera, lugar, numPart, dorsal);
        listaCarrera.add(carrera);
    }
    
    public void DarAltaCorredor(String nombre, String dni, Date fechaNac, String direccion, String telf){
         Corredor corredor= new Corredor(nombre, dni, fechaNac, direccion, telf);
         listaCorredor.add(corredor);
    }
    
    public void DarBajaCarrera(String nombre, Date fechaCarrera, String lugar, int numPart, int dorsal){
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
    
    public void AsociarCorredor(String nombre, String dni){
        
    }
}

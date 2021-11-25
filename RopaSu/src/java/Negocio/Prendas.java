/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import Dato.Conexion;


public class Prendas {
    
    private String codigo, nombre, clasificacion, tiempo;
    private int cantidad;

    public Prendas(String codigo, String nombre, String clasificacion, String tiempo, int cantidad) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.clasificacion = clasificacion;
        this.tiempo = tiempo;
        this.cantidad = cantidad;
    }

    
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    public String getTiempo() {
        return tiempo;
    }

    public void setTiempo(String tiempo) {
        this.tiempo = tiempo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

   
    public boolean insertar(){
        
       boolean respuesta;
        
       Conexion co = new Conexion();
        
       co.abrirConexion();
       respuesta = co.InsertarBD(codigo,nombre,cantidad,clasificacion,"A1");
       co.cerrarConexion();
        
       return respuesta;   
    }
    
   
}

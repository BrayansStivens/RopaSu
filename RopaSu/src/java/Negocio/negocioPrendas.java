/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import Dato.Conexion;


public class negocioPrendas {
//Atributos
    private String codigo, nombre, clasificacion, tiempo;
    private int cantidad;
    private double precio;
//Constructores
    public negocioPrendas(String codigo, String nombre, String clasificacion, String tiempo, int cantidad, double precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.clasificacion = clasificacion;
        this.tiempo = tiempo;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public negocioPrendas() {
    }
    
    public negocioPrendas(String codigo){
        this.codigo = codigo;
    }
//Setters and Getters
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

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

   

   
    public boolean insertar(String lote){
        
       boolean respuesta;
        
       Conexion co = new Conexion();
        
       co.abrirConexion();
       respuesta = co.InsertarP(codigo,nombre,cantidad,clasificacion,tiempo,precio,lote);
       co.cerrarConexion();
        
       return respuesta;   
    }
    
    public void consultar(){
        
        Conexion co = new Conexion();
        negocioPrendas P;
        co.abrirConexion();
        P= co.ConsultarP(codigo);
        co.cerrarConexion();
        
        nombre = P.getNombre();
        cantidad = P.getCantidad();
        clasificacion = P.getClasificacion();
        tiempo = P.getTiempo();
        precio = P.getPrecio();

    }
}

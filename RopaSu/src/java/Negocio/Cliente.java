package Negocio;


import Dato.Conexion;


public class Cliente {
    
    private String cedula;
    private String nombre;
    
    
    public void setCedula(String cedula){
        
        this.cedula = cedula;
    }
    
    public void setNombre(String nombre){
        
        this.nombre = nombre;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void consultar(){
        
        Conexion co = new Conexion();
        
        co.abrirConexion();
        nombre = co.ConsultarBD(cedula);
        co.cerrarConexion();
        
        
    }
    
    
    public boolean insertar(){
        
        boolean respuesta;
        
        Conexion co = new Conexion();
        
        co.abrirConexion();
        respuesta = co.InsertarBD(cedula, nombre);
        co.cerrarConexion();
        
        return respuesta;
        
    }
    
}

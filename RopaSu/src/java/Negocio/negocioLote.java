
package Negocio;

import Dato.Conexion;


public class negocioLote {
    
    private String  codigo;
    private int proceso;

    public negocioLote( String codigo, int proceso) {
        this.codigo = codigo;
        this.proceso = proceso;
    }
    
    public negocioLote(String codigo){
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getProceso() {
        return proceso;
    }

    public void setProceso(int proceso) {
        this.proceso = proceso;
    }
    
    
    public boolean insertar(){
        
       boolean respuesta;
        
       Conexion co = new Conexion();
        
       co.abrirConexion();
       respuesta = co.InsertarL(codigo,proceso);
       co.cerrarConexion();
        
       return respuesta;   
    }
    
    public void consultar(){
        
        Conexion co = new Conexion();
        negocioLote L;
        co.abrirConexion();
        L= co.ConsultarL(codigo);
        co.cerrarConexion();
        
        codigo = L.getCodigo();
        proceso = L.getProceso();

    }
    
}

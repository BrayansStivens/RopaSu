package Dato;

import java.sql.*;

public class Conexion {
    
    private String bd;
    private String dsn;
    private Connection cn;
    private Statement s;
    private ResultSet rs;
    private CallableStatement cstmt;
    
    
    public Conexion(){
        
        bd="RopaSu";
        dsn="jdbc:sqlserver://localhost:1433;databaseName=" + bd + ";user=Su_Ropa;password=suropaitm";
        
    }
    
    public void abrirConexion(){
        
        try{
            
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            cn= DriverManager.getConnection(dsn);
            
        
        
        }catch(Exception ex){
            
            System.out.println("Error: " + ex.getMessage());
            
        }
        
        
    }
    
    
    public String ConsultarBD(String ced){
        
        try{
        
        /*s = cn.createStatement();
        
        rs = s.executeQuery ("select nombre from Cliente where cedula = " + ced);*/
            
            
       cstmt = cn.prepareCall("{call consultar('" + ced + "')}");
       
       rs = cstmt.executeQuery();
            
        
        rs.next();
        
        
        return rs.getString(1);
        
        
        
        
        }catch(Exception ex){
            
            return null;
            
        }
    }
    
    
    public boolean InsertarP(String codigo, String nombre, int cant, String classi, String lot ){
        
        try{
            
            int filaguardada;
            
           s = cn.createStatement();
           
           filaguardada = s.executeUpdate("Insert into prendas values('" + codigo + "', '" + nombre + "', '"+ cant + "', '"  + classi +  "', '" + lot + "')");
   
           if (filaguardada == 1){
               
               return true;
               
           }else{
               
               return false;
           }
            
            
            
        }catch(Exception ex){
            
            return false;
            
        }
        
    }
    
   
    public void ActualizarP(String tiempo){
        
    }
    
    public void cerrarConexion(){
        
        try{
            
           cn.close();
            
        }catch(Exception e){
            
            System.out.println("Error: "+ e.getMessage());
        }
        
        
    }
    
    
}

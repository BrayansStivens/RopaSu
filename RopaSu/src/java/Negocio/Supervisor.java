
package Negocio;


public class Supervisor extends Empleado{
    
    //Atributos
    
    private  String proceso, jornada;

    //Constructor
    
    public Supervisor(String codigo, String nombre, String apellido, String proceso, String jornada) {
        super(codigo, nombre, apellido);
        this.proceso = proceso;
        this.jornada = jornada;
    }
    
    //Getters and Setters

    public String getProceso() {
        return proceso;
    }

    public void setProceso(String proceso) {
        this.proceso = proceso;
    }

    public String getJornada() {
        return jornada;
    }

    public void setJornada(String jornada) {
        this.jornada = jornada;
    }
    
    //Metodos
    
    
    
}

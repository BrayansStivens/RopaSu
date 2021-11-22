
package Negocio;

import java.util.ArrayList;
import java.util.List;

public class Operador extends Empleado{
     //Atributos
    
    private  String hora_lote,ocupacion;
    private List<String> lote = new ArrayList<String>();

    //Constructor
    
   public Operador(String hora_lote, String codigo, String nombre, String apellido, String ocupacion) {
        super(codigo, nombre, apellido);
        this.hora_lote = hora_lote;
        this.ocupacion = ocupacion;
    }
    
    //Getters and Setters

    public String getHora_lote() {
        return hora_lote;
    }

    public void setHora_lote(String hora_lote) {
        this.hora_lote = hora_lote;
    }

    public List<String> getLote() {
        return lote;
    }

    public void setLote(List<String> lote) {
        this.lote = lote;
    }
    
     public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }
    
    //Metodos

   

    

    
    
}

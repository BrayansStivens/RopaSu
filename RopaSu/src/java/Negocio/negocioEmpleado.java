
package Negocio;


public class negocioEmpleado {
    
    //Atributos
    
    private String codigo, nombre, apellido, ocupacion, tipo;
    
    //Constructores

    public negocioEmpleado() {
    }
    
       public negocioEmpleado(String codigo, String nombre, String apellido, String ocupacion, String tipo) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.ocupacion = ocupacion;
        this.tipo = tipo;
    }
    
    //Getters and Settes

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

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
       
    //Metodos
    
    
 

    
    
}

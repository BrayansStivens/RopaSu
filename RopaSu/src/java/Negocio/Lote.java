
package Negocio;


public class Lote {
    
    private String prenda, codigo, proceso;

    public Lote(String prenda, String codigo, String proceso) {
        this.prenda = prenda;
        this.codigo = codigo;
        this.proceso = proceso;
    }

    public String getPrenda() {
        return prenda;
    }

    public void setPrenda(String prenda) {
        this.prenda = prenda;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getProceso() {
        return proceso;
    }

    public void setProceso(String proceso) {
        this.proceso = proceso;
    }
    
    
}

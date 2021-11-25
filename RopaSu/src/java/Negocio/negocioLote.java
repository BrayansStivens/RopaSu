
package Negocio;


public class negocioLote {
    
    private String prenda, codigo;
    private int proceso;

    public negocioLote(String prenda, String codigo, int proceso) {
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

    public int getProceso() {
        return proceso;
    }

    public void setProceso(int proceso) {
        this.proceso = proceso;
    }
    
    
}

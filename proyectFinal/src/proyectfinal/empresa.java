
package proyectfinal;

public class empresa {
    private int cedulaEmpresa;
    private String nombreEmpresa;

    public empresa(int cedulaEmpresa, String nombreEmpresa) {
        this.cedulaEmpresa = cedulaEmpresa;
        this.nombreEmpresa = nombreEmpresa;
    }

    public int getCedulaEmpresa() {
        return cedulaEmpresa;
    }

    public void setCedulaEmpresa(int cedulaEmpresa) {
        this.cedulaEmpresa = cedulaEmpresa;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }
 
    
}

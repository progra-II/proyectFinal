package proyectfinal;

public class proveedor {
    private String cedulaProvedor;
    private String nombreProvedor;
    private int telefonoProvedor;
    private String contactoProvedor;
    private String emailProvedor;
    private String paginawebProvedor;
    
    private String ordenCompra;
    static int consecutivo = 1000;
    static final String prefijo = "N°Orden-";

    public proveedor(String cedulaProvedor, String nombreProvedor, int telefonoProvedor, String contactoProvedor, String emailProvedor, String paginawebProvedor) {
        this.cedulaProvedor = cedulaProvedor;
        this.nombreProvedor = nombreProvedor;
        this.telefonoProvedor = telefonoProvedor;
        this.contactoProvedor = contactoProvedor;
        this.emailProvedor = emailProvedor;
        this.paginawebProvedor = paginawebProvedor;
        
        this.ordenCompra = prefijo + consecutivo;
        consecutivo++;
    }
    
    
    

    
    public String infoProvedor(){
    String salida = "Datos proveedor\n";
        
            salida += String.format(""
                    + "%s\t%s\t%s\t%d\t%s\t%s\t%s\n",
                    ordenCompra,
                    cedulaProvedor,
                    nombreProvedor,
                    telefonoProvedor,
                    contactoProvedor,
                    emailProvedor,
                    paginawebProvedor
                    );
        
        return salida;
    }
}

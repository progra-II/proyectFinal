package proyectfinal;

import java.util.ArrayList;

public class mercaderia {    
    
    private empresa empresas;
    private ArrayList<producto> productos = new ArrayList();
    private ArrayList<proveedor> proveedor = new ArrayList();
    
    public void incluirProducto(String codigoProducto, String nombreProducto, double costoProducto, double porcentajeGanancia) {
        productos.add(new producto(codigoProducto, nombreProducto, costoProducto, porcentajeGanancia));
        
    }
    
    public void incluirProovedor(String cedulaProvedor, String nombreProvedor, int telefonoProvedor, String contactoProvedor, String emailProvedor, String paginawebProvedor) {
        proveedor.add(new proveedor(cedulaProvedor, nombreProvedor,telefonoProvedor,contactoProvedor,emailProvedor,paginawebProvedor));
        
    }
    
    
    public producto buscarProducto(String nombre) {
        producto temp = null;
        for(producto p:productos) {
            if (p.getNombreProducto().equalsIgnoreCase(nombre)) {
                temp = p;
                break;
            }
        }
        
        return temp;
    }
    
    public void entradaProducto(String nombre, int cant) {
        if (buscarProducto(nombre) != null) {
            
            buscarProducto(nombre).setCantidadEntrada(buscarProducto(nombre).getCantidadEntrada()+cant); //entradas
            
            buscarProducto(nombre).setTotalProducto(buscarProducto(nombre).getCantidadEntrada()); //existencia
        }
    }
    
    public void salidaProducto(String nombre, int cant) {
        if (buscarProducto(nombre) != null) {
        
            buscarProducto(nombre).setCantidadSalida(buscarProducto(nombre).getCantidadSalida()+cant); //salidas

            buscarProducto(nombre).setTotalProducto(buscarProducto(nombre).getCantidadEntrada()-buscarProducto(nombre).getCantidadSalida()); //existencia
        }
        
        
    }
       
    public String listaProductos() {
        String salida = "Nombre\tCodigo\tEntrada\tSalida\tExistencia\n";
        for (producto p: productos) {
            salida += String.format(""
                    + "%s\t%s\t%d\t%d\t%d\n",
                    p.getNombreProducto(),
                    p.getCodigoProducto(),
                    p.getCantidadEntrada(),
                    p.getCantidadSalida(),
                    p.getTotalProducto()
                    );
        }
        return salida;
    }
    
}

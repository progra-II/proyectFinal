/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectfinal;

import java.util.ArrayList;

/**
 *
 * @author brian
 */
public class inventario {
    
    private ArrayList<producto> productos = new ArrayList();
    
    public void incluirProducto(int codidoProducto, String nombreProducto, int cantidadInicial, 
                                double costoProducto, double porcentajeGanancia) {
        productos.add(new producto(codidoProducto, nombreProducto, cantidadInicial, 
                                   costoProducto, porcentajeGanancia));
    }
    
    public void incluirProducto(String fechaExpiracion, double temperatura, int codidoProducto, String nombreProducto, 
                                int cantidadInicial, double costoProducto, double porcentajeGanancia) {
        productos.add(new perecedero(fechaExpiracion,temperatura,codidoProducto, nombreProducto, 
                                     cantidadInicial, costoProducto, porcentajeGanancia));
    }
    
   
    public String listaProductos() {
        String salida = "";
        for (producto p: productos) {
            salida += String.format(""
                    + "%s \t* %d \t* %.2f \t* %d \n",
                    p.getNombreProducto(),
                    p.getCantidadInicial(),
                    p.getCostoProducto(),
                    p.getCodidoProducto());
        }
        return salida;
    }
    
}

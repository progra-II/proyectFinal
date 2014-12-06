/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectfinal;

/**
 *
 * @author brian
 */
public class ProyectFinal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        mercaderia i = new mercaderia();
        proveedor p = new proveedor("44566", "Dospinos", 22990094, "Bryan", "Dopinis.com", "Dospinos.com");
        
        i.incluirProducto("1234", "Arroz", 2000, 3);
        i.incluirProducto("4321", "Frijo", 2000, 3);
        i.incluirProducto("9999", "Helado", 2000, 3);
        
        i.entradaProducto("Arroz", 100);
        i.entradaProducto("Frijo", 100);
        i.entradaProducto("Helado", 100);
        
        i.salidaProducto("Frijo", 100);
       
        
        
       
        
        
        System.out.println(i.listaProductos());
        System.out.println(p.infoProvedor());
    }
    
}

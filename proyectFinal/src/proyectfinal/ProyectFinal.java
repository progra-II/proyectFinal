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
        
        //ya pude desde netbeans
       
        inventario inventario = new inventario ();
        
        inventario.incluirProducto(1234, "Arroz", 5, 2000, 10);
        inventario.incluirProducto("12/9/15", 15, 12345, "Leche", 100, 500, 2);
        
        System.out.println(inventario.listaProductos());
    }
    
}

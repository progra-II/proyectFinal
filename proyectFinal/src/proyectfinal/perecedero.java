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
public class perecedero extends producto{
    
    private String fechaExpiracion;
    private double temperatura;
    private final double costoAdicionalRefrigeracion = 5000;

    public perecedero(String fechaExpiracion, double temperatura, int codidoProducto, String nombreProducto, int cantidadInicial, double costoProducto, double porcentajeGanancia) {
        super(codidoProducto, nombreProducto, cantidadInicial, costoProducto, porcentajeGanancia);
        this.fechaExpiracion = fechaExpiracion;
        this.temperatura = temperatura;
    }

    public String getFechaExpiracion() {
        return fechaExpiracion;
    }

    public double getTemperatura() {
        return temperatura;
    }
    
    
}

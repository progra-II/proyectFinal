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
public class producto {
    
    protected int codidoProducto;
    protected String nombreProducto;
    protected int cantidadInicial;
    protected double costoProducto;
    protected double porcentajeGanancia;

    public producto(int codidoProducto, String nombreProducto, int cantidadInicial, double costoProducto, double porcentajeGanancia) {
        this.codidoProducto = codidoProducto;
        this.nombreProducto = nombreProducto;
        this.cantidadInicial = cantidadInicial;
        this.costoProducto = costoProducto;
        this.porcentajeGanancia = porcentajeGanancia;
    }

    public int getCodidoProducto() {
        return codidoProducto;
    }

    public void setCodidoProducto(int codidoProducto) {
        this.codidoProducto = codidoProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public int getCantidadInicial() {
        return cantidadInicial;
    }

    public void setCantidadInicial(int cantidadInicial) {
        this.cantidadInicial = cantidadInicial;
    }

    public double getCostoProducto() {
        return costoProducto;
    }

    public void setCostoProducto(double costoProducto) {
        this.costoProducto = costoProducto;
    }

    public double getPorcentajeGanancia() {
        return porcentajeGanancia;
    }

    public void setPorcentajeGanancia(double porcentajeGanancia) {
        this.porcentajeGanancia = porcentajeGanancia;
    }
    
    
    
}

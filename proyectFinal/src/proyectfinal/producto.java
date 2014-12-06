package proyectfinal;

import java.util.ArrayList;

public class producto {
    protected String codigoProducto;
    protected String nombreProducto;
    protected double costoProducto;
    protected double porcentajeGanancia;
    protected proveedor provedores;
    protected cliente clientes;
    protected int cantidadProducto;
    protected int cantidadSalida;
    protected int cantidadEntrada;
    private int totalProducto;
    

    public producto(String codigoProducto, String nombreProducto, double costoProducto, double porcentageGanancia) {
        this.codigoProducto = codigoProducto;
        this.nombreProducto = nombreProducto;
        this.costoProducto = costoProducto;
        this.porcentajeGanancia = porcentageGanancia;
    }

    public String getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(String codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
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

    public proveedor getProvedores() {
        return provedores;
    }

    public void setProvedores(proveedor provedores) {
        this.provedores = provedores;
    }

    public cliente getClientes() {
        return clientes;
    }

    public void setClientes(cliente clientes) {
        this.clientes = clientes;
    }

    public int getCantidadProducto() {
        return cantidadProducto;
    }

    public void setCantidadProducto(int cantidadProducto) {
        this.cantidadProducto = cantidadProducto;
    }

    public int getCantidadSalida() {
        return cantidadSalida;
    }

    public void setCantidadSalida(int cantidadSalida) {
        this.cantidadSalida = cantidadSalida;
    }

    public int getCantidadEntrada() {
        return cantidadEntrada;
    }

    public void setCantidadEntrada(int cantidadEntrada) {
        this.cantidadEntrada = cantidadEntrada;
    }

    public int getTotalProducto() {
        return totalProducto;
    }

    public void setTotalProducto(int totalProductos) {
        this.totalProducto = totalProductos;
    }


}

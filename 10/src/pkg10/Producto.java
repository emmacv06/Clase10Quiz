/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg10;

/**
 *
 * @author emmac
 */
public class Producto {

    public String codigoProducto;
    public String nombreProducto;
    public String nombreEmpleado;
    public String cedulaEmpleado;
    public int cantidad;
    public double precioBase;
    public double precioBruto;
    public double ganancia;
    public TipoProducto tipo;

    public Producto(String codigoProducto, String nombreProducto, String nombreEmpleado,
            String cedulaEmpleado, int cantidad, double precioBase, TipoProducto tipo) {
        this.codigoProducto = codigoProducto;
        this.nombreProducto = nombreProducto;
        this.nombreEmpleado = nombreEmpleado;
        this.cedulaEmpleado = cedulaEmpleado;
        this.cantidad = cantidad;
        this.precioBase = precioBase;
        this.tipo = tipo;

        calcularPrecioBruto();
        calcularGanancia();
    }

    public void calcularPrecioBruto() {
        switch (tipo) {
            case Alimentos:
                precioBruto = precioBase * 0.20 + precioBase;
                break;
            case Bebidas:
                precioBruto = precioBase * 0.30 + precioBase;
                break;
            case Higiene:
                precioBruto = precioBase * 0.25 + precioBase + 500;
                break;
            case Limpieza:
                precioBruto = precioBase * 0.19 + precioBase * 0.04 + 1000 + precioBase;
                break;
        }
    }

    public void calcularGanancia() {
        ganancia = (precioBruto - precioBase) * cantidad;
    }

    public String mostrarProducto() {
        return "Producto: " + nombreProducto + ", Codigo: " + codigoProducto
                + ", Tipo: " + tipo + ", Precio Base: " + precioBase
                + ", Precio Bruto: " + precioBruto
                + ", Cantidad: " + cantidad
                + ", Ganancia esperada: " + ganancia
                + ", Empleado: " + nombreEmpleado + ", Cedula: " + cedulaEmpleado;
    }

    public double DameGanancia() {
        return ganancia;
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg10;

import javax.swing.JOptionPane;

/**
 *
 * @author emmac
 */
public class Super {

    public String nombre;
    public String codigo;
    public Producto[] productos;
    public int contador;

    public Super(String nombre, String codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
        productos = new Producto[100];
        contador = 0;
    }

    public void agregarProducto(Producto p) {
        if (contador < productos.length) {
            productos[contador] = p;
            contador++;
        }
    }

    public void mostrarProductos() {
        System.out.println("Super: " + nombre + " - Codigo: " + codigo);
        for (int i = 0; i < contador; i++) {
            System.out.println(productos[i].mostrarProducto());
        }
    }

    public void mostrarGananciaTotal() {

        double total = 0;
        for (int i = 0; i < contador; i++) {
            total += productos[i].DameGanancia();
        }
        JOptionPane.showMessageDialog(null, "Ganancia total esperada: ₡" + total);
    }

    public void MostrarMensaje() {
        StringBuilder mensaje = new StringBuilder();

        mensaje.append("Super: ").append(nombre).append(" - Código: ").append(codigo).append("\n\n");
        for (int i = 0; i < contador; i++) {
            mensaje.append(productos[i].mostrarProducto()).append("\n\n");
        }
        JOptionPane.showMessageDialog(null, mensaje.toString());

    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg10;

/**
 *
 * @author emmac
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Super super1 = new Super("Super Chino", "SC01");

        Producto p1 = new Producto("P001", "Galletas", "Juan Perez", "12345678", 10, 800, TipoProducto.Alimentos);
        Producto p2 = new Producto("P002", "Jugo", "Ana Gomez", "23456789", 5, 1200, TipoProducto.Bebidas);
        Producto p3 = new Producto("P003", "Jabon", "Carlos Rojas", "34567890", 15, 1000, TipoProducto.Higiene);
        Producto p4 = new Producto("P004", "Cloro", "Maria Ruiz", "45678901", 8, 900, TipoProducto.Limpieza);

        super1.agregarProducto(p1);
        super1.agregarProducto(p2);
        super1.agregarProducto(p3);
        super1.agregarProducto(p4);

        super1.mostrarProductos();
        super1.MostrarMensaje();
        super1.mostrarGananciaTotal();

    }
}

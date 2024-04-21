package com.lumava.tienda.modulos;

public class Producto {
    private String name;
    private int precio;
    private String proveedor;
    private int inventario = 0;

    public static int cantidad;

    public Producto(String name, int precio, String proveedor, int inventario){
        this.name = name;
        this.precio = precio;
        this.proveedor = proveedor;
        this.inventario = inventario;
        Producto.cantidad++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    public int getInventario() {
        return inventario;
    }

    public void setInventario(int inventario) {
        this.inventario = inventario;
    }

    @Override
    public String toString() {
        return "Este Productos se llama: " + this.getName() + "\nCon el precio de: $" + this.getPrecio() +
                "\nCon el proveedor: " + this.getProveedor() + "\nCon la cantidad en inventario de: " +
                this.getInventario() + "\nNumero de productos existentes: "+Producto.cantidad;
    }
}

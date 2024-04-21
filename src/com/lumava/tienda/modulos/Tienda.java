package com.lumava.tienda.modulos;

public class Tienda {
    private String nombre;
    private String direccion;
    private int empleados;
    private int ganancias;
    public static int tiendasActivas = 0;

    public Tienda(String nombre,String direccion, int empleados, int ganancias){
        this.nombre = nombre;
        this.direccion = direccion;
        this.empleados = empleados;
        this.ganancias = ganancias;
        Tienda.tiendasActivas++;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getEmpleados() {
        return empleados;
    }

    public void setEmpleados(int empleados) {
        this.empleados = empleados;
    }

    public int getGanancias() {
        return ganancias;
    }

    public void setGanancias(int ganancias) {
        this.ganancias = ganancias;
    }

    @Override
    public String toString(){
        return "Este Tienda se llama: " + this.getNombre() + "\nCon la direccion de: " + this.getDireccion() +
                "\nCon el numero de empleados: " + this.getEmpleados() + "\nCon ganancias totales de : $" +
                this.getGanancias() + "\nNumero de tiendas existentes: "+Tienda.tiendasActivas;
    }
}

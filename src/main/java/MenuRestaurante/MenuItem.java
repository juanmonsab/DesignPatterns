package MenuRestaurante;

class MenuItem {
    private String nombre;
    private String descripcion;
    private double precio;

    public MenuItem(String nombre, String descripcion, double precio) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Descripción: " + descripcion + ", Precio: $" + precio;
    }
}

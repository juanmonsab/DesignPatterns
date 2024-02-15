package GestionRestaurantes;

abstract class ProcesadorOrden {
    public void procesarOrden() {
        tomarOrden();
        verificarDispinibilidad();
        calcularPrecio();
        preparar();
        entregar();
    }

    abstract void tomarOrden();

    abstract void verificarDispinibilidad();

    abstract void calcularPrecio();

    abstract void preparar();

    abstract void entregar();
}
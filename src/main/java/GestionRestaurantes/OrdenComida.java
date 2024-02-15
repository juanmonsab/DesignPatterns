package GestionRestaurantes;

class OrdenComida extends ProcesadorOrden {
    @Override
    void tomarOrden() {
        System.out.println("Tomando pedido de comida.");
    }

    @Override
    void verificarDispinibilidad() {
        System.out.println("Verificando disponibilidad de ingredientes para comida.");
    }

    @Override
    void calcularPrecio() {
        System.out.println("Calculando precio de comida.");
    }

    @Override
    void preparar() {
        System.out.println("Preparando comida.");
    }

    @Override
    void entregar() {
        System.out.println("Entregando comida.");
    }
}
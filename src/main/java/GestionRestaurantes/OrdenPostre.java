package GestionRestaurantes;

class OrdenPostre extends ProcesadorOrden {
    @Override
    void tomarOrden() {
        System.out.println("Tomando pedido de postre.");
    }

    @Override
    void verificarDispinibilidad() {
        System.out.println("Verificando disponibilidad de postres.");
    }

    @Override
    void calcularPrecio() {
        System.out.println("Calculando precio de postre.");
    }

    @Override
    void preparar() {
        System.out.println("Preparando postre.");
    }

    @Override
    void entregar() {
        System.out.println("Entregando postre.");
    }
}

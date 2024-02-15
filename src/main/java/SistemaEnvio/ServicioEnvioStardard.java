package SistemaEnvio;

class ServicioEnvioStardard extends ServicioEnvio {
    public ServicioEnvioStardard(Envio envio) {
        super(envio);
    }

    @Override
    void enviarPaquete() {
        System.out.println("Envío estándar:");
        envio.entregarPaquete();
    }
}

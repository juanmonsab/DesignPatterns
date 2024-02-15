package SistemaEnvio;

class EnvioMaritimo implements Envio {
    @Override
    public void entregarPaquete() {
        System.out.println("El paquete se está entregando por envío marítimo.");
    }
}

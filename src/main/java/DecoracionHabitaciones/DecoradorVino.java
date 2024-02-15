package DecoracionHabitaciones;

class DecoradorVino extends DecoradorHabitacion {
    public DecoradorVino(DecoracionHabitacion habitacionDecorada) {
        super(habitacionDecorada);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", con vino de alta calidad";
    }

    @Override
    public double costo() {
        return super.costo() + 150000;
    }
}

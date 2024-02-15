package DecoracionHabitaciones;

abstract class DecoradorHabitacion implements DecoracionHabitacion {
    protected DecoracionHabitacion habitacionDecorada;

    public DecoradorHabitacion(DecoracionHabitacion habitacionDecorada) {
        this.habitacionDecorada = habitacionDecorada;
    }

    @Override
    public String getDescription() {
        return habitacionDecorada.getDescription();
    }

    @Override
    public double costo() {
        return habitacionDecorada.costo();
    }
}
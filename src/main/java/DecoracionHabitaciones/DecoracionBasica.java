package DecoracionHabitaciones;

class DecoracionBasica implements DecoracionHabitacion {
    @Override
    public String getDescription() {
        return "Decoración básica";
    }

    @Override
    public double costo() {
        return 385000;
    }
}

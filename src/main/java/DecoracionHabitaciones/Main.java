package DecoracionHabitaciones;

public class Main {
    public static void main(String[] args) {
        DecoracionHabitacion decoracionBasica = new DecoracionBasica();
        System.out.println("Descripción de la decoración básica: " + decoracionBasica.getDescription());
        System.out.println("Costo de la decoración básica: $" + decoracionBasica.costo());

        DecoracionHabitacion decoracionFlores = new DecoracionFlores(decoracionBasica);
        System.out.println("\nDescripción de la decoración con flores frescas: " + decoracionFlores.getDescription());
        System.out.println("Costo de la decoración con flores frescas: $" + decoracionFlores.costo());

        DecoracionHabitacion decoracionChocolate = new DecoracionChocolate(decoracionBasica);
        System.out.println("\nDescripción de la decoración con chocolate gourmet: " + decoracionChocolate.getDescription());
        System.out.println("Costo de la decoración con chocolate gourmet: $" + decoracionChocolate.costo());

        DecoracionHabitacion decoracionVino = new DecoradorVino(decoracionBasica);
        System.out.println("\nDescripción de la decoración con vino de alta calidad: " + decoracionVino.getDescription());
        System.out.println("Costo de la decoración con vino de alta calidad: $" + decoracionVino.costo());
    }
}

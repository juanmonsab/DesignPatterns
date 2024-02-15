package MenuRestaurante;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        MenuDirector director = new MenuDirector();
        MenuConstructor constructor = new ConstructorMenuRestaurante();

        director.constructor(constructor);

        List<MenuItem> menu = constructor.getMenu();
        System.out.println("Menú del restaurante:");
        for (MenuItem item : menu) {
            System.out.println(item);
        }
    }
}

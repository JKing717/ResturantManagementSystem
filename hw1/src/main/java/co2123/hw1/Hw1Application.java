package co2123.hw1;

import co2123.hw1.domain.Dish;
import co2123.hw1.domain.Menu;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication // Marks this class as the Spring Boot application entry point
public class Hw1Application implements CommandLineRunner
{

    //An empty list for the menus
    public static List<Menu> menus = new ArrayList<>();

    // Main method - runs the Spring Boot application
    public static void main(String[] args) {SpringApplication.run(Hw1Application.class, args);}

    // This method is executed after the application starts, used to initialize the data
    @Override
    public void run(String... args)
    {
        // Create the first dish (Spaghetti Bolognese)
        Dish dish1 = new Dish();
        dish1.setName("Spag Bol"); // Set the name of the dish
        dish1.setDescription("Pasta dish with tomato sauce"); // Set the description of the dish
        dish1.setDietary("Vegan"); // Set the dietary preference (Vegan)
        dish1.setRating(2);  // Set the rating for the dish

        // Create the second dish (Plain beef mince)
        Dish dish2 = new Dish();
        dish2.setName("Chicken curry"); // Set the name of the dish
        dish2.setDescription("chicken with a spicy sauce with basmati rice"); // Set the description of the dish
        dish2.setDietary("Non-vegetarian"); // Set the dietary preference (Non-vegetarian)
        dish2.setRating(10); // Set the rating for the dish

        // Create a menu
        Menu menu = new Menu();
        menu.setId(0); // Set the ID of the menu
        menu.setType("Dinner"); // Set the type of the menu (Dinner)
        menu.setChef("Marco"); // Set the name of the chef

        // Create a list to hold the dishes for this menu
        List<Dish> dishes = new ArrayList<>();
        dishes.add(dish1); // Add the first dish to the menu
        dishes.add(dish2); // Add the second dish to the menu
        menu.setDishes(dishes); // Set the list of dishes for this menu

        menus.add(menu); // Add the created menu to the static list of menus
    }

}

package co2123.hw1.domain;

import java.util.ArrayList;
import java.util.List;

public class Menu
{
    //Properties of the menu
    private int id; // ID of the menu
    private String type; // Type of the menu (e.g., Breakfast, Lunch)
    private String chef; // Name of the menus head chef
    private List<Dish> dishes; // List of dishes in the menu

    public Menu() {
        this.dishes = new ArrayList<>(); //Initialises the dishes list upon new menu creation
    }

    // Get methods (accessors)
    public String getType(){ return type; } // Returns the type of the menu

    public String getChef(){ return chef; } // Returns the name of the chef

    public int getId(){ return id; } // Returns the ID of the menu

    public List<Dish> getDishes() {return dishes;} // Returns the list of dishes in the menu

    //Set methods (mutators)
    public void setId(int id) { this.id = id; } // Sets the ID of the menu

    public void setDishes(List<Dish> dishes) {this.dishes = dishes;} // Sets the list of dishes for the menu

    public void setType(String type) { this.type = type; } // Sets the type of the menu

    public void setChef(String chef) { this.chef = chef; } // Sets the chef's name

}

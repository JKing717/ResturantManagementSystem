package co2123.hw1.controller;


import co2123.hw1.Hw1Application;
import co2123.hw1.domain.Dish;
import co2123.hw1.domain.Menu;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class DishController {
    private final Hw1Application hw1Application;

    // constructor to initialize the controller with the main application class
    public DishController(Hw1Application hw1Application) {
        this.hw1Application = hw1Application;
    }

    @InitBinder
    public void initBinder(WebDataBinder binder){
        // adds the DishValidator to the data binder for validation
        binder.addValidators(new DishValidator());
    }

    @GetMapping("/dishes")
    public String showDishes(@RequestParam("menu") int menuID, Model model) {
        // fetches dishes for a specific menu and adds them to the model
        model.addAttribute("menuID", menuID); // add the menu ID to the model
        for(Menu currentMenu: Hw1Application.menus) {
            if(currentMenu.getId() == menuID) {// match the menu ID
                model.addAttribute("dishes", currentMenu.getDishes()); // add dishes to the model
            }
        }// Adds the list of dishes to the model
        return "dishes/list"; // Returns the view to display the list of dishes
    }

    @GetMapping("/newDish")
    public String showNewDishForm(@RequestParam(name="menu") int menu, Model model){
        // shows a form to create a new dish for a specific menu
        // add an empty Dish object to the model
        model.addAttribute("menu", menu); // add the menu ID to the model
        return "dishes/form";  // view to display the form
    }

    @PostMapping("/addDish") // Handles POST requests to "/addMenu" and adds a new menu to the list
    public String addMenu(@Valid @ModelAttribute Dish dish, BindingResult result, @RequestParam(name="menu") int menu, Model model) {
        if(result.hasErrors()) {
            model.addAttribute("menu", menu);  // keep the menu ID in the model
            return "dishes/form"; // reload the form if there are errors
        }

        // find the menu by ID and add the new dish to it
        for (Menu currentMenu : Hw1Application.menus) {
            if (currentMenu.getId() == menu) {
                currentMenu.getDishes().add(dish); // add the dish to the men
            }
        }
        return "redirect:/menus";  // redirect to the menus page after successful addition
    }
}
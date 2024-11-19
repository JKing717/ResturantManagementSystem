package co2123.hw1.controller;

import co2123.hw1.Hw1Application;
import co2123.hw1.domain.Menu;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MenuController {

    //creates a method to tell menu class that it has a validator
    @InitBinder
    public void initBinder(WebDataBinder binder){
        binder.addValidators(new MenuValidator());
    }


    @GetMapping("/menus") // Handles GET requests to "/menus" and displays a list of menus
    public String showMenus(Model model) {
        model.addAttribute("menus", Hw1Application.menus); // Adds the list of menus to the model
        return "menus/list"; // Returns the view to display the list of menus
    }


    @GetMapping("/newMenu") // Handles GET requests to "/newMenu" and shows the form to create a new menu
    public String showNewMenuForm(Model model) {
        model.addAttribute("menu", new Menu()); // Adds an empty Menu object to the model for binding (with user inputs in the form)
        return "menus/form"; // Returns the form view to create a new menu
    }

    @PostMapping("/addMenu") // Handles POST requests to "/addMenu" and adds a new menu to the list
    public String addMenu(@Valid @ModelAttribute Menu menu, BindingResult result) {
        if (result.hasErrors()){
            return "menus/form";
        }
        Hw1Application.menus.add(menu); // Adds the submitted Menu object to the list of menus
        return "redirect:/menus"; // Redirects to the list of menus after adding the new menu
    }
}

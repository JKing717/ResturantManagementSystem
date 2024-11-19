package co2123.hw1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController
{
    @GetMapping("/") // Handles GET requests to the root URL ("/")
    public String showStartPage()
    {
        return "start";
    } // Returns the "start" view

    @PostMapping("/") // Handles POST requests to the root URL ("/")
    public String handlePostRQ()
    {
        return    "start";// Returns the "start" view after form submission (If another POST action isn't performed)
    }

}

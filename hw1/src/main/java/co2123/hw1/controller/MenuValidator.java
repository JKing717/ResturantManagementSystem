package co2123.hw1.controller;

import co2123.hw1.Hw1Application;
import co2123.hw1.domain.Menu;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

//this creates a Validator for our Menu class
public class MenuValidator implements Validator {
    @Override
    public boolean supports(Class<?> clazz) {
        // checks if the given class is the Menu class
        return Menu.class.equals(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        // validates the Menu object
        Menu targetMenuID = (Menu) target; // cast the target object to a Menu
        // check if the ID already exists in the list of menus
        for(Menu menu : Hw1Application.menus){
            if(targetMenuID.getId() == menu.getId()){
                // if duplicate ID found, add an error
                errors.rejectValue("id", "", "No. ID already used. Try again.");
            }
        }
        // make sure the 'type' field isn't empty or just whitespace
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "type", "", "No. Select a menu type first.");

        // make sure the 'chef' field isn't empty or just whitespace
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "chef", "", "Why haven't you provided chef name. Try again.");


    }
}


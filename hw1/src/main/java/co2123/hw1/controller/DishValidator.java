package co2123.hw1.controller;

import co2123.hw1.domain.Dish;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

// this class validates the Dish object fields
public class DishValidator implements Validator {
    @Override
    public boolean supports(Class<?> clazz) {
        // checks if the given class is the Dish class
        return Dish.class.equals(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        // validates the Dish object
        Dish dish = (Dish) target;

        // Validate dietary
        if (!("Pescatarian".equals(dish.getDietary()) ||
                "Gluten Free".equals(dish.getDietary()) ||
                "Allergen Free".equals(dish.getDietary()))) {
            errors.rejectValue("dietary", "", "Dietary requirements must be Pescatarian, Gluten Free or Allergen Free");
        }

        // Validate rating
        if (dish.getRating() == null) {
            errors.rejectValue("rating", "", "Rating cannot be empty");
        } else if (dish.getRating() < 0 || dish.getRating() > 10) {
            errors.rejectValue("rating", "", "Rating must be between 0 and 10");
        }

        // Validate name and description
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "name", "", "Name field cannot be empty");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "description", "", "Description field cannot be empty");
    }
}


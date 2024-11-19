package co2123.hw1.domain;

public class Dish
{
    //Properties of the dishes
    private String name; // Name of the dish
    private String description; // Description of the dish
    private String dietary; // Dietary information (e.g., vegetarian, gluten-free)
    private Integer rating; // Rating of the dish (e.g., out of 10)

    // Get methods (accessors)
    public String getName() {return name;} // Returns the name of the dish

    public String getDescription() {return description;} // Returns the description of the dish

    public String getDietary() {return dietary;} // Returns the dietary information

    public Integer getRating() {return rating;} // Returns the rating of the dish

    //Set methods (mutators)
    public void setName(String name) {this.name = name;} // Sets the name of the dish

    public void setDescription(String description) {this.description = description;} // Sets the description of the dish

    public void setDietary(String dietary) {this.dietary = dietary;} // Sets the dietary information

    public void setRating(Integer rating) {this.rating = rating;} // Sets the rating of the dish
}

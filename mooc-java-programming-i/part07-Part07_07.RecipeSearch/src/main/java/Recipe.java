
import java.util.ArrayList;


public class Recipe {
    private String title;
    private int cookingTime;
    private ArrayList<String> ingredients;
    
    public Recipe(String title, int cookingTime, ArrayList ingredients) {
        this.title = title;
        this.cookingTime = cookingTime;
        this.ingredients = ingredients;
    }
    
    public String getTitle() {
        return this.title;
    }
    
    @Override
    public String toString(){
        return this.title + ", cooking time: " + this.cookingTime;
    }
    
}

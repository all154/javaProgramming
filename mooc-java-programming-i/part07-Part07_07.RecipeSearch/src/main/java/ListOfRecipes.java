
import java.util.ArrayList;


public class ListOfRecipes {
    private ArrayList<Recipe> listOfRecipes;
    
    public ListOfRecipes(){
        this.listOfRecipes = new ArrayList();
    }
    
    public void add(Recipe recipe){
        this.listOfRecipes.add(recipe);
    }
    
    public void list() {
        for (Recipe recipe:this.listOfRecipes){
            System.out.println(recipe);
        }
    }
    
    public void findName(String name) {
        System.out.println("Recipes:");
        for (Recipe recipe:this.listOfRecipes){
            if (recipe.getTitle().contains(name)){
                System.out.println(recipe);
            }
        }
    }
    
    public void findCookingTime(int maxCookingTime) {
        System.out.println("Recipes: ");
        for (Recipe recipe:this.listOfRecipes){
            if (recipe.getCookingTime() <= maxCookingTime){
                System.out.println(recipe);
            }
        }
    }
    
    public void findIngredient(String ingredient) {
        System.out.println("Recipes: ");
        for (Recipe recipe:this.listOfRecipes){
            for (String ingredientInRecipe: recipe.getIngredients()){
                if (ingredientInRecipe.equals(ingredient)){
                    System.out.println(recipe);
                }
            }
        }
    }
}

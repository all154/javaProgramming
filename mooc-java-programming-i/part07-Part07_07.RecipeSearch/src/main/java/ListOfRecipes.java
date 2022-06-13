
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
}

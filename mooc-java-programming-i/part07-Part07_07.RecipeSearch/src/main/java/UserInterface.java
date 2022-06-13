
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {

    private Scanner scanner;

    public UserInterface(Scanner scanner) {
        this.scanner = scanner;
    }

    public void start() {
        ListOfRecipes listOfRecipes = new ListOfRecipes();

        this.readFile(listOfRecipes);

        System.out.println("Commands:\n"
                + "list - lists the recipes\n"
                + "stop - stops the program\n"
                + "find name - searches recipes by name\n"
                + "find cooking time - searches recipes by cooking time");

        while (true) {
            System.out.print("Enter command: ");
            String command = scanner.nextLine();

            if (command.equals("list")) {
                listOfRecipes.list();
            }
            
            if (command.equals("find name")) {
                System.out.print("Searched word: ");
                String word = scanner.nextLine();
                listOfRecipes.findName(word);
            }

            if (command.equals("stop")) {
                break;
            }
        }

    }

    public void readFile(ListOfRecipes listOfRecipes) {
        System.out.print("File to read: ");
        String file = scanner.nextLine();

        ArrayList<String> list = new ArrayList<>();
        ArrayList<String> ingredients = new ArrayList<>();

        try (Scanner scan = new Scanner(Paths.get(file))) {
            while (scan.hasNextLine()) {
                String row = scan.nextLine();

                if (row.isEmpty()) {
                    String title = list.get(0);
                    int cookingTime = Integer.valueOf(list.get(1));

                    for (int i = 2; i < list.size(); i++) {
                        ingredients.add(list.get(i));
                    }

                    Recipe newRecipe = new Recipe(title, cookingTime, ingredients);
                    listOfRecipes.add(newRecipe);

                    list.clear();
                    ingredients.clear();
                } else {
                    list.add(row);
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        String title = list.get(0);
        int cookingTime = Integer.valueOf(list.get(1));

        for (int i = 2; i < list.size(); i++) {
            ingredients.add(list.get(i));
        }

        Recipe newRecipe = new Recipe(title, cookingTime, ingredients);
        listOfRecipes.add(newRecipe);
    }
}

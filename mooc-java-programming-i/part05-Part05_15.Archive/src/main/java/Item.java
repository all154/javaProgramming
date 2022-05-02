
public class Item {
    private String id;
    private String name;

    public Item(String id, String name) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }
    
    @Override
    public boolean equals(Object compared) {
        if (this == compared) {
            return true;
        }
        
        if (!(compared instanceof Item)) {
            return false;
        }
        
        Item comparedItem = (Item) compared;
        
        if (id.equals(comparedItem.id)) {
            return true;
        }
        
        return false;
    }
    
    @Override
    public String toString() {
        return id + ": " + name;
    }
}


import java.util.ArrayList;


public class Room {
    
    private ArrayList<Person> people;
    
    public Room() {
        this.people = new ArrayList<>();
    }
    
    public void add(Person person) {
        this.people.add(person);
    }
    
    public boolean isEmpty() {
        return this.people.isEmpty();
    }
    
    public ArrayList<Person> getPersons() {
        return this.people;
    }
    
    public Person shortest() {
        if (this.people.isEmpty()) {
            return null;
        }
        
        Person returnPerson = new Person("", 10000);
        
        for (Person person: this.people) {
            if (person.getHeight()< returnPerson.getHeight()) {
                returnPerson = person;
            }
        }
        
        return returnPerson;
    }
    
    public Person take() {
        if (this.people.isEmpty()) {
            return null;
        }
        
        Person shortestPerson = this.shortest();
        this.people.remove(this.shortest());
        
        return shortestPerson;
    }
    
}

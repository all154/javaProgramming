
public class HealthStation {


    public int weigh(Person person) {
        // return the weight of the person passed as the parameter
        return person.getWeight();
    }
    
    public void feed(Person person) {
        person.setWeight(person.getWeight()+1);
    }

}

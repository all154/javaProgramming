
public class Container {

    private int contains;

    public Container() {
        this.contains = 0;
    }

    public int contains() {
        return this.contains;
    }

    public void add(int amount) {
        if (amount > 0) {
            if (this.contains + amount < 100) {
                this.contains += amount;
            } else {
                this.contains = 100;
            }
        }
    }

}

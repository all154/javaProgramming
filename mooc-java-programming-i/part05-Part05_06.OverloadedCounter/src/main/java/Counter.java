
public class Counter {
    private int value;
    
    public Counter(int startValue) {
        this.value = startValue;
    }
    
    public Counter() {
        this(0);
    }
    
    public int value() {
        return this.value;
    }
    
    public void increase() {
        this.value = this.value + 1;
    }
    
    public void decrease() {
        this.value = this.value - 1;
    }
}

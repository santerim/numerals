
package numvalid;

public enum Numeral {
    I(1), V(5), X(10), L(50), C(100),D(500), M(1000);
    
    public int value;
    
    private Numeral(int value) {
        this.value = value;
    }
}

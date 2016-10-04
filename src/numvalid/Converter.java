package numvalid;

public class Converter {
    
    private final int value;

    public Converter(String string) {
        this.value = calculateDecimalValue(string, string.length(), 0, 0);
    }

    private int calculateDecimalValue(String string, int length, int pos, int val) {
        if (pos == length) {
            return val;
        }
        
        return val;
    }
    
    private int getNumeralValue(String string) {
        return Numeral.valueOf(string).value;
    }
    
    public int getValue() {
        return this.value;
    }
}

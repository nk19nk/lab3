public class DoubNum implements Num {
    private final double value;

    DoubNum(double value) {
        this.value = value;
    }
    public String toString() {
        return String.valueOf(value);
    }
    @Override
    public double doubleValue() {
        return (double) value;
    }
}

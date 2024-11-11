public class DoubNum implements Num {
    private final double value;

    public DoubNum(double value) {
        this.value = value;
    }

    @Override
    public double doubleValue() {
        return value;
    }
}

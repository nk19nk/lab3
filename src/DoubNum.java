public class DoubNum implements Num {
    private final double value;

    DoubNum(double value) {
        this.value = value;
    }

    @Override
    public double doubleValue() {
        return value;
    }
}

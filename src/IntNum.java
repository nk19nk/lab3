public class IntNum implements Num {
    private final int value;

    public IntNum(int value) {
        this.value = value;
    }

    @Override
    public double doubleValue() {
        return value;
    }
}

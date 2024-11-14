public class FracNum implements Num {
    private final int numerator;
    private final int denominator;

    FracNum (int numerator, int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("Знаменатель не может быть равен нулю");
        }
        this.numerator = numerator;
        this.denominator = denominator;
    }

    @Override
    public double doubleValue() {
        return (double) numerator / denominator;
    }
}

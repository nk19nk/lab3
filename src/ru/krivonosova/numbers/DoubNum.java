package ru.krivonosova.numbers;
import ru.krivonosova.main.Num;

public class DoubNum implements Num {
    private final double value;

    public DoubNum(double value) {
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

package ru.krivonosova.numbers;
import ru.krivonosova.main.Num;

public class IntNum implements Num {
    private final int value;

    public IntNum(int value) {
        this.value = value;
    }
    public String toString() {
        return String.valueOf(value);
    }
    @Override
    public double doubleValue() {
        return value;
    }
}

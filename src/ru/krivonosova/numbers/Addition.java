package ru.krivonosova.numbers;
import ru.krivonosova.main.Num;

import java.util.List;

public class Addition {
    private List<Num> numbers;

    List<Num> getNumbers() {
        return this.numbers;
    }

    List<Num> setNumbers(List<Num> numbers) {
        this.numbers = numbers;
        return this.numbers;
    }

    public Addition(List<Num> numbers) {
        this.numbers = numbers;
    }

    public double summa() {
        double sum = 0;
        for (Num number : numbers) {
            sum += number.doubleValue();
        }
        return sum;
    }
}

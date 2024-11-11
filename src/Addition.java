import java.util.List;

public class Addition {
    private List<Num> numbers;

    public List<Num> getNumbers() {
        return numbers;
    }

    public void setNumbers(List<Num> numbers) {
        this.numbers = numbers;
    }

    Addition(List<Num> numbers) {
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

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Сколько дробей вы хотите создать?");
        int col = in.nextInt();
        List<Fraction> fractions = new ArrayList<>();
        for (int i = 0; i < col; i++) {
            System.out.println("Введите " + (i + 1) + " дробь");
            System.out.print("числитель: ");
            int ch = in.nextInt();
            System.out.print("знаменатель: ");
            int zn = in.nextInt();
            try {
                Fraction f = new Fraction(ch, zn);
                fractions.add(f);
                System.out.println("Введенная дробь: " + f);
            } catch (IllegalArgumentException e) {
                System.out.println("Ошибка: " + e.getMessage());
                i--; // Уменьшаем счетчик, чтобы повторить ввод для этой дроби
            }
        }
        // Пример использования дробей для операций
        while (true) {
            System.out.println("Выберите операцию:");
            System.out.println("Сложение - 1");
            System.out.println("Вычитание - 2");
            System.out.println("Умножение - 3");
            System.out.println("Деление - 4");
            System.out.println("Выход - 5");
            System.out.print("Введите номер операции: ");
            int oper = in.nextInt();

            if (oper == 5) {
                //System.out.println("Выход из программы.");
                break;
            }

            System.out.println("Список введенных дробей:");
            for (int i = 0; i < fractions.size(); i++) {
                System.out.println((i + 1) + ". " + fractions.get(i));
            }

            System.out.print("Выберите первую дробь из " + fractions.size() + " дробей(напишите ее номер(1-"+ fractions.size() +"):");
            int nomer1 = in.nextInt() - 1;
            if (nomer1 < 0 || nomer1 >= fractions.size()) {
                System.out.println("Некорректный выбор дроби. Попробуйте снова.");
                continue;
            }
            Fraction f1 = fractions.get(nomer1);

            System.out.println("Список введенных дробей:");
            for (int i = 0; i < fractions.size(); i++) {
                System.out.println((i + 1) + ". " + fractions.get(i));
            }

            Fraction f2 = null;
            if (oper >= 1 && oper <= 4) {
                System.out.print("Выберите вторую дробь из " + fractions.size() + " дробей(напишите ее номер(1-"+ fractions.size() +"):");
                int nomer2 = in.nextInt() - 1;
                if (nomer2 < 0 || nomer2 >= fractions.size()) {
                    System.out.println("Некорректный выбор дроби. Попробуйте снова.");
                    continue;
                }
                f2 = fractions.get(nomer2);
            }

            switch (oper) {
                case 1: // Сложение
                    System.out.println("Результат сложения: " + f1.sum(f2));
                    break;
                case 2: // Вычитание
                    System.out.println("Результат вычитания: " + f1.minus(f2));
                    break;
                case 3: // Умножение
                    System.out.println("Результат умножения: " + f1.multiply(f2));
                    break;
                case 4: // Деление
                    try {
                        System.out.println("Результат деления: " + f1.div(f2));
                    } catch (ArithmeticException e) {
                        System.out.println("Ошибка: " + e.getMessage());
                    }
                    break;
                default:
                    System.out.println("Некорректный выбор операции. Попробуйте снова.");
                    break;
            }
        }

        in.close();
    }
}
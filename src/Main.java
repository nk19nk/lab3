import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Задание 1.4");
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
            System.out.println("Выход - 0");
            System.out.print("Введите номер операции: ");
            int oper = in.nextInt();

            if (oper == 0) {
                //System.out.println("Выход из программы.");
                break;
            }
            Fraction f1 = null;
            Fraction f2 = null;

            if (oper >= 1 && oper <= 4) {

                System.out.println("Список введенных дробей:");
                for (int i = 0; i < fractions.size(); i++) {
                    System.out.println((i + 1) + ") " + fractions.get(i));
                }

                System.out.print("Выберите первую дробь из " + fractions.size() + " дробей(напишите ее номер(1-" + fractions.size() + "):");
                int nomer1 = in.nextInt() - 1;
                if (nomer1 < 0 || nomer1 >= fractions.size()) {
                    System.out.println("Дроби с таким номером нет, введите снова");
                    continue;
                }
                f1 = fractions.get(nomer1);

                System.out.println("Список введенных дробей:");
                for (int i = 0; i < fractions.size(); i++) {
                    System.out.println((i + 1) + ". " + fractions.get(i));
                }

                System.out.print("Выберите вторую дробь из " + fractions.size() + " дробей(напишите ее номер(1-" + fractions.size() + "):");
                int nomer2 = in.nextInt() - 1;
                if (nomer2 < 0 || nomer2 >= fractions.size()) {
                    System.out.println("Дроби с таким номером нет, введите снова");
                    continue;
                }
                f2 = fractions.get(nomer2);
            }
            switch (oper) {
                case 1: // Сложение
                    System.out.println(f1 + " + " + f2 + " = " + f1.sum(f2));
                    break;
                case 2: // Вычитание
                    System.out.println(f1 + " - " + f2 + " = " + f1.minus(f2));
                    break;
                case 3: // Умножение
                    System.out.println(f1 + " * " + f2 + " = " + f1.multiply(f2));
                    break;
                case 4: // Деление
                    try {
                        System.out.println(f1 + " / " + f2 + " = " + f1.div(f2));
                    } catch (ArithmeticException e) {
                        System.out.println("Ошибка: " + e.getMessage());
                    }
                    break;
                default:
                    System.out.println("Операции с таким номером нет, введите снова");
                    break;
            }
        }


        System.out.println("Задание 3.1");
        System.out.println("Сколько дробей вы хотите создать?");
        int colv = in.nextInt();
        List<Fraction3> fractions3 = new ArrayList<>();
        for (int i = 0; i < colv; i++) {
            System.out.println("Введите " + (i + 1) + " дробь");
            System.out.print("числитель: ");
            int ch3 = in.nextInt();
            System.out.print("знаменатель: ");
            int zn3 = in.nextInt();
            try {
                Fraction3 f3 = new Fraction3(ch3, zn3);
                fractions3.add(f3);
                System.out.println("Введенная дробь: " + f3);
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
            System.out.println("Выход - 0");
            System.out.print("Введите номер операции: ");
            int oper3 = in.nextInt();

            if (oper3 == 0) {
                //System.out.println("Выход из программы.");
                break;
            }
            Fraction3 frac1 = null;
            Fraction3 frac2 = null;

            if (oper3 >= 1 && oper3 <= 4) {

                System.out.println("Список введенных дробей:");
                for (int i = 0; i < fractions3.size(); i++) {
                    System.out.println((i + 1) + ") " + fractions3.get(i));
                }

                System.out.print("Выберите первую дробь из " + fractions3.size() + " дробей(напишите ее номер(1-" + fractions3.size() + "):");
                int nom1 = in.nextInt() - 1;
                if (nom1 < 0 || nom1 >= fractions3.size()) {
                    System.out.println("Дроби с таким номером нет, введите снова");
                    continue;
                }
                frac1 = fractions3.get(nom1);

                System.out.println("Список введенных дробей:");
                for (int i = 0; i < fractions3.size(); i++) {
                    System.out.println((i + 1) + ". " + fractions3.get(i));
                }

                System.out.print("Выберите вторую дробь из " + fractions3.size() + " дробей(напишите ее номер(1-" + fractions3.size() + "):");
                int nom2 = in.nextInt() - 1;
                if (nom2 < 0 || nom2 >= fractions3.size()) {
                    System.out.println("Дроби с таким номером нет, введите снова");
                    continue;
                }
                frac2 = fractions3.get(nom2);
            }
            switch (oper3) {
                case 1: // Сложение
                    System.out.println(frac1 + " + " + frac2 + " = " + frac1.sum(frac2));
                    break;
                case 2: // Вычитание
                    System.out.println(frac1 + " - " + frac2 + " = " + frac1.minus(frac2));
                    break;
                case 3: // Умножение
                    System.out.println(frac1 + " * " + frac2 + " = " + frac1.multiply(frac2));
                    break;
                case 4: // Деление
                    try {
                        System.out.println(frac1 + " / " + frac2 + " = " + frac1.div(frac2));
                    } catch (ArithmeticException e) {
                        System.out.println("Ошибка: " + e.getMessage());
                    }
                    break;
                default:
                    System.out.println("Операции с таким номером нет, введите снова");
                    break;
            }
        }


        System.out.println("Задание 4.2");
        System.out.println("Сколько дробей вы хотите создать?");
        int colvo = in.nextInt();
        List<Fraction4> fractions4 = new ArrayList<>();
        for (int i = 0; i < colvo; i++) {
            System.out.println("Введите " + (i + 1) + " дробь");
            System.out.print("числитель: ");
            int ch4 = in.nextInt();
            System.out.print("знаменатель: ");
            int zn4 = in.nextInt();
            try {
                Fraction4 f4 = new Fraction4(ch4, zn4);
                fractions4.add(f4);
                System.out.println("Введенная дробь: " + f4);
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
            System.out.println("Выход - 0");
            System.out.print("Введите номер операции: ");
            int oper4 = in.nextInt();

            if (oper4 == 0) {
                //System.out.println("Выход из программы.");
                break;
            }
            Fraction4 fract1 = null;
            Fraction4 fract2 = null;

            if (oper4 >= 1 && oper4 <= 4) {

                System.out.println("Список введенных дробей:");
                for (int i = 0; i < fractions4.size(); i++) {
                    System.out.println((i + 1) + ") " + fractions4.get(i));
                }

                System.out.print("Выберите первую дробь из " + fractions4.size() + " дробей(напишите ее номер(1-" + fractions4.size() + "):");
                int n1 = in.nextInt() - 1;
                if (n1 < 0 || n1 >= fractions4.size()) {
                    System.out.println("Дроби с таким номером нет, введите снова");
                    continue;
                }
                fract1 = fractions4.get(n1);

                System.out.println("Список введенных дробей:");
                for (int i = 0; i < fractions4.size(); i++) {
                    System.out.println((i + 1) + ". " + fractions4.get(i));
                }

                System.out.print("Выберите вторую дробь из " + fractions4.size() + " дробей(напишите ее номер(1-" + fractions4.size() + "):");
                int n2 = in.nextInt() - 1;
                if (n2 < 0 || n2 >= fractions4.size()) {
                    System.out.println("Дроби с таким номером нет, введите снова");
                    continue;
                }
                fract2 = fractions4.get(n2);
            }
            switch (oper4) {
                case 1: // Сложение
                    System.out.println(fract1 + " + " + fract2 + " = " + fract1.sum(fract2));
                    break;
                case 2: // Вычитание
                    System.out.println(fract1 + " - " + fract2 + " = " + fract1.minus(fract2));
                    break;
                case 3: // Умножение
                    System.out.println(fract1 + " * " + fract2 + " = " + fract1.multiply(fract2));
                    break;
                case 4: // Деление
                    try {
                        System.out.println(fract1 + " / " + fract2 + " = " + fract1.div(fract2));
                    } catch (ArithmeticException e) {
                        System.out.println("Ошибка: " + e.getMessage());
                    }
                    break;
                default:
                    System.out.println("Операции с таким номером нет, введите снова");
                    break;
            }
        }


        System.out.println("Задание 5.1");
        System.out.println("Сколько чисел вы хотите ввести?");
        int count = in.nextInt();
        List<Num> numbers = new ArrayList<>();

        for (int i = 0; i < count; i++) {
            System.out.println("Введите " + (i + 1) + " число (целое, десятичная дробь(нпр, 1.2), обыкновенная дробь(нпр, 1/2)):");
            String numb = in.next();
            try {
                if (numb.contains("/")) {
                    String[] parts = numb.split("/");
                    int numerator = Integer.parseInt(parts[0]);
                    int denominator = Integer.parseInt(parts[1]);
                    numbers.add(new FracNum(numerator, denominator));
                } else if (numb.contains(".")) {
                    double value = Double.parseDouble(numb);
                    numbers.add(new DoubNum(value));
                } else {
                    int value = Integer.parseInt(numb);
                    numbers.add(new IntNum(value));
                }
            } catch (NumberFormatException e) {
                System.out.println("Ошибка: Некорректный формат числа. Попробуйте снова.");
                i--; // Уменьшаем счетчик, чтобы повторить ввод для этого числа
            }
        }

        // Создание объекта Addition и вычисление суммы
        Addition addition = new Addition(numbers);
        System.out.println("Сумма введенных чисел: " + addition.summa());

        in.close();
    }
}
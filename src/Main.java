import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Задание 1.4");
        System.out.println("Сколько дробей вы хотите создать?");
        int col = 0;
        while (true) {
            if (in.hasNextInt()) {
                col = in.nextInt();
                if (col <= 0) {
                    System.out.println("Количество дробей должно быть положительным числом!");
                } else {
                    break;
                }
            } else {
                System.out.println("Введите целое число!");
                in.next();
            }
        }
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
                i--;
            }
        }
        while (true) {
            System.out.println("Выберите операцию:");
            System.out.println("Сложение - 1");
            System.out.println("Вычитание - 2");
            System.out.println("Умножение - 3");
            System.out.println("Деление - 4");
            System.out.println("Выход - 0");
            System.out.print("Введите номер операции: ");
            int oper = 0;
            while (true) {
                if (in.hasNextInt()) {
                    oper = in.nextInt();
                    if (oper < 0 || oper > 4) {
                        System.out.println("Операции с таким номером нет!");
                        continue;
                    }
                    break;
                } else {
                    System.out.println("Введите целое число!");
                    in.next();
                }
            }

            if (oper == 0) {
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
                int nomer1 = 0;
                while (true) {
                    if (in.hasNextInt()) {
                        nomer1 = in.nextInt() - 1;
                        if (nomer1 < 0 || nomer1 >= fractions.size()) {
                            System.out.println("Дроби с таким номером нет, введите снова");
                            continue;
                        }
                        break;
                    } else {
                        System.out.println("Введите целое число!");
                        in.next();
                    }
                }
                f1 = fractions.get(nomer1);

                System.out.println("Список введенных дробей:");
                for (int i = 0; i < fractions.size(); i++) {
                    System.out.println((i + 1) + ". " + fractions.get(i));
                }

                System.out.print("Выберите вторую дробь из " + fractions.size() + " дробей(напишите ее номер(1-" + fractions.size() + "):");
                int nomer2 = 0;
                while (true) {
                    if (in.hasNextInt()) {
                        nomer2 = in.nextInt() - 1;
                        if (nomer2 < 0 || nomer2 >= fractions.size()) {
                            System.out.println("Дроби с таким номером нет, введите снова");
                            continue;
                        }
                        break;
                    } else {
                        System.out.println("Введите целое число!");
                        in.next();
                    }
                }
                f2 = fractions.get(nomer2);
            }
            switch (oper) {
                case 1:
                    System.out.println(f1 + " + " + f2 + " = " + f1.sum(f2));
                    break;
                case 2:
                    System.out.println(f1 + " - " + f2 + " = " + f1.minus(f2));
                    break;
                case 3:
                    System.out.println(f1 + " * " + f2 + " = " + f1.multiply(f2));
                    break;
                case 4:
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
        int colv = 0;
        while (true) {
            if (in.hasNextInt()) {
                colv = in.nextInt();
                if (colv <= 0) {
                    System.out.println("Количество дробей должно быть положительным числом!");
                } else {
                    break;
                }
            } else {
                System.out.println("Введите целое число!");
                in.next();
            }
        }
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
                i--;
            }
        }
        while (true) {
            System.out.println("Выберите операцию:");
            System.out.println("Сложение - 1");
            System.out.println("Вычитание - 2");
            System.out.println("Умножение - 3");
            System.out.println("Деление - 4");
            System.out.println("Выход - 0");
            System.out.print("Введите номер операции: ");
            int oper3 = 0;
            while (true) {
                if (in.hasNextInt()) {
                    oper3 = in.nextInt();
                    if (oper3 < 0 || oper3 > 4) {
                        System.out.println("Операции с таким номером нет!");
                        continue;
                    }
                    break;
                } else {
                    System.out.println("Введите целое число!");
                    in.next();
                }
            }

            if (oper3 == 0) {
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
                int nom1 = 0;
                while (true) {
                    if (in.hasNextInt()) {
                        nom1 = in.nextInt() - 1;
                        if (nom1 < 0 || nom1 >= fractions.size()) {
                            System.out.println("Дроби с таким номером нет, введите снова");
                            continue;
                        }
                        break;
                    } else {
                        System.out.println("Введите целое число!");
                        in.next();
                    }
                }
                frac1 = fractions3.get(nom1);

                System.out.println("Список введенных дробей:");
                for (int i = 0; i < fractions3.size(); i++) {
                    System.out.println((i + 1) + ". " + fractions3.get(i));
                }

                System.out.print("Выберите вторую дробь из " + fractions3.size() + " дробей(напишите ее номер(1-" + fractions3.size() + "):");
                int nom2 = 0;
                while (true) {
                    if (in.hasNextInt()) {
                        nom2 = in.nextInt() - 1;
                        if (nom2 < 0 || nom2 >= fractions.size()) {
                            System.out.println("Дроби с таким номером нет, введите снова");
                            continue;
                        }
                        break;
                    } else {
                        System.out.println("Введите целое число!");
                        in.next();
                    }
                }
                frac2 = fractions3.get(nom2);
            }
            switch (oper3) {
                case 1:
                    System.out.println(frac1 + " + " + frac2 + " = " + frac1.sum(frac2));
                    break;
                case 2:
                    System.out.println(frac1 + " - " + frac2 + " = " + frac1.minus(frac2));
                    break;
                case 3:
                    System.out.println(frac1 + " * " + frac2 + " = " + frac1.multiply(frac2));
                    break;
                case 4:
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
        int colvo = 0;
        while (true) {
            if (in.hasNextInt()) {
                colvo = in.nextInt();
                if (colvo <= 0) {
                    System.out.println("Количество дробей должно быть положительным числом!");
                } else {
                    break;
                }
            } else {
                System.out.println("Введите целое число!");
                in.next();
            }
        }
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
                i--;
            }
        }
        while (true) {
            System.out.println("Выберите операцию:");
            System.out.println("Сложение - 1");
            System.out.println("Вычитание - 2");
            System.out.println("Умножение - 3");
            System.out.println("Деление - 4");
            System.out.println("Выход - 0");
            System.out.print("Введите номер операции: ");
            int oper4 = 0;
            while (true) {
                if (in.hasNextInt()) {
                    oper4 = in.nextInt();
                    if (oper4 < 0 || oper4 > 4) {
                        System.out.println("Операции с таким номером нет!");
                        continue;
                    }
                    break;
                } else {
                    System.out.println("Введите целое число!");
                    in.next();
                }
            }

            if (oper4 == 0) {
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
                int n1 = 0;
                while (true) {
                    if (in.hasNextInt()) {
                        n1 = in.nextInt() - 1;
                        if (n1 < 0 || n1 >= fractions.size()) {
                            System.out.println("Дроби с таким номером нет, введите снова");
                            continue;
                        }
                        break;
                    } else {
                        System.out.println("Введите целое число!");
                        in.next();
                    }
                }
                fract1 = fractions4.get(n1);

                System.out.println("Список введенных дробей:");
                for (int i = 0; i < fractions4.size(); i++) {
                    System.out.println((i + 1) + ". " + fractions4.get(i));
                }

                System.out.print("Выберите вторую дробь из " + fractions4.size() + " дробей(напишите ее номер(1-" + fractions4.size() + "):");
                int n2 = 0;
                while (true) {
                    if (in.hasNextInt()) {
                        n2 = in.nextInt() - 1;
                        if (n2 < 0 || n2 >= fractions.size()) {
                            System.out.println("Дроби с таким номером нет, введите снова");
                            continue;
                        }
                        break;
                    } else {
                        System.out.println("Введите целое число!");
                        in.next();
                    }
                }
                fract2 = fractions4.get(n2);
            }
            switch (oper4) {
                case 1:
                    System.out.println(fract1 + " + " + fract2 + " = " + fract1.sum(fract2));
                    break;
                case 2:
                    System.out.println(fract1 + " - " + fract2 + " = " + fract1.minus(fract2));
                    break;
                case 3:
                    System.out.println(fract1 + " * " + fract2 + " = " + fract1.multiply(fract2));
                    break;
                case 4:
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
        System.out.println("Примеры использования методов класса Number:");
        for (Fraction4 fraction : fractions4) {
            System.out.println("Дробь: " + fraction);
            System.out.println("Число типа int: " + fraction.intValue());
            System.out.println("Число типа long: " + fraction.longValue());
            System.out.println("Число типа float: " + fraction.floatValue());
            System.out.println("Число типа double: " + fraction.doubleValue());
            System.out.println("Число типа byte: " + fraction.byteValue());
            System.out.println("Число типа short: " + fraction.shortValue());
            System.out.println();
        }


        System.out.println("Задание 5.1");
        int count = 0;
        while (true) {
            System.out.println("Сколько чисел вы хотите ввести?");
            try {
                count = in.nextInt();
                if (count <= 0) {
                    System.out.println("Количество чисел должно быть положительным числом!");
                } else {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Введите целое число!");
                in.next();
            }
        }
        List<Num> numbers = new ArrayList<>();

        for (int i = 0; i < count; i++) {
            System.out.println("Введите " + (i + 1) + " число (целое, десятичная дробь(нпр, 1.2), обыкновенная дробь(нпр, 1/2)):");
            String numb = in.next();
            try {
                if (numb.contains("/")) {
                    try {
                        String[] parts = numb.split("/");
                        int chisl = Integer.parseInt(parts[0]);
                        int znam = Integer.parseInt(parts[1]);
                        Num m=new FracNum(chisl, znam);
                        System.out.print("Введенное число:");
                        System.out.println(m);
                        numbers.add(m);
                    } catch (IllegalArgumentException e) {
                        System.out.println("Ошибка: " + e.getMessage());
                        i--;
                    }
                } else if (numb.contains(".")) {
                    double value = Double.parseDouble(numb);
                    Num m2=new DoubNum(value);
                    System.out.print("Введенное число:");
                    System.out.println(m2);
                    numbers.add(m2);
                } else {
                    int value = Integer.parseInt(numb);
                    Num m3=new IntNum(value);
                    System.out.print("Введенное число:");
                    System.out.println(m3);
                    numbers.add(m3);
                }
            } catch (NumberFormatException e) {
                System.out.println("Не правильный ввод числа");
                i--;
            }
        }
        Addition s = new Addition(numbers);
        System.out.println("Сумма введенных чисел: " + s.summa());


        in.close();
    }
}
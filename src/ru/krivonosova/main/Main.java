package ru.krivonosova.main;

import ru.krivonosova.numbers.*;
import ru.krivonosova.fractions.*;
import ru.krivonosova.cities.*;
import ru.krivonosova.geometry.*;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static double exp(String x, String y) {
        int num = 0;
        int step = 0;
        try {
            num = Integer.parseInt(x);
            step = Integer.parseInt(y);
        } catch (NumberFormatException e) {
            System.out.println("Оба параметра должны быть целыми числами!");
            return Double.NaN;
        }
        return Math.pow(num, step);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

//        System.out.println("Задание 1.4");
//        System.out.println("Сколько дробей вы хотите создать?");
//        int col = 0;
//        while (true) {
//            if (in.hasNextInt()) {
//                col = in.nextInt();
//                if (col <= 0) {
//                    System.out.println("Количество дробей должно быть положительным числом!");
//                } else {
//                    break;
//                }
//            } else {
//                System.out.println("Введите целое число!");
//                in.next();
//            }
//        }
//        List<Fraction> fractions = new ArrayList<>();
//        for (int i = 0; i < col; i++) {
//            System.out.println("Введите " + (i + 1) + " дробь");
//            System.out.print("числитель: ");
//            int ch = in.nextInt();
//            System.out.print("знаменатель: ");
//            int zn = in.nextInt();
//            try {
//                Fraction f = new Fraction(ch, zn);
//                fractions.add(f);
//                System.out.println("Введенная дробь: " + f);
//            } catch (IllegalArgumentException e) {
//                System.out.println("Ошибка: " + e.getMessage());
//                i--;
//            }
//        }
//        while (true) {
//            System.out.println("Выберите операцию:");
//            System.out.println("0) Выход");
//            System.out.println("1) Сложение");
//            System.out.println("2) Вычитание");
//            System.out.println("3) Умножение");
//            System.out.println("4) Деление");
//            System.out.print("Введите номер операции: ");
//            int oper = 0;
//            while (true) {
//                if (in.hasNextInt()) {
//                    oper = in.nextInt();
//                    if (oper < 0 || oper > 4) {
//                        System.out.println("Операции с таким номером нет!");
//                        continue;
//                    }
//                    break;
//                } else {
//                    System.out.println("Введите целое число!");
//                    in.next();
//                }
//            }
//
//            if (oper == 0) {
//                break;
//            }
//            Fraction f1 = null;
//            Fraction f2 = null;
//
//            if (oper >= 1 && oper <= 4) {
//
//                System.out.println("Список введенных дробей:");
//                for (int i = 0; i < fractions.size(); i++) {
//                    System.out.println((i + 1) + ") " + fractions.get(i));
//                }
//
//                System.out.println("Выберите первую дробь из " + fractions.size() + " дробей(напишите ее номер(1-" + fractions.size() + "):");
//                int nomer1 = 0;
//                while (true) {
//                    if (in.hasNextInt()) {
//                        nomer1 = in.nextInt() - 1;
//                        if (nomer1 < 0 || nomer1 >= fractions.size()) {
//                            System.out.println("Дроби с таким номером нет, введите снова");
//                            continue;
//                        }
//                        break;
//                    } else {
//                        System.out.println("Введите целое число!");
//                        in.next();
//                    }
//                }
//                f1 = fractions.get(nomer1);
//
//                System.out.println("Список введенных дробей:");
//                for (int i = 0; i < fractions.size(); i++) {
//                    System.out.println((i + 1) + ". " + fractions.get(i));
//                }
//
//                System.out.println("Выберите вторую дробь из " + fractions.size() + " дробей(напишите ее номер(1-" + fractions.size() + "):");
//                int nomer2 = 0;
//                while (true) {
//                    if (in.hasNextInt()) {
//                        nomer2 = in.nextInt() - 1;
//                        if (nomer2 < 0 || nomer2 >= fractions.size()) {
//                            System.out.println("Дроби с таким номером нет, введите снова");
//                            continue;
//                        }
//                        break;
//                    } else {
//                        System.out.println("Введите целое число!");
//                        in.next();
//                    }
//                }
//                f2 = fractions.get(nomer2);
//            }
//            switch (oper) {
//                case 1:
//                    System.out.println(f1 + " + " + f2 + " = " + f1.sum(f2));
//                    break;
//                case 2:
//                    System.out.println(f1 + " - " + f2 + " = " + f1.minus(f2));
//                    break;
//                case 3:
//                    System.out.println(f1 + " * " + f2 + " = " + f1.multiply(f2));
//                    break;
//                case 4:
//                    try {
//                        System.out.println(f1 + " / " + f2 + " = " + f1.div(f2));
//                    } catch (ArithmeticException e) {
//                        System.out.println("Ошибка: " + e.getMessage());
//                    }
//                    break;
//                default:
//                    System.out.println("Операции с таким номером нет, введите снова");
//                    break;
//            }
//        }
//
//
//        System.out.println("Задание 1.10");
//        List<City> cities = new ArrayList<>();
//        while (true) {
//            System.out.println("Добавить город - 1");
//            System.out.println("Добавить дорогу - 2");
//            System.out.println("Удалить дорогу - 3");
//            System.out.println("Показать города и дороги - 4");
//            System.out.println("Выход - 5");
//            System.out.print("Введите номер нужного действия: ");
//
//            int act ;
//            while (true) {
//                if (in.hasNextInt()) {
//                    act = in.nextInt();
//                    if (act <= 0 || act >= 6) {
//                        System.out.println("Такого действия нет! Введите число от 1 до 5");
//                    } else {
//                        break;
//                    }
//                } else {
//                    System.out.println("Введите целое число от 1 до 5!");
//                    in.next();
//                }
//            }
//
//            if(act==1){
//                System.out.println("Введите название города: ");
//                String cityName = in.nextLine();
//                try {
//                    cities.add(new City(cityName));
//                    System.out.println("Город " + cityName + " добавлен");
//                } catch (IllegalArgumentException e) {
//                    System.out.println("Ошибка: " + e.getMessage());
//                }
//            } else if(act==2){
//                if (cities.isEmpty()) {
//                    System.out.println("Список городов пуст. Сначала добавьте города.");
//                    break;
//                }
//
//                try {
//                    System.out.println("Доступные города:");
//                    for (int i = 0; i < cities.size(); i++) {
//                        System.out.println((i + 1) + ". " + cities.get(i).getName());
//                    }
//                    System.out.print("Выберите номер города отправления: ");
//                    int fromIndex = in.nextInt() - 1;
//                    System.out.print("Выберите номер города назначения: ");
//                    int toIndex = in.nextInt() - 1;
//                    System.out.print("Введите стоимость дороги: ");
//                    int cost = in.nextInt();
//
//                    if (fromIndex >= 0 && fromIndex < cities.size() && toIndex >= 0 && toIndex < cities.size()) {
//                        ru.krivonosova.cities.City fromCity = cities.get(fromIndex);
//                        ru.krivonosova.cities.City toCity = cities.get(toIndex);
//                        fromCity.addRoute(toCity, cost);
//                        System.out.println("Дорога добавлена: " + fromCity.getName() + " -> " + toCity.getName() + " за " + cost);
//                    } else {
//                        System.out.println("Неверный выбор городов.");
//                    }
//                } catch (IllegalArgumentException e) {
//                    System.out.println("Ошибка: " + e.getMessage());
//                } catch (Exception e) {
//                    System.out.println("Некорректный ввод. Попробуйте снова.");
//                    in.nextLine(); // Очистка буфера
//                }
//            } else if (act == 3) {
//                if (cities.isEmpty()) {
//                    System.out.println("Список городов пуст. Сначала добавьте города.");
//                    break;
//                }
//
//                try {
//                    System.out.println("Доступные города:");
//                    for (int i = 0; i < cities.size(); i++) {
//                        System.out.println((i + 1) + ". " + cities.get(i).getName());
//                    }
//                    System.out.print("Выберите номер города отправления: ");
//                    int fromIndex = in.nextInt() - 1;
//                    System.out.print("Выберите номер города назначения: ");
//                    int toIndex = in.nextInt() - 1;
//
//                    if (fromIndex >= 0 && fromIndex < cities.size() && toIndex >= 0 && toIndex < cities.size()) {
//                        ru.krivonosova.cities.City fromCity = cities.get(fromIndex);
//                        ru.krivonosova.cities.City toCity = cities.get(toIndex);
//                        fromCity.removeRoute(toCity);
//                        System.out.println("Дорога удалена: " + fromCity.getName() + " -> " + toCity.getName());
//                    } else {
//                        System.out.println("Неверный выбор городов.");
//                    }
//                } catch (IllegalArgumentException e) {
//                    System.out.println("Ошибка: " + e.getMessage());
//                } catch (Exception e) {
//                    System.out.println("Некорректный ввод. Попробуйте снова.");
//                    in.nextLine(); // Очистка буфера
//                }
//            } else if (act == 4) {
//                if (cities.isEmpty()) {
//                    System.out.println("Список городов пуст.");
//                } else {
//                    System.out.println("\nСписок городов и дорог:");
//                    for (ru.krivonosova.cities.City city : cities) {
//                        System.out.println(city);
//                    }
//                }
//            }
//
//            switch (act) {
//                case 1: // Добавление города
//                    System.out.println("Введите название города: ");
//                    String cityName = in.nextLine();
//                    try {
//                        ru.krivonosova.cities.City city = new ru.krivonosova.cities.City(cityName);
//                        cities.add(city);
//                        System.out.println("Город " + cityName + " добавлен");
//                    } catch (IllegalArgumentException e) {
//                        System.out.println("Ошибка: " + e.getMessage());
//                    }
//                    break;
//
//                case 2: // Добавление дороги
//                    if (cities.size() < 2) {
//                        System.out.println("Для добавления дороги необходимо иметь хотя бы два города.");
//                        break;
//                    }
//
//                    try {
//                        System.out.println("Доступные города:");
//                        for (int i = 0; i < cities.size(); i++) {
//                            System.out.println((i + 1) + ". " + cities.get(i).getName());
//                        }
//                        System.out.print("Выберите номер города отправления: ");
//                        int fromIndex = in.nextInt() - 1;
//                        System.out.print("Выберите номер города назначения: ");
//                        int toIndex = in.nextInt() - 1;
//                        System.out.print("Введите стоимость дороги: ");
//                        int cost = in.nextInt();
//
//                        if (fromIndex >= 0 && fromIndex < cities.size() && toIndex >= 0 && toIndex < cities.size()) {
//                            ru.krivonosova.cities.City fromCity = cities.get(fromIndex);
//                            ru.krivonosova.cities.City toCity = cities.get(toIndex);
//                            fromCity.addRoute(toCity, cost);
//                            System.out.println("Дорога добавлена: " + fromCity.getName() + " -> " + toCity.getName() + " за " + cost);
//                        } else {
//                            System.out.println("Неверный выбор городов.");
//                        }
//                    } catch (IllegalArgumentException e) {
//                        System.out.println("Ошибка: " + e.getMessage());
//                    } catch (Exception e) {
//                        System.out.println("Некорректный ввод. Попробуйте снова.");
//                        in.nextLine(); // Очистка буфера
//                    }
//                    break;
//
//                case 3: // Удаление дороги
//                    if (cities.isEmpty()) {
//                        System.out.println("Список городов пуст. Сначала добавьте города.");
//                        break;
//                    }
//
//                    try {
//                        System.out.println("Доступные города:");
//                        for (int i = 0; i < cities.size(); i++) {
//                            System.out.println((i + 1) + ". " + cities.get(i).getName());
//                        }
//                        System.out.print("Выберите номер города отправления: ");
//                        int fromIndex = in.nextInt() - 1;
//                        System.out.print("Выберите номер города назначения: ");
//                        int toIndex = in.nextInt() - 1;
//
//                        if (fromIndex >= 0 && fromIndex < cities.size() && toIndex >= 0 && toIndex < cities.size()) {
//                            ru.krivonosova.cities.City fromCity = cities.get(fromIndex);
//                            ru.krivonosova.cities.City toCity = cities.get(toIndex);
//                            fromCity.removeRoute(toCity);
//                            System.out.println("Дорога удалена: " + fromCity.getName() + " -> " + toCity.getName());
//                        } else {
//                            System.out.println("Неверный выбор городов.");
//                        }
//                    } catch (IllegalArgumentException e) {
//                        System.out.println("Ошибка: " + e.getMessage());
//                    } catch (Exception e) {
//                        System.out.println("Некорректный ввод. Попробуйте снова.");
//                        in.nextLine(); // Очистка буфера
//                    }
//                    break;
//
//                case 4: // Показать города и дороги
//                    if (cities.isEmpty()) {
//                        System.out.println("Список городов пуст.");
//                    } else {
//                        System.out.println("\nСписок городов и дорог:");
//                        for (ru.krivonosova.cities.City city : cities) {
//                            System.out.println(city);
//                        }
//                    }
//                    break;
//
//                case 5: // Выход
//                    System.out.println("Выход из программы.");
//                    break;  // Выход из цикла, не завершает программу
//            }
//
//            // Проверка, если был выбран выход
//            if (act == 5) {
//                break;  // Выход из цикла while
//            }
//        }
//
//
//        System.out.println("Задание 3.1");
//        System.out.println("Сколько дробей вы хотите создать?");
//        int colv = 0;
//        while (true) {
//            if (in.hasNextInt()) {
//                colv = in.nextInt();
//                if (colv <= 0) {
//                    System.out.println("Количество дробей должно быть положительным числом!");
//                } else {
//                    break;
//                }
//            } else {
//                System.out.println("Введите целое число!");
//                in.next();
//            }
//        }
//        List<Fraction3> fractions3 = new ArrayList<>();
//        for (int i = 0; i < colv; i++) {
//            System.out.println("Введите " + (i + 1) + " дробь");
//            System.out.print("числитель: ");
//            int ch3 = in.nextInt();
//            System.out.print("знаменатель: ");
//            int zn3 = in.nextInt();
//            try {
//                Fraction3 f3 = new Fraction3(ch3, zn3);
//                fractions3.add(f3);
//                System.out.println("Введенная дробь: " + f3);
//            } catch (IllegalArgumentException e) {
//                System.out.println("Ошибка: " + e.getMessage());
//                i--;
//            }
//        }
//        while (true) {
//            System.out.println("Выберите операцию:");
//            System.out.println("0) Выход");
//            System.out.println("1) Сложение");
//            System.out.println("2) Вычитание");
//            System.out.println("3) Умножение");
//            System.out.println("4) Деление");
//            System.out.println("Введите номер операции: ");
//            int oper3 = 0;
//            while (true) {
//                if (in.hasNextInt()) {
//                    oper3 = in.nextInt();
//                    if (oper3 < 0 || oper3 > 4) {
//                        System.out.println("Операции с таким номером нет!");
//                        continue;
//                    }
//                    break;
//                } else {
//                    System.out.println("Введите целое число!");
//                    in.next();
//                }
//            }
//
//            if (oper3 == 0) {
//                break;
//            }
//            Fraction3 frac1 = null;
//            Fraction3 frac2 = null;
//
//            if (oper3 >= 1 && oper3 <= 4) {
//
//                System.out.println("Список введенных дробей:");
//                for (int i = 0; i < fractions3.size(); i++) {
//                    System.out.println((i + 1) + ") " + fractions3.get(i));
//                }
//
//                System.out.println("Выберите первую дробь из " + fractions3.size() + " дробей(напишите ее номер(1-" + fractions3.size() + "):");
//                int nom1 = 0;
//                while (true) {
//                    if (in.hasNextInt()) {
//                        nom1 = in.nextInt() - 1;
//                        if (nom1 < 0 || nom1 >= fractions3.size()) {
//                            System.out.println("Дроби с таким номером нет, введите снова");
//                            continue;
//                        }
//                        break;
//                    } else {
//                        System.out.println("Введите целое число!");
//                        in.next();
//                    }
//                }
//                frac1 = fractions3.get(nom1);
//
//                System.out.println("Список введенных дробей:");
//                for (int i = 0; i < fractions3.size(); i++) {
//                    System.out.println((i + 1) + ". " + fractions3.get(i));
//                }
//
//                System.out.println("Выберите вторую дробь из " + fractions3.size() + " дробей(напишите ее номер(1-" + fractions3.size() + "):");
//                int nom2 = 0;
//                while (true) {
//                    if (in.hasNextInt()) {
//                        nom2 = in.nextInt() - 1;
//                        if (nom2 < 0 || nom2 >= fractions3.size()) {
//                            System.out.println("Дроби с таким номером нет, введите снова");
//                            continue;
//                        }
//                        break;
//                    } else {
//                        System.out.println("Введите целое число!");
//                        in.next();
//                    }
//                }
//                frac2 = fractions3.get(nom2);
//            }
//            switch (oper3) {
//                case 1:
//                    System.out.println(frac1 + " + " + frac2 + " = " + frac1.sum(frac2));
//                    break;
//                case 2:
//                    System.out.println(frac1 + " - " + frac2 + " = " + frac1.minus(frac2));
//                    break;
//                case 3:
//                    System.out.println(frac1 + " * " + frac2 + " = " + frac1.multiply(frac2));
//                    break;
//                case 4:
//                    try {
//                        System.out.println(frac1 + " / " + frac2 + " = " + frac1.div(frac2));
//                    } catch (ArithmeticException e) {
//                        System.out.println("Ошибка: " + e.getMessage());
//                    }
//                    break;
//                default:
//                    System.out.println("Операции с таким номером нет, введите снова");
//                    break;
//            }
//        }
//
//
//        System.out.println("Задание 4.2");
//        System.out.println("Сколько дробей вы хотите создать?");
//        int colvo = 0;
//        while (true) {
//            if (in.hasNextInt()) {
//                colvo = in.nextInt();
//                if (colvo <= 0) {
//                    System.out.println("Количество дробей должно быть положительным числом!");
//                } else {
//                    break;
//                }
//            } else {
//                System.out.println("Введите целое число!");
//                in.next();
//            }
//        }
//        List<Fraction4> fractions4 = new ArrayList<>();
//        for (int i = 0; i < colvo; i++) {
//            System.out.println("Введите " + (i + 1) + " дробь");
//            System.out.print("числитель: ");
//            int ch4 = in.nextInt();
//            System.out.print("знаменатель: ");
//            int zn4 = in.nextInt();
//            try {
//                Fraction4 f4 = new Fraction4(ch4, zn4);
//                fractions4.add(f4);
//                System.out.println("Введенная дробь: " + f4);
//            } catch (IllegalArgumentException e) {
//                System.out.println("Ошибка: " + e.getMessage());
//                i--;
//            }
//        }
//        while (true) {
//            System.out.println("Выберите операцию:");
//            System.out.println("0) Выход");
//            System.out.println("1) Сложение");
//            System.out.println("2) Вычитание");
//            System.out.println("3) Умножение");
//            System.out.println("4) Деление");
//            System.out.print("Введите номер операции: ");
//            int oper4 = 0;
//            while (true) {
//                if (in.hasNextInt()) {
//                    oper4 = in.nextInt();
//                    if (oper4 < 0 || oper4 > 4) {
//                        System.out.println("Операции с таким номером нет!");
//                        continue;
//                    }
//                    break;
//                } else {
//                    System.out.println("Введите целое число!");
//                    in.next();
//                }
//            }
//
//            if (oper4 == 0) {
//                break;
//            }
//            Fraction4 fract1 = null;
//            Fraction4 fract2 = null;
//
//            if (oper4 >= 1 && oper4 <= 4) {
//
//                System.out.println("Список введенных дробей:");
//                for (int i = 0; i < fractions4.size(); i++) {
//                    System.out.println((i + 1) + ") " + fractions4.get(i));
//                }
//
//                System.out.println("Выберите первую дробь из " + fractions4.size() + " дробей(напишите ее номер(1-" + fractions4.size() + "):");
//                int n1 = 0;
//                while (true) {
//                    if (in.hasNextInt()) {
//                        n1 = in.nextInt() - 1;
//                        if (n1 < 0 || n1 >= fractions4.size()) {
//                            System.out.println("Дроби с таким номером нет, введите снова");
//                            continue;
//                        }
//                        break;
//                    } else {
//                        System.out.println("Введите целое число!");
//                        in.next();
//                    }
//                }
//                fract1 = fractions4.get(n1);
//
//                System.out.println("Список введенных дробей:");
//                for (int i = 0; i < fractions4.size(); i++) {
//                    System.out.println((i + 1) + ". " + fractions4.get(i));
//                }
//
//                System.out.println("Выберите вторую дробь из " + fractions4.size() + " дробей(напишите ее номер(1-" + fractions4.size() + "):");
//                int n2 = 0;
//                while (true) {
//                    if (in.hasNextInt()) {
//                        n2 = in.nextInt() - 1;
//                        if (n2 < 0 || n2 >= fractions4.size()) {
//                            System.out.println("Дроби с таким номером нет, введите снова");
//                            continue;
//                        }
//                        break;
//                    } else {
//                        System.out.println("Введите целое число!");
//                        in.next();
//                    }
//                }
//                fract2 = fractions4.get(n2);
//            }
//            switch (oper4) {
//                case 1:
//                    System.out.println(fract1 + " + " + fract2 + " = " + fract1.sum(fract2));
//                    break;
//                case 2:
//                    System.out.println(fract1 + " - " + fract2 + " = " + fract1.minus(fract2));
//                    break;
//                case 3:
//                    System.out.println(fract1 + " * " + fract2 + " = " + fract1.multiply(fract2));
//                    break;
//                case 4:
//                    try {
//                        System.out.println(fract1 + " / " + fract2 + " = " + fract1.div(fract2));
//                    } catch (ArithmeticException e) {
//                        System.out.println("Ошибка: " + e.getMessage());
//                    }
//                    break;
//                default:
//                    System.out.println("Операции с таким номером нет, введите снова");
//                    break;
//            }
//        }
//        System.out.println("Примеры использования методов класса Number:");
//        for (Fraction4 fraction : fractions4) {
//            System.out.println("Дробь: " + fraction);
//            System.out.println("Число типа int: " + fraction.intValue());
//            System.out.println("Число типа long: " + fraction.longValue());
//            System.out.println("Число типа float: " + fraction.floatValue());
//            System.out.println("Число типа double: " + fraction.doubleValue());
//            System.out.println("Число типа byte: " + fraction.byteValue());
//            System.out.println("Число типа short: " + fraction.shortValue());
//            System.out.println();
//        }
//
//
//        System.out.println("Задание 5.1");
//        System.out.println("Сколько чисел вы хотите ввести?");
//        int count = 0;
//        while (true) {
//            if (in.hasNextInt()) {
//                count = in.nextInt();
//                if (count <= 0) {
//                    System.out.println("Количество чисел должно быть положительным числом!");
//                } else {
//                    break;
//                }
//            } else {
//                System.out.println("Введите целое число!");
//                in.next();
//            }
//        }
//        List<Num> numbers = new ArrayList<>();
//
//        for (int i = 0; i < count; i++) {
//            System.out.println("Введите " + (i + 1) + " число (целое, десятичная дробь(нпр, 1.2), обыкновенная дробь(нпр, 1/2)):");
//            String numb = in.next();
//            try {
//                if (numb.contains("/")) {
//                    try {
//                        String[] parts = numb.split("/");
//                        int chisl = Integer.parseInt(parts[0]);
//                        int znam = Integer.parseInt(parts[1]);
//                        Num m = new FracNum(chisl, znam);
//                        System.out.print("Введенное число:");
//                        System.out.println(m);
//                        numbers.add(m);
//                    } catch (IllegalArgumentException e) {
//                        System.out.println("Ошибка: " + e.getMessage());
//                        i--;
//                    }
//                } else if (numb.contains(".")) {
//                    double value = Double.parseDouble(numb);
//                    Num m2 = new DoubNum(value);
//                    System.out.print("Введенное число:");
//                    System.out.println(m2);
//                    numbers.add(m2);
//                } else {
//                    int value = Integer.parseInt(numb);
//                    Num m3 = new IntNum(value);
//                    System.out.print("Введенное число:");
//                    System.out.println(m3);
//                    numbers.add(m3);
//                }
//            } catch (NumberFormatException e) {
//                System.out.println("Не правильный ввод числа");
//                i--;
//            }
//        }
//        Addition s = new Addition(numbers);
//        System.out.println("Сумма введенных чисел: " + s.summa());
//
//
//        System.out.println("Задание 7.3");
//        System.out.println("Введите число X: ");
//        String x = in.nextLine().trim();
//        System.out.println("Введите число Y: ");
//        String y = in.nextLine().trim();
//        double res = exp(x, y);
//        if (!Double.isNaN(res)) {
//            System.out.println("Результат возведения " + x + " в степень " + y + " равен: " + res);
//        } else {
//            System.out.println("Нельзя выполнить возведение в степень");
//        }


        System.out.println("Задание 8.4");
        List<Point> points = new ArrayList<>();
        System.out.println("Сколько точек вы хотите создать?");
        int count8 = 0;
        while (true) {
            if (in.hasNextInt()) {
                count8 = in.nextInt();
                if (count8 <= 0) {
                    System.out.println("Количество точек должно быть положительным числом!");
                } else {
                    break;
                }
            } else {
                System.out.println("Введите целое число!");
                in.next();
            }
        }
        for (int i = 0; i < count8; i++) {
            double x = 0;
            double y = 0;
            while (true) {
                try {
                    System.out.println("Введите координаты " + (i + 1) + " точки");
                    System.out.println("Координата х: ");
                    x = in.nextDouble();
                    System.out.println("Координата у: ");
                    y = in.nextDouble();
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Введите целое число или дробное (нпр, 1,2)");
                    in.next();
                }
            }
            Point point = new Point(x, y);
            points.add(point);
        }
        System.out.println("Введенные точки:");
        for (int i = 0; i < points.size(); i++) {
            System.out.println((i + 1) + ") " + points.get(i));
        }
        // Выбор точек для сравнения
        if (points.size() > 1) {
            System.out.println("Введите номер первой точки для сравнения (1 - " + points.size() + "): ");
            int nomerone = 0;
            while (true) {
                if (in.hasNextInt()) {
                    nomerone = in.nextInt() - 1;
                    if (nomerone < 0 || nomerone >= points.size()) {
                        System.out.println("Точки с таким номером нет, введите снова");
                        continue;
                    }
                    break;
                } else {
                    System.out.println("Введите целое число!");
                    in.next();
                }
            }
            Point point1 = points.get(nomerone);
            System.out.println("Введите номер второй точки для сравнения (1 - " + points.size() + "): ");
            int nomertwo = 0;
            while (true) {
                if (in.hasNextInt()) {
                    nomertwo = in.nextInt() - 1;
                    if (nomertwo < 0 || nomertwo >= points.size()) {
                        System.out.println("Точки с таким номером нет, введите снова");
                        continue;
                    }
                    break;
                } else {
                    System.out.println("Введите целое число!");
                    in.next();
                }
            }
            Point point2 = points.get(nomertwo);
            if (point1.equals(point2)) {
                System.out.println("Точки " + point1 + " и " + point2 + " одинаковые");
            } else {
                System.out.println("Точки " + point1 + " и " + point2 + " не одинаковые");
            }

            System.out.println("Введите номер точки для клонирования (1 - " + points.size() + "): ");
            int nomer8 = 0;
            while (true) {
                if (in.hasNextInt()) {
                    nomer8 = in.nextInt() - 1;
                    if (nomer8 < 0 || nomer8 >= points.size()) {
                        System.out.println("Точки с таким номером нет, введите снова");
                        continue;
                    }
                    break;
                } else {
                    System.out.println("Введите целое число!");
                    in.next();
                }
            }
            Point point3 = points.get(nomer8);
            Point clonedpoint = point3.clone();
            System.out.println("Клонированная точка " + ": " + clonedpoint);
        } else {
            System.out.println("Недостаточно точек для сравнения, поэтому можно только клонировать введенную точку");
            Point point4 = points.get(0);
            Point clonedpoint2 = point4.clone();
            System.out.println("Клонированная точка " + ": " + clonedpoint2);
        }
        in.close();
    }
}
package ru.krivonosova.fractions;

public final class Fraction4 extends Number {
    // Поля
    private final int chisl;
    private final int znam;
    //свойства
    int getChisl() {
        return this.chisl;
    }
    int getZnam() {
        return this.znam;
    }
    // Конструктор
    public Fraction4(int chisl, int znam) {
        if (znam == 0) {
            throw new IllegalArgumentException("Знаменатель не может быть равен нулю");
        }
        if (znam < 0) {
            this.chisl = -chisl;
            this.znam = -znam;
        } else {
            this.chisl = chisl;
            this.znam = znam;
        }
    }
    // Методы
    @Override
    public String toString() {
        return chisl + "/" + znam;
    }

    public Fraction4 sum(Fraction4 other) {
        int newchisl = this.chisl * other.znam + other.chisl * this.znam;
        int newznam = this.znam * other.znam;
        return new Fraction4(newchisl, newznam);
    }

    public Fraction4 minus(Fraction4 other) {
        int newchisl = this.chisl * other.znam - other.chisl * this.znam;
        int newznam = this.znam * other.znam;
        return new Fraction4(newchisl, newznam);
    }

    public Fraction4 multiply(Fraction4 other) {
        int newchisl = this.chisl * other.chisl;
        int newznam = this.znam * other.znam;
        return new Fraction4(newchisl, newznam);
    }

    public Fraction4 div(Fraction4 other) {
        if (other.chisl == 0) {
            throw new ArithmeticException("Деление на ноль");
        }
        int newchisl = this.chisl * other.znam;
        int newznam = this.znam * other.chisl;
        return new Fraction4(newchisl, newznam);
    }

    // Реализация методов класса Number
    @Override
    public int intValue() {
        return chisl / znam;
    }

    @Override
    public long longValue() {
        return (long) chisl / znam;
    }

    @Override
    public float floatValue() {
        return (float) chisl / znam;
    }

    @Override
    public double doubleValue() {
        return (double) chisl / znam;
    }

    @Override
    public byte byteValue() {
        return (byte) (chisl / znam);
    }

    @Override
    public short shortValue() {
        return (short) (chisl / znam);
    }
}

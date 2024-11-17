package ru.krivonosova.fractions;

public class Fraction {
    //поля
    private final int chisl;
    private final int znam;
    //свойства
    int getChisl() {
        return this.chisl;
    }
    int getZnam() {
        return this.znam;
    }
    //конструктор
    public Fraction(int chisl, int znam) {
        if (znam==0) {
            throw new IllegalArgumentException("Знаменатель не может быть равен нулю");
        }
        if (znam<0) {
            this.chisl=-chisl;
            this.znam=-znam;
        }else {
            this.chisl = chisl;
            this.znam = znam;
        }
    }
    //методы
    public String toString() {
        return chisl+"/"+znam;
    }

    public Fraction sum(Fraction other) {
        int newchisl=this.chisl*other.znam+other.chisl*this.znam;
        int newznam=this.znam*other.znam;
        return new Fraction(newchisl, newznam);
    }

    public Fraction minus(Fraction other) {
        int newchisl=this.chisl*other.znam-other.chisl*this.znam;
        int newznam=this.znam*other.znam;
        return new Fraction(newchisl, newznam);
    }

    public Fraction multiply(Fraction other) {
        int newchisl=this.chisl*other.chisl;
        int newznam=this.znam*other.znam;
        return new Fraction(newchisl, newznam);
    }

    public Fraction div(Fraction other) {
        if (other.chisl==0){
            throw new ArithmeticException();
        }
        int newchisl=this.chisl*other.znam;
        int newznam=this.znam*other.chisl;
        return new Fraction(newchisl, newznam);
    }
}

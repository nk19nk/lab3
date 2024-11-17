package ru.krivonosova.fractions;

public final class Fraction3 {
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
    public Fraction3(int chisl, int znam) {
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

    public Fraction3 sum(Fraction3 other) {
        int newchisl=this.chisl*other.znam+other.chisl*this.znam;
        int newznam=this.znam*other.znam;
        return new Fraction3(newchisl, newznam);
    }

    public Fraction3 minus(Fraction3 other) {
        int newchisl=this.chisl*other.znam-other.chisl*this.znam;
        int newznam=this.znam*other.znam;
        return new Fraction3(newchisl, newznam);
    }

    public Fraction3 multiply(Fraction3 other) {
        int newchisl=this.chisl*other.chisl;
        int newznam=this.znam*other.znam;
        return new Fraction3(newchisl, newznam);
    }

    public Fraction3 div(Fraction3 other) {
        if (other.chisl==0){
            throw new ArithmeticException();
        }
        int newchisl=this.chisl*other.znam;
        int newznam=this.znam*other.chisl;
        return new Fraction3(newchisl, newznam);
    }
}

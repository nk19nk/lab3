package ru.krivonosova.geometry;

public class Point implements Cloneable{
    private double x;
    private double y;

    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        }
        if (obj == null || getClass() != obj.getClass()){
            return false;
        }
        Point newobj = (Point) obj;
        return this.x == newobj.x && this.y == newobj.y;
    }
    public Point clone() {
        try {
            return (Point) super.clone(); // Вызов метода clone родительского класса
        } catch (CloneNotSupportedException e) {
            // Это исключение не должно возникать, так как мы реализуем Cloneable
            throw new AssertionError("Клонирование не поддерживается", e);
        }
    }
    public String toString() {
        return "{" + x + "; " + y + "}";
    }
}

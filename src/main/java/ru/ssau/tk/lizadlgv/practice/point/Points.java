package ru.ssau.tk.lizadlgv.practice.point;

public class Points {
    private Points() {
    }

    public static Point sum(Point firstObj, Point secondObj) {
        return new Point(firstObj.x + secondObj.x, firstObj.y + secondObj.y, firstObj.z + secondObj.z);
    }

    public static Point subtract(Point firstObj, Point secondObj) {
        return new Point(firstObj.x - secondObj.x, firstObj.y - secondObj.y, firstObj.z - secondObj.z);
    }

    public static Point multiply(Point firstObj, Point secondObj) {
        return new Point(firstObj.x * secondObj.x, firstObj.y * secondObj.y, firstObj.z * secondObj.z);
    }

    public static Point divide(Point firstObj, Point secondObj) {
        return new Point(firstObj.x / secondObj.x, firstObj.y / secondObj.y, firstObj.z / secondObj.z);
    }

    public static Point enlarge(Point obj, double number) {
        return new Point(obj.x * number, obj.y * number, obj.z * number);
    }

    public static double length(Point obj) {
        return obj.length();
    }
}

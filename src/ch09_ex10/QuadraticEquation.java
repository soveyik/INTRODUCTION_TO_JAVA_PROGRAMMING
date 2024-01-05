package ch09_ex10;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    QuadraticEquation(double a, double b, double c){
        this.a= a;
        this.b = b;
        this.c = c;
    }
    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }
    public double getDiscriminant(){
        return (b*b - (4*a*c));
    }
    public double getRoot1() {
        if (getDiscriminant() < 0)
            return 0;
        return (-b + Math.sqrt(Math.pow(b, 2) - (4 * a * c)) / (2 * a));
    }
    protected double getRoot2(){
            if (getDiscriminant() < 0) {
                return 0;
            }
            return (-b - Math.sqrt(Math.pow(b, 2) - (4 * a * c)) / (2 * a));
        }
}

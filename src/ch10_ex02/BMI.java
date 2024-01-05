package ch10_ex02;

public class BMI {
    private int age;
    private String name;
    private double weight;
    private int feet;
    private double inches;
    public static final double KILOGRAMS_PER_POUND = 0.45359237;
    public static final double METERS_PER_INCH = 0.0254;

    public void BMI(){
        this.age = age;
        this.name = name;
        this.feet = feet;
        this.weight = weight;
        this.inches = inches;
    }
    public int getAge(){
        return age;
    }

    public double getInches() {
        return inches;
    }

    public double getWeight() {
        return weight;
    }

    public int getFeet() {
        return feet;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setFeet(int feet) {
        this.feet = feet;
    }

    public void setInches(double inches) {
        this.inches = inches;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}

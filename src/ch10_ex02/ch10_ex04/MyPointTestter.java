package ch10_ex02.ch10_ex04;

public class MyPointTestter {
    public static void main(String[] args) {
        MyPoint p1 = new MyPoint(0.0,0.0);
        MyPoint p2 = new MyPoint(10.0,35.5);

        System.out.println("iki nokta arasındaki uzaklık  "+ p1.distance(p2));
    }
}

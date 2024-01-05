package ch09_ex08;

import org.w3c.dom.ls.LSOutput;

public class FanTestter {
    public static void main(String[] args) {
        Fan obj1 = new Fan();
        Fan obj2 = new Fan();

        obj1.setRadius(10);
        obj1.setColor("yellow");
        obj1.setSpeed(Fan.FAST);
        obj1.setOn(true);;

        obj2.setRadius(5);
        obj2.setColor("blue");
        obj2.setSpeed(Fan.SLOW);
        obj2.setOn(false);

        System.out.println("fan 1 string " + obj1.toString());
        System.out.println("fan 2 string " + obj2.toString());

    }
}

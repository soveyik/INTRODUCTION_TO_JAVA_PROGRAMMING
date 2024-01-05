package ch09_ex08;

public class Fan {
   public static final int SLOW = 1;
   public static final int MEDİUM = 2;
   public  static final int FAST = 3;
   private int speed;
   private boolean on;
   private double radius;
   private String color;
   public Fan(){
       speed = SLOW;
       radius = 5.0;
       color = "blue";
       on = false;
   }

    public double getRadius() {
        return radius;
    }

    public int getSpeed() {
        return speed;
    }

    public String getColor() {
        return color;
    }
    public boolean isOn(){
       return on;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String toString(){

       if(on == true)
           return "fan has speed " +speed + "color of the fan " + color
                   + " radius of the fan is "+ radius;
       else
           return "fan is off";
   }
}



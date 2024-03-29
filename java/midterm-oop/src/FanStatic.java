
import com.sun.source.tree.WhileLoopTree;

public class FanStatic {
    //three constant
    final static int SLOW = 1;
    final static int MEDIUM = 2;
    final static int FAST = 3;

    //four data fields
    private static int speed;
    private static boolean on;
    private static double radius;
    static String color;

    //the accessor and mutator methods (getter and setter)
    public static int getSpeed() {
        return speed;
    }
    public static boolean getOn() {
        return on;
    }
    public static double getRadius() {
        return radius;
    }
    public static String getColor() {
        return color;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public void setOn(boolean on) {
        this.on = on;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public void setColor(String color) {
        this.color = color;
    }

    //no-args constructor default fan
    public FanStatic() {
        speed = SLOW;
        on = false;
        radius = 5;
        color = "blue";
    }

    //toString(), description of the fan, if fan is on or not on
    public String toString() {
        if (on) {
            return "Fan Speed: "+this.getSpeed() +" ,Fan Color: "+ this.getColor() +" ,Fan Radius: "+this.getRadius();
        } 
        else {
            return "Fan Color: " + this.getColor()+ " ,Fan Radius: " + this.getRadius() + " ,Fan is off";
        }
    }

    //pang run :)
    public static void main(String[] args) {
        FanStatic fanstatic = new FanStatic();
        System.out.println(fanstatic.toString());
    }
    
   
}

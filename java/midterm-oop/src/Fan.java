
public class Fan {
    //three constant
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;

    //four data fields
    private int speed;
    private boolean on;
    private double radius;
    String color;

    //the accessor and mutator methods (getter and setter)
    public int getSpeed() {
        return speed;
    }
    public boolean getOn() {
        return on;
    }
    public double getRadius() {
        return radius;
    }
    public String getColor() {
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
    public Fan() {
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
            return "Fan Color: " + this.getColor() + " ,Fan Radius: " + this.getRadius() + " ,Fan is off";
        }
    }

    //pang run :)
    public static void main(String[] args) {
        Fan fan = new Fan();
        System.out.println(fan.toString());
    }
}

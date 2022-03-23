package moduleTwo;

class Fan {
    final int STOPPED = 0, SLOW = 1, MEDIUM = 2, FAST = 3;
    private int speed = STOPPED;
    private boolean isOn = false;
    private double radius = 6;

    String color = "white";

    public Fan() {

    }

    public Fan(int speed, boolean isOn, double radius, String color) {
        // I removed the setter methods because setting in the constructor is better practice.
        this.speed = speed;
        this.isOn = isOn;
        this.radius = radius;
        this.color = color;
    }

    public String toString(){
        String status = "The " + color + " fan is currently ";
        if (isOn) {
            status += "on";
        } else {
            status += "off";
        }
        status += " with a speed of " + speed + " and a radius of " + radius;

        return status;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean getIsOn() {
        return isOn;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }
}
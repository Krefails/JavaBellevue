package moduleOne;

class Fan {
    final int STOPPED = 0, SLOW = 1, MEDIUM = 2, FAST = 3;
    private int speed = STOPPED;
    private boolean isOn = false;
    private double radius = 6;

    String color = "white";

    public Fan() {

    }

    public Fan(int speed, boolean isOn, double radius, String color) {
        setSpeed(speed);
        setIsOn(isOn);
        setRadius(radius);
        setColor(color);
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

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean getIsOn() {
        return isOn;
    }

    public void setIsOn(boolean isOn) {
        this.isOn = isOn;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

class Test {
    public static void main(String[] args) {
        Fan setFan = new Fan(1, false, 3, "black");
        Fan defaultFan = new Fan();
        System.out.printf("Your Custom fan's status: %s\n" + 
            "The default fan's status: %s", setFan.toString(), defaultFan.toString());
    }
}
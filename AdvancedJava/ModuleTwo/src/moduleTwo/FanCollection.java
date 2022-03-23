/**
 * Justin Kreifels
 * 2022-03-22, 22:00
 * Module 2 Programming Assignment
 * Description:
 * This program creates a collection of the Fan class and prints the status of each fan
 * One method uses Varargs to return a collection of objects
 * The other method takes in one fan obj and prints it to the console
 * I will be doing user inputs and fact checking tomorrow if I have time.
 * I want the user to be able to have an interface/menu and where 
 * they cannot set the fan speed if the fan is turned off.
 * If you want to see the updated code please check out my repo on github
 * It will be under AdvancedJava/ModuleTwo.
 * I do not expect to recieve points for the updated code however!
 */

package moduleTwo;

public class FanCollection {
    public static void main(String[] args) {
        Fan fanOne = new Fan();
        Fan fanTwo = new Fan(1, true, 5, "blue");
        Fan fanThree = new Fan(2, true, 3, "green");
        Fan fanFour = new Fan(0, false, 7, "red");

        multipleFanStatus(fanOne, fanTwo, fanThree, fanFour);

        fanStatus(fanOne);
    }

    public static void multipleFanStatus(Fan... fan){
        String isOn = "off";
        
        for (Fan i: fan) {
            if (i.getIsOn()) {
                isOn = "on";
            } else {
                isOn = "off";
            }
            System.out.printf("\nThe %s fan is currently %s with a speed of %d and a radius of %.2f\n", i.getColor(), isOn, i.getSpeed(), i.getRadius());
        }
    }

    public static void fanStatus(Fan fan) {
        String isOn = "off";

        if (fan.getIsOn()) {
            isOn = "on";
        } else {
            isOn = "off";
        }

        System.out.printf("\nThe %s fan is currently %s with a speed of %d and a radius of %.2f\n", fan.getColor(), isOn, fan.getSpeed(), fan.getRadius());
    }
}

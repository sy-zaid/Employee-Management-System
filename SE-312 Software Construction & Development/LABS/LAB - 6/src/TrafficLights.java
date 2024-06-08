/*
* Write a Java program to create class called “TrafficLight” with attributes for color and duration,
* and methods to change the color and check for red or green.
* */
public class TrafficLights {
    public String color;
    public int duration;

    public TrafficLights(String color,int duration){
        this.color = color;
        this.duration = duration;
    }

    public void changeColor(){
        if (this.color == "Red"){
            System.out.println("Changed color to Yellow");
        }
        if (this.color == "Yellow"){
            System.out.println("Changed color to Green");
        }
        if (this.color == "Green"){
            System.out.println("Changed color to Red");
        }
    }

    public void currentStatus(){
        System.out.println("The current light blinking is of color: "+this.color+" will be changing in: "+this.duration);
    }

}

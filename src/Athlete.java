
public class Athlete {
	static int nextBibNumber=0;
    static String raceLocation = "New York";
    static String raceStartTime = "9.00am";

    String name;
    int speed;
    int bibNumber;

Athlete (String name, int speed){
	nextBibNumber++;
	bibNumber=nextBibNumber;
    this.name = name;
    this.speed = speed;
    
}

public static void main(String[] args) {
    //create two athletes      //print their names, bibNumbers, and the location of their race. }
    Athlete athlete1 = new Athlete("abcdefghijklmnopqrstuvwxyz",64);
    Athlete athlete2 = new Athlete("zyxwvutsrqponmlkjihgfedcba",65);
    System.out.println(athlete1.name);
    System.out.println(athlete1.bibNumber);
    System.out.println(athlete1.raceLocation);
    System.out.println(athlete2.name);
    System.out.println(athlete2.bibNumber);
    System.out.println(athlete2.raceLocation);
} 
}

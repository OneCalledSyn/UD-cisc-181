public class mainclass {
public static void main(String[] args){
Creature Fluffy = new Creature (3);
System.out.println(Creature.NumberinHerd());
System.out.println(Fluffy.getMood());
Creature Bob = new Creature(0, "Bob");
System.out.println(Creature.NumberinHerd());
System.out.println(Bob.getMood());
Creature Killer = new Creature("Killer");
System.out.println(Creature.NumberinHerd());
System.out.println(Killer.getMood());
}
}


public class Creature {
private int currentmood = 2;
private String name = "Noname";
private static int creaturecount = 0;
private String[] moods = {"massively depressed","bored stiff","marginally happy", "ecstatic"};

public Creature() {
creaturecount++;
}
public Creature(int mood) {
currentmood = mood;
creaturecount++;
}
public Creature(String Creaturename) {
name = Creaturename;
creaturecount++;
}
public Creature(int mood, String Creaturename) {
currentmood = mood;
name = Creaturename;
creaturecount++;
}
public String getMood() {
return (name +"'s current mood is "+moods[currentmood]);
}
public static String NumberinHerd(){
return ("The current number of creatures is " + creaturecount);
}
}

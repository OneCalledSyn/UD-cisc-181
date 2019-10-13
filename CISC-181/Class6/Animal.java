public class Animal {
    public boolean isaPet;
    public String name;

    public Animal() {
        isaPet = false;
        name = "Fred";
    }

    public Animal (boolean pet, String name) {
        isaPet = true;
        this.name = name;
    }

    public void sleep() {
        System.out.println("Snore snore");
    }

    public void talk() {
        System.out.println("talking");
    }


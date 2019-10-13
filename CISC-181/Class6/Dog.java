public class Dog extends Animal {
    public String breed;

    public Dog() {
        super();
        breed = "Mutt";
    }

    public Dog (String name, String breed) {
        this(true, name, breed);
    }

    public Dog (boolean pet, String name, String breed) {
        super(pet, name);
        this.breed = breed;
    }

    public void move() {
        System.out.println("Frolicking forward");
    }
}
public class Dog extends Animal {
    boolean isaDog = true;
    public Dog(){
    super();
    }
    public Dog(String name) {
        super(true, name);
    }
    public Dog(boolean pet, String name) {
        super(pet, name);
    }
    public void talk() {
    System.out.println("bark bark");
    }
}

public class Main{
    public static void main(String[] args) {
        Dog a_dog = new Dog("Spot");
        a_dog.talking();
    }
}


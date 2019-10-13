abstract class Animal {
    public boolean isaPet;
    public String name;

    public Animal() {
        this(true,"Fred");
    }
    public Animal(boolean pet, String name) {
        isaPet = pet;
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public abstract void talk();

    public void talking() {
        System.out.print(“The animal says ");
        talk();
        System.out.println(“ and then it is quiet.”)
    }
}

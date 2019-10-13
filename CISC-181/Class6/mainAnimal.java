public class mainAnimal {
    public static void main(String[] args) {
        Animal an_x = new Animal();
        System.out.println(an_x.name);
        System.out.println(an_x.isaPet);
        an_x.sleep();
        an_x.talk();

        Dog a_dog = new Dog("Spot", "pug");
        System.out.println(a_dog.name);
        System.out.println(a_dog.isaPet);
        System.out.println(a_dog.breed);
        a_dog.sleep();
        a_dog.talk();
        a_dog.move();
    }
}
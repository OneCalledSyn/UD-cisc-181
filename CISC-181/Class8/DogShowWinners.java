public static void main(String[] args) {
    ArrayList<Dog> DogShowWinners = new ArrayList();
    DogShowWinners.add(new Dog("Spot"));
    DogShowWinners.add(new Dog("Fang"));
    DogShowWinners.add(new Dog("Puppy"));
    DogShowWinners.add(new Dog("Bernice"));
    DogShowWinners.add(new Dog("Sandy"));
    System.out.println("List size? "+DogShowWinners.size());
    DogShowWinners.add(2,new Dog("Prince"));
    for (Dog x: DogShowWinners) {
	    System.out.println(x.getName());
    }
}
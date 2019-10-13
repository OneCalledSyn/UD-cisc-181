public class Cow implements AnimalInterface{
	public Cow() {
	}
	public String talks(){
		return("moo moo");
	}
	public String eats(){
		return("Eats grass");
	}
	public String moves(){
		return("rarely runs");
	}
}



public static void main(String[] args) {
	AnimalInterface[] arr = new AnimalInterface[3];
	arr[0] = new Cow();
	arr[1] = new Cat();
	arr[2] = new Bunny();
	for (AnimalInterface x: arr) {
		System.out.println(x.talks());
		System.out.println(x.moves());
		System.out.println(x.eats());
	}
}

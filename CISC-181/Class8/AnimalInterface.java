public interface AnimalInterface {
    abstract public String talks();
    abstract public String eats();
    abstract public String moves();
}

class Cat implements AnimalInterface {
    public Cat() {
    }
    public String talks(){
	    return("meow meow");
    }
    public String eats(){
	    return("Eats mice");
    }
    public String moves(){
	    return("prowls");
    }
}



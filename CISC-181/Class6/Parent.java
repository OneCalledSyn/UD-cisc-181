public class Parent {
    int phonenum;
    String firstname;
    String lastname;
    char gender;
    Child child;

    public Parent(int phonenum, String firstname, String lastname, char gender) {
        this.phonenum = phonenum;
        this.firstname = firstname;
        this.lastname = lastname;
        this.gender = gender;
        this.child = null;

    }

    public void makeChild() {
        Random r = new Random();
        int x = r.nextInt(2);
        if (x==0) {
            String first = JoptionPane.showInputDialog("What is the boy's name?");
            child = new Child(first, lastname, "boy", 0, this);
        }
        else {
            String first = JOptionPane.showInputDialog("What is the girl's name?");
            child = new Child(first, lastname, "girl", 0, this);
        }
    }
}
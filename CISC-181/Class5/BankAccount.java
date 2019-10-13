public class BankAccount {
private String name;
private double balance;
private double interest;

public BankAccount(String n){
name = n;
balance = 0;
setInterest();
}
public BankAccount(String n, double B) {
name = n;
 balance = B;
setInterest();
}
public void setInterest() {
if (balance > 100000.0) {
interest = .25;
}
else if (balance > 10000.0) {
interest = .15;
}
else if (balance > 500.0) {
interest = .075;
}
else {
interest = 0.0;
}
}
public void deposit(double m) {
balance += m;
setInterest();
}
public void withdraw(double m) {
balance -= m;
setInterest();
}
public void calcInterest() {
balance += (balance * interest);
setInterest();
}
public String toString(){
String s = name+": "+(double)((int)(balance*100))/100;
return s;
}
}

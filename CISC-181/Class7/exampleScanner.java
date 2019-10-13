Scanner in = new  Scanner(System.in);
System.out.println("Enter an int, a float, a double and a string.");
System.out.println("Separate each with a blank or return.");
int x1 = in.nextInt();
float f1 = in.nextFloat();
double d1 = in.nextDouble();
String s1 = in.nextLine();
System.out.println("Now enter another value.");
String s2 = in.next();
System.out.println("Here is what you entered: ");
System.out.println(x1 + " " + f1 + " " + d1 + " " + s1 + " and " + s2);
in.close();


/**Enter an int, a float, a double and a string.
Separate each with a blank or return.
2  3.1  3.24  hi there how are you
Now enter another value.
no
Here is what you entered:
2 3.1 3.24  hi there how are you and no
*/
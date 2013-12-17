class MyBaseClass {}

public class MyTestClass extends MyBaseClass {

public static void main (String args[]) {
	MyTestClass v = new MyTestClass();

	boolean r1 = v instanceof MyTestClass;
	boolean r2 = v instanceof MyBaseClass;

	System.out.println(r1 + " " + r2);
}
}

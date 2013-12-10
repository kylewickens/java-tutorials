public class LocalVariable {
public void doSomething() {
	int something = 0;
	something += 85;
	System.out.println("Value of something: " + something);
}

public static void main(String args[]) {
	LocalVariable test = new LocalVariable();
	test.doSomething();
}
}

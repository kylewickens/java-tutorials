import java.io.*;

public class StaticVariables {
private static int age;
public static final String NAME = "Kyle ";

public static void main(String args[]) {
	age = 38;
	System.out.println(NAME + "age is: " + age);
}
}

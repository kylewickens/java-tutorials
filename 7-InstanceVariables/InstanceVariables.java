import java.io.*;

public class InstanceVariables {
// this instance variable has full visiblity
public String name;

// this instance variable is visible inside this class only
private int age;

// name and age is assigned in the constructor
public InstanceVariables(String namex, int agex) {
	name = namex;
	age = agex;
}

// age variable is visible only to this object
public int getAge() {
	return age;
}

// print out information
public void printInfo() {
	System.out.println("name : " + name);
	System.out.println("age  : " + age);
}

public static void main(String args[]) {
	InstanceVariables one = new InstanceVariables("kyle", 38);
	one.printInfo();
}
}

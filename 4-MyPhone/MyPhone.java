public class MyPhone {

String phoneColour;

public MyPhone() {
	System.out.println("Phone type is: unknown");
}

public MyPhone(String name) {
	System.out.println("Phone type is: " + name);
}

public void setColour(String colour) {
	phoneColour = colour;
}

public String getColour() {
	System.out.println("Phone colour is: " + phoneColour);
	return phoneColour;
}

public static void main(String[] args) {
// object creation
	MyPhone myPhone = new MyPhone("Samsung Galaxy S3 Mini");
// call class method to set phone colour
	myPhone.setColour("black");
// call class method to get phone colour
	myPhone.getColour();
// access instance variable
	System.out.println("Instance Variable Value: " + myPhone.phoneColour);
}
}

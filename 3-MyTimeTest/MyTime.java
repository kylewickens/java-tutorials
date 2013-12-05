public class MyTime {
int seconds;

public void MyTime() {
	reset();
}

public void MyTime(int newValue) {
	seconds = newValue;
}

void reset() {
	seconds = 0;
}

void addMinutes(int increment) {
	addSeconds(60 * increment);
}

void addSeconds(int increment) {
	seconds += increment;
}

void decMinutes(int decrement) {
	decSeconds(60 * decrement);
}

void decSeconds(int decrement) {
	seconds -= decrement;
}

void printInfo() {
	System.out.println("seconds: " + seconds);
}
}

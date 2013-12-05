class MyTimeTest {
	public static void main(String[] args) {
		MyTime time1 = new MyTime();
		MyTime time2 = new MyTime();

		time1.addSeconds(10);
		time1.addMinutes(20);
		time1.printInfo();

		time2.addSeconds(30);
		time2.addMinutes(40);
		time2.printInfo();
	}
}

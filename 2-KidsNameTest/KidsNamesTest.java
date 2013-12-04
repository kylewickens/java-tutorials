class KidsNames {

enum KidsNamesName { DANIEL, SAMUEL, KYLE, LEIA, RONALD, JAYNE }
KidsNamesName name;

void print() {
	if (name == KidsNamesName.DANIEL)
		System.out.println("DANIEL");
	else if (name == KidsNamesName.SAMUEL)
		System.out.println("SAMUEL");
	else if (name == KidsNamesName.KYLE)
		System.out.println("KYLE");
	else if (name == KidsNamesName.LEIA)
		System.out.println("LEIA");
	else if (name == KidsNamesName.RONALD)
		System.out.println("RONALD");
	else if (name == KidsNamesName.JAYNE)
		System.out.println("JAYNE");
}
}

public class KidsNamesTest {

public static void main(String args[]) {
	KidsNames test = new KidsNames();
	test.name = KidsNames.KidsNamesName.SAMUEL;
	test.print();
}
}

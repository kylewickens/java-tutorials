public class MySwitchStatement {

public static void main(String args[]) {
	char c = args[0].charAt(0);

	switch (c) {
	case 'A':
		System.out.println("A - on the command line");
		break;
	case 'B':
	case 'C':
	case 'D':
		System.out.println("B, C or D - on the command line");
	case 'E':
	case 'F':
		System.out.println("may be E or F - on the command line");
		break;
	default:
		System.out.println(c + " - on the command line");
	}
}
}

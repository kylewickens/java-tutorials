import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.BitSet;

class BitSetTest {
public static void main(String[] args) throws FileNotFoundException, IOException {
	BitSet bits1 = fromString("1000001");
	BitSet bits2 = fromString("1111111");

	displayString(bits1);
	displayString(bits2);

	bits2.and(bits1);

	System.out.println(toString(bits2));
}

private static BitSet fromString(final String s) {
	return BitSet.valueOf(new long[] { Long.parseLong(s, 2) });
}

private static String toString(BitSet bs) {
	return Long.toString(bs.toLongArray()[0], 2);
}

private static void displayString(final BitSet bits) {
	System.out.println(toString(bits));
}
}

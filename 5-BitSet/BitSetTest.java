/***************************************************************************
*
* Project: MyJavaTutorials
*
* Copyright (c) 2012 - 2014, Kyle Wickens, <kylewickens@gmail.com>, et al.
*
* This software is licensed as described in the file COPYING, which you
* should have received as part of this distribution. The terms are also
* available at http://kylewickens.blogspot.co.uk/p/copyright-license.html.
*
* You may opt to use, copy, modify, merge, publish, distribute and/or sell
* copies of the Software, and permit persons to whom the Software is
* furnished to do so, under the terms of the COPYING file.
*
* This software is distributed on an "AS IS" basis, WITHOUT WARRANTY OF ANY
* KIND, either express or implied.
*
***************************************************************************/
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

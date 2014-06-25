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
public class MyMethodsVoidDemo {
	public static void printTest(char c) {
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

	public static void main(String[] args) {
		if (args.length > 0) {
			char c = args[0].charAt(0);

			printTest(c);
		}
	}
}

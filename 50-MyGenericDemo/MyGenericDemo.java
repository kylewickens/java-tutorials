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

class MyGenericDemo {
	public static<E> void printAll(String title, E[] input) {
		System.out.println(title);
		for (E element : input) {
			System.out.print(element + " ");
		}
		System.out.println("\n"); // double new line
	}

	public static void main(String[] args) {
		String[]    stringArray    = { "Beagle", "Bulldog", "Boxer", "Dachshund", "Rottweiler", "Pug", "Schipperke", "Beauceron", "Kuvasz", "Landseer" };
		Double[]    doubleArray    = { 0.1, 0.2, 0.3, 0.4, 0.5, 0.6, 0.7 };
		Integer[]   integerArray   = { 1, 2, 3, 4, 5, 6, 7 };
		Character[] characterArray = { '1', '2', '3', '4', '5', '6', '7' };

		printAll("The contents of stringArray:", stringArray);
		printAll("The contents of doubleArray:", doubleArray);
		printAll("The contents of integerArray:", integerArray);
		printAll("The contents of characterArray:", characterArray);
	}
}

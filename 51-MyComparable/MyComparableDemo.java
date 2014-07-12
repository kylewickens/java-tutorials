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
class MyComparableDemo {
	public static<T extends Comparable<T>> T minimum (T x, T y, T z) {
		T min = x;
		if (y.compareTo(min) < 0) {
			min = y;
		}
		if (z.compareTo(min) < 0) {
			min = z;
		}
		return min;
	}

	public static void main(String[] args) {
		System.out.println("Min of 3, 4, 5 is " + minimum(5, 4, 3));
		System.out.println("Min of 2.1, 2.2, 2.3 is " + minimum(2.3, 2.2, 2.1));
		System.out.println("Min of Dachshund, Rottweiler, Pug is " + minimum("Dachshund", "Rottweiler", "Pug"));
	}
}

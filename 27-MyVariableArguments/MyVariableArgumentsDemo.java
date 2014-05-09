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
import java.lang.IllegalArgumentException;

public class MyVariableArgumentsDemo {

public static double min(double x, double y) {
	return x < y ? x : y;
}

public static double min(double... numbers) throws IllegalArgumentException {
	if (numbers.length == 0) {
		throw new IllegalArgumentException("required some arguments");
	}

	double minimum = numbers[0];

	for (int i = 1; i < numbers.length; i ++) {
		minimum = min(minimum, numbers[i]);
	}

	return minimum;
}

public static void main(String[] args) {
	try {
		System.out.println("Minimum is " + min(4.5, 3.3, 2.7, 1.4));
		System.out.println("Minimum is " + min(new double[] {4.8, 3.7, 2.6, 1.5}));
		System.out.println("Minimum is " + min());
	} catch (IllegalArgumentException e) {
		System.err.println("IllegalArgumentException: " + e.getMessage());
	}
}
}

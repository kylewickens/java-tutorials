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
public class MyMethodsParametersDemo {
	public static void jumbleNumbers(int n1, int n2, int n3) {
		System.out.println("original order: " + n1 + ", " + n2 + ", " + n3);

		int t = n1;
		n1 = n2;
		n2 = n3;
		n3 = t;

		System.out.println("new order     : " + n1 + ", " + n2 + ", " + n3);
	}

	public static void main(String[] args) {
		int n1 = 10;
		int n2 = 20;
		int n3 = 30;

		jumbleNumbers(n1, n2, n3);
		jumbleNumbers(n1, n2, n3);
	}
}

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
import java.util.Stack;
import java.util.EmptyStackException;

class MyStackDemo {
	static void push(Stack<String> st, String newValue) {
		st.push(newValue);
		System.out.println("push("+ newValue +") : " + st);
	}

	static String pop(Stack<String> st) {
		String lastValue = st.pop();
		System.out.println(lastValue + " = pop() : " + st);
		return lastValue;
	}

	public static void main(String[] args) {
		try {
			String lastValue;
			Stack<String> st = new Stack<String>();

			push(st, "Beagle");
			push(st, "Bulldog");
			push(st, "Boxer");
			push(st, "Dachshund");
			push(st, "Rottweiler");
			push(st, "Pug");
			push(st, "Schipperke");
			push(st, "Beauceron");
			push(st, "Kuvasz");
			push(st, "Landseer");

			lastValue = pop(st);
			lastValue = pop(st);
			lastValue = pop(st);
			lastValue = pop(st);
			lastValue = pop(st);
			lastValue = pop(st);
			lastValue = pop(st);
			lastValue = pop(st);
			lastValue = pop(st);
			lastValue = pop(st);
			lastValue = pop(st);
		} catch (EmptyStackException e) {
			System.err.println(e.getClass().getName() + ": " + e.getMessage());
			e.printStackTrace();
		}
	}
}

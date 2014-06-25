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
import java.io.*;

public class InstanceVariables {
// this instance variable has full visiblity
	public String name;

// this instance variable is visible inside this class only
	private int age;

// name and age is assigned in the constructor
	public InstanceVariables(String namex, int agex) {
		name = namex;
		age = agex;
	}

// age variable is visible only to this object
	public int getAge() {
		return age;
	}

// print out information
	public void printInfo() {
		System.out.println("name : " + name);
		System.out.println("age  : " + age);
	}

	public static void main(String args[]) {
		InstanceVariables one = new InstanceVariables("kyle", 38);
		one.printInfo();
	}
}

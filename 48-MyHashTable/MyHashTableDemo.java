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
import java.util.Hashtable;

class MyHashTableDemo {
	public static void main(String[] args) {
		Hashtable<String, Integer> myHashTable = new Hashtable<String, Integer>();

		myHashTable.put("Beagle", new Integer(1));
		myHashTable.put("Bulldog", new Integer(2));
		myHashTable.put("Boxer", new Integer(3));
		myHashTable.put("Dachshund", new Integer(4));
		myHashTable.put("Rottweiler", new Integer(5));
		myHashTable.put("Pug", new Integer(6));
		myHashTable.put("Schipperke", new Integer(7));
		myHashTable.put("Beauceron", new Integer(8));
		myHashTable.put("Kuvasz", new Integer(9));
		myHashTable.put("Landseer", new Integer(10));

		System.out.println(myHashTable);

		final String NAME = "Schipperke";
		int value = myHashTable.get(NAME).intValue();
		System.out.println(NAME + " = " + value);
	}
}

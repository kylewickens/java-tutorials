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
import java.util.HashMap;

class MyHashMapDemo {
	public static void main(String[] args) {
		HashMap<String, Integer> myHashMap = new HashMap<String, Integer>();

		myHashMap.put("Beagle", new Integer(1));
		myHashMap.put("Bulldog", new Integer(2));
		myHashMap.put("Boxer", new Integer(3));
		myHashMap.put("Dachshund", new Integer(4));
		myHashMap.put("Rottweiler", new Integer(5));
		myHashMap.put("Pug", new Integer(6));
		myHashMap.put("Schipperke", new Integer(7));
		myHashMap.put("Beauceron", new Integer(8));
		myHashMap.put("Kuvasz", new Integer(9));
		myHashMap.put("Landseer", new Integer(10));

		System.out.println(myHashMap);

		final String NAME = "Schipperke";
		int value = myHashMap.get(NAME).intValue();
		System.out.println(NAME + " = " + value);
	}
}

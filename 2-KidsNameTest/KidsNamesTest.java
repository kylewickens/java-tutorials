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
class KidsNames {

enum KidsNamesName { DANIEL, SAMUEL, KYLE, LEIA, RONALD, JAYNE }
KidsNamesName name;

void print() {
	if (name == KidsNamesName.DANIEL)
		System.out.println("DANIEL");
	else if (name == KidsNamesName.SAMUEL)
		System.out.println("SAMUEL");
	else if (name == KidsNamesName.KYLE)
		System.out.println("KYLE");
	else if (name == KidsNamesName.LEIA)
		System.out.println("LEIA");
	else if (name == KidsNamesName.RONALD)
		System.out.println("RONALD");
	else if (name == KidsNamesName.JAYNE)
		System.out.println("JAYNE");
}
}

public class KidsNamesTest {

public static void main(String args[]) {
	KidsNames test = new KidsNames();
	test.name = KidsNames.KidsNamesName.SAMUEL;
	test.print();
}
}

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
import java.io.File;

class MyDirectoryListingDemo {
	public static void main(String[] args) {
		if (args.length == 1) {
			File f1 = new File(args[0]);

			if (f1.isDirectory()) {
				System.out.println(args[0] + " is a directory.");
				String[] s = f1.list();

				for (int i = 0; i < s.length; i ++) {
					File f2 = new File(args[0] + "/" + s[i]);
					if (f2.isDirectory()) {
						System.out.println(s[i] + " is a directory.");
					} else {
						System.out.println(s[i] + " is a file.");
					}
				}
			} else {
				System.out.println(args[0] + " is not a directory.");
			}
		}
	}
}

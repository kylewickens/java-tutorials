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
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;

class MyFileReadWriteDemo {
	public static void main(String[] args) {
		if (args.length == 1) {
			File f = new File(args[0]);

			try {
				f.createNewFile();
			} catch (IOException e) {
				e.getMessage();
			}

			try {
				FileWriter w = new FileWriter(f);
				w.write("Welcome to kylewickens.blogspot.co.uk\n");
				w.close();
			} catch (IOException e) {
				e.getMessage();
			}

			try {
				char[] data = new char[100];

				FileReader r = new FileReader(f);
				r.read(data);
				r.close();

				System.out.print(data);
			} catch (FileNotFoundException e) {
				e.getMessage();
			} catch (IOException e) {
				e.getMessage();
			}
		}
	}
}

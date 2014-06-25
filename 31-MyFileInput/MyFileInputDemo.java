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
import java.io.IOException;
import java.io.FileInputStream;

class MyFileInputDemo {
	public static void main(String[] args) {
		if (args.length == 1) {
			File file = new File(args[0]);
			FileInputStream input = null;

			try {
				input = new FileInputStream(file);

				System.out.println("Total file size (in bytes) : " + input.available());

				int content;
				while ((content = input.read()) != -1) {
					System.out.print((char) content);
				}
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				try {
					if (input != null)
						input.close();
				} catch (IOException ex) {
					ex.printStackTrace();
				}
			}
		}
	}
}

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
import java.io.IOException;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

class MyMemoryFileDemo {
	public static void main(String[] args) throws IOException {
		ByteArrayOutputStream output = new ByteArrayOutputStream(20);

		while (output.size() < 20) {
			output.write(System.in.read());
		}

		ByteArrayInputStream input = new ByteArrayInputStream(output.toByteArray());

		System.out.println("Print the contents of the byte array input stream");

		int c = 0;
		while ((c = input.read()) != -1) {
			System.out.print((char)c);
		}
	}
}

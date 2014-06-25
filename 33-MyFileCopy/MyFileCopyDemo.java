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
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.DataInputStream;
import java.io.FileOutputStream;
import java.io.DataOutputStream;
import java.io.FileNotFoundException;

class MyFileCopyDemo {
	public static void main(String[] args) {
		if (args.length == 2) {
			DataInputStream inp = null;
			DataOutputStream out = null;

			try {
				FileInputStream ifn = new FileInputStream(args[0]);
				FileOutputStream ofn = new FileOutputStream(args[1]);

				inp = new DataInputStream(ifn);
				out = new DataOutputStream(ofn);

				try {
					byte data;
					while (true) {
						byte by = inp.readByte();
						out.writeByte(by);
					}
				} catch (EOFException e) {

				}
			} catch (FileNotFoundException e) {

			} catch (IOException e) {

			} finally {
				try {
					if (inp != null) {
						inp.close();
					}
					if (out != null) {
						out.close();
					}
				} catch (IOException e) {

				}
			}
		}
	}
}

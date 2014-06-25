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
import java.lang.Exception;

class MyException extends Exception {
	public MyException() {
	}
}

class MyTestException {
	MyTestException(String test) throws MyException {
		if (test.equals("fire")) throw new MyException();
	}
}

class MyExceptionsDemo {
	public static void main(String[] args) {
		if (args.length == 1) {
			try {
				MyTestException t = new MyTestException(args[0]);
			} catch (MyException e) {
				System.err.println("caught the exception");
			}
		}
	}
}

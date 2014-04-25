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
class MyFinalizeDemo {
	public static void main(String[] args) {
//		Runtime.runFinalizersOnExit(true);

		MyTime time1 = new MyTime();
		MyTime time2 = new MyTime();

		time1.addSeconds(10);
		time1.addMinutes(20);
		time1.printInfo();

		time2.addSeconds(30);
		time2.addMinutes(40);
		time2.printInfo();
	}
}

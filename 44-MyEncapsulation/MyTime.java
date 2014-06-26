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
public class MyTime {
	private int seconds;

	public void MyTime() {
		reset();
	}

	public void MyTime(int newValue) {
		setSeconds(newValue);
	}

	void reset() {
		seconds = 0;
	}

	int  getSeconds() {
		return seconds;
	}

	void setSeconds(int newValue) {
		seconds = newValue;
	}

	void addSeconds(int increment) {
		seconds += increment;
	}

	void decSeconds(int decrement) {
		seconds -= decrement;
	}

	void addMinutes(int increment) {
		addSeconds(60 * increment);
	}

	void decMinutes(int decrement) {
		decSeconds(60 * decrement);
	}

	void printInfo() {
		System.out.println("seconds: " + seconds);
	}
}

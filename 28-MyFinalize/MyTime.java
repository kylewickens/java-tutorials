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
public class MyTime{
int seconds;

public void MyTime() {
	reset();
}

public void MyTime(int newValue) {
	seconds = newValue;
}

@Override
protected void finalize() throws Throwable
{
	try {
		System.out.println("finalize has been called and seconds: " + seconds);
	} catch (Throwable t) {
		throw t;
	} finally {
		super.finalize();
	}
}

public void reset() {
	seconds = 0;
}

public void addMinutes(int increment) {
	addSeconds(60 * increment);
}

public void addSeconds(int increment) {
	seconds += increment;
}

public void decMinutes(int decrement) {
	decSeconds(60 * decrement);
}

public void decSeconds(int decrement) {
	seconds -= decrement;
}

public void printInfo() {
	System.out.println("seconds: " + seconds);
}
}

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
class MyGenericClassDemo<T> {
	public T myValue;

	public void add(T myValue) {
		this.myValue = myValue;
	}

	public T get() {
		return myValue;
	}

	public static void main(String[] args) {
		MyGenericClassDemo<String> strValue = new MyGenericClassDemo<String>();
		MyGenericClassDemo<Integer> intValue = new MyGenericClassDemo<Integer>();

		intValue.add(new Integer(50));
		strValue.add(new String("http://kylewickens.blogspot.co.uk/"));

		System.out.println(strValue.get() + " " + intValue.get());
	}
}

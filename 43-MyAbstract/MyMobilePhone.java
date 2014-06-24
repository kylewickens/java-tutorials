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
public class MyMobilePhone extends MyPhone {
	public MyMobilePhone() {
		super("Samsung Galaxy S3 Mini");
	}

	public Boolean isNFC() {
		System.out.println("Phone NFC capable");
		return true;
	}

	public Boolean isAndroid() {
		System.out.println("Phone Android capable");
		return true;
	}
}

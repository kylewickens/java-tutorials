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
class MyAbstractDemo {
	public static void main(String[] args){
// object creation
		MyMobilePhone myPhone = new MyMobilePhone();
// call class method to set phone colour
		myPhone.setColour("black");
// call class method to get phone colour
		myPhone.getColour();
// call abstract class method to get Android functionality
		myPhone.isAndroid();
// call abstract class method to get NFC functionality
		myPhone.isNFC();
	}
}

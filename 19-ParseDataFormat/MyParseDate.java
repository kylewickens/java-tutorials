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
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class MyParseDate {
	public static void main(String args[]) {
		SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd");
		String date = args.length == 0 ? "2014-12-10" : args[0];

		try {
			Date t = ft.parse(date);
			System.out.println(date + " parses as " + t);
		} catch (ParseException e) {
			System.err.println("Oops " + ft);
		}
	}
}

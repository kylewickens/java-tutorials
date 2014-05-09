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
import java.io.File;
import java.io.FileFilter;
import java.util.List;
import java.util.ArrayList;

public class MyScanFiles {
	public void MyScanFiles() {}

	public void ScanAll(String path, Boolean hidden) {
		try {
			ScanAgain(path, hidden);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private void ScanAgain(String path, Boolean hidden) {
		try {
			if (!hidden && ScanNOMEDIA(path)) {

			} else {
				File dir = new File(path);

				File[] files = dir.listFiles();

				for (File file : files) {
					if (file.isFile()) {
						Boolean found = true;

						if (file.getAbsolutePath().matches(".*\\.jpg")
							|| file.getAbsolutePath().matches(".*\\.jpeg")
							|| file.getAbsolutePath().matches(".*\\.bmp")
							|| file.getAbsolutePath().matches(".*\\.gif")
							|| file.getAbsolutePath().matches(".*\\.png")) {
							System.out.println("F: " + file.getAbsolutePath());
						} else {
							found = false;
						}

						if (found) {

						}
					} else if (file.isDirectory()) {
						ScanAgain(file.getAbsolutePath(), hidden);
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void ScanJPG(String path) {
		try {
			File dir = new File(path);

			FileFilter filter = new FileFilter() {
				@Override
				public boolean accept(File file) {
					return file.getAbsolutePath().matches(".*\\.jpg");
				}
			};
		
			File[] images = dir.listFiles(filter);
			for (File image : images) {
				System.out.println("F: " + image.getAbsolutePath());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void ScanDir(String path) {
		try {
			File dir = new File(path);

			File[] files = dir.listFiles();
			for (File file : files) {
				if (file.isDirectory()) {
					System.out.println("D: " + file.getAbsolutePath());
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public Boolean ScanNOMEDIA(String path) {
		try {
			File dir = new File(path);

			FileFilter filter = new FileFilter() {
				@Override
				public boolean accept(File file) {
					return file.getAbsolutePath().matches(".*\\.nomedia");
				}
			};

			File[] images = dir.listFiles(filter);
			for (File image : images) {
				System.out.println("F: " + image.getAbsolutePath());
				return true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return false;
	}
}

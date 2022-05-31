package org.system;

import java.awt.Toolkit;

public class Desktop extends Computer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Desktop d=new Desktop();
     d.computerModel();
     d.desktopSize();
	}

	public void desktopSize() {
		// TODO Auto-generated method stub
	  System.out.println("My desktop size is " +Toolkit. getDefaultToolkit(). getScreenSize());
	}

}

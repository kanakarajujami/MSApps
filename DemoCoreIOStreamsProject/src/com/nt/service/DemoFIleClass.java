package com.nt.service;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class DemoFIleClass {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
		 try(sc;) {
			    System.out.println("enter the file path and name");
			 File file=new File(sc.nextLine());
			 FileInputStream fis=new FileInputStream(file);
			 FileOutputStream fos=new FileOutputStream("D:/images/kanakaraju.img");
			 int num;
			                    while((num=fis.read())!=1) {
			                    	    fos.write(num);
			                    	    fos.flush();
			                    }
			                    System.out.println("file copied successfully.....");
			                    fis.close();
			                    fos.close();
			 
			    
		 }//end of try with resource

	}

}

package p1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class DemoMainClass {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
				
    try(sc){
    	/*System.out.println("ENter the file path and name:");
    	FileReader reader=new FileReader(new File(sc.nextLine()));
    FileWriter writer=new FileWriter("C:/resumes/kanaka.pdf");
    int num;
    while((num=reader.read())!=1) {
    	   writer.write(num);
    }
    System.out.println("file copied successfully");
    }*/
    	//=========================================
    	//System.out.println("ENter the file path and name:");
    BufferedReader reader=new BufferedReader(new FileReader("D:/resumes/sample.txt"));
    FileWriter writer=new FileWriter("C:/resumes/sample4.txt");
    int num;
    while((num=reader.read())!=1) {
    	   writer.write(num);
    	   writer.flush();
    }
    System.out.println("file copied successfully");
    	reader.close();
    	writer.close();
    }
    
	}

}

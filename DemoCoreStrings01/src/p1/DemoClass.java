package p1;

import java.util.Scanner;
import java.util.StringTokenizer;

public class DemoClass {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try(sc;){
			    System.out.println("Enter the String :");
			    String str=sc.nextLine().toLowerCase();
			    StringTokenizer tokenizer=new StringTokenizer(str," ");
			    while(tokenizer.hasMoreElements()) {
			    	       String token=tokenizer.nextToken();
			    	       StringBuffer buffer=new StringBuffer(token);
			    	             char c=token.charAt(0);
			    	             if(c=='a' || c=='i' || c=='o' || c=='u' || c=='e' ) {
			    	            	 buffer.reverse();
			    
			    	             }
			    	             System.out.print(buffer.toString()+" ");
			    	
			    }//end of while
		}//end of try
		}

}

package bam;
import java.util.Scanner;

public class Bam {

		 public static void main(String[] args) {
		        // TODO Auto-generated method stub
		        String []Classes={"English","Science","Math","History","Arts"};
		        Scanner scan=new Scanner(System.in);
		        
		        
		        System.out.println("Enter the subject you are looking for");
		        String Subject=scan.next();
		        String check="no match found";
		        
		        for (int i=0; i<Classes.length;i++)
		        {
		            if (Subject.equals(Classes[i]))
		            {
		                check="Match found";
		            }
		            else {System.out.println(check);
		        }
		        
		    }
		 }
}
		


		
		
	
	



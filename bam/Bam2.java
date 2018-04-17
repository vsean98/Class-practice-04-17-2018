package bam;
import java.util.Scanner;
public class Bam2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int [] List=new int [3];
		Scanner scan=new Scanner(System.in);
		    System.out.println("Key in 3 different numbers");
		    int num1=scan.nextInt();
		    int num2=scan.nextInt();
		    int num3=scan.nextInt();
		    if((num1>num2)&&(num2>num3))
		    {
		        System.out.println(num1+ " Is the largest");
		        System.out.println(num3+" Is smallest");
		    }
		    else if((num1>num3)&&(num3>num2))
		    {
		        System.out.println(num1+ " Is the largest");
		        System.out.println(num2+" Is smallest");
		    }
		    else if((num2>num1)&&(num1>num3))
		    {
		        System.out.println(num2+ "Is the largest");
		        System.out.println(num3+" Is smallest");
		    }
		    else if((num2>num3)&&(num3>num1))
		    {
		        System.out.println(num2+ " Is the largest");
		        System.out.println(num1+" Is smallest");
		    }
		    else if((num3>num1)&&(num1>num2))
		    {
		        System.out.println(num3+ " Is the largest");
		        System.out.println(num2+" Is smallest");
		    }
		    else if((num3>num2)&&(num2>num1))
		    {
		        System.out.println(num3+ " Is the largest");
		        System.out.println(num1+" Is smallest");
		    }
		    else {System.out.print("Error");}
		    }

		






	}



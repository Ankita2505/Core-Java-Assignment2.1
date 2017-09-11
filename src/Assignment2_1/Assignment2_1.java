package Assignment2_1;
//program to find the highest among the given 3 numbers
import java.util.Scanner;
public class Assignment2_1 
{
	public static void main(String[] args) //Start of Main Class
	{
		// TODO Auto-generated method stub
		int a,b,c,highest_num;
		Scanner s=new Scanner(System.in);//creating objects of scanner class
		System.out.println("Enter any three numbers: "); // User input for 3 Numbers
		a=s.nextInt();
		b=s.nextInt();
		c=s.nextInt();
		s.close();
		highest_num=(a>b)?(a>c?a:c):(b>c?b:c); // Checking Highest Number Between 3 user input number  using Conditional Operator and Relational Operators
		System.out.println("Highest number is : "+highest_num);
	}// Close of Main Class
}

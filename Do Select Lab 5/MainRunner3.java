package lab5;
import java.util.Scanner;

public class MainRunner3 {
public static void main(String[] args) {
		
		System.out.println("Enter the salary");		
		Scanner sc = new Scanner(System.in);
		
		int salary = sc.nextInt();
		try {
			if(salary<3000)
			{
				throw new EmployeeException("Exception");
			}
			System.out.println("Salary is = "+salary);
		}
		catch(EmployeeException e)
		{
			System.out.println("Salary is below 3000");
		}
	}
	

}

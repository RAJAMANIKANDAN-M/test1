package javaProject.samples;
import java.lang.String;

/*
public class voterid {
	
	public void verifi(int age , String country )
	{
		int bal= 18 - age;
		if(( age>=18 ) )
		{
			//System.out.println("you are eligible to vote");
			if(( country == "india")) 
			 {
			 System.out.println("you are eligible for vote");
				
			}
			else
			{
				System.out.println("you are not a indian citizen");
			}
		}
		else
		{
			System.out.println("you are waite "+ bal + " more years");
		}
	}

	public static void main(String[] args) {
		voterid vid = new voterid();
		vid.verifi(18,"india");

	}

}
*/


/*
public class voterid {
	int a = 2024;
	int b = 0;
	int age = 0;
	
	public int dob(int ag) {
		int a = 2024;
		int age = a - ag;
		//System.out.println(b);
		return  age;
	}
	
	public void verifi(int age , String country )
	{
		int bal= 18 - age;
		if( age>= 18)
		{
			//System.out.println("you are eligible to vote");
			if(( country == "india")) 
			 {
			 System.out.println("you are eligible for vote");
				
			}
			else
			{
				System.out.println("you are not a indian citizen");
			}
		}
		else
		{
			System.out.println("you are waite "+ bal + " more years");
		}
	}

	public static void main(String[] args) {
		voterid vid = new voterid();
		//vid.dob(2010);
		vid.verifi((vid.dob(2010)),"india");

	}

}*/


public class voterid {
	
	public void verifi(int dob , String country )
	{
		int a = 2024;
		int age = a - dob;
		//System.out.println(age);
		int bal= 18 - age;
		
		if(( age>=18 ) )
		{
			//System.out.println("you are eligible to vote");
			if(( country == "india")) 
			 {
			 System.out.println("you are eligible for vote");
				
			}
			else
			{
				System.out.println("you are not a indian citizen");
			}
		}
		else
		{
			System.out.println("you are waite "+ bal + " more years");
		}
	}

	public static void main(String[] args) {
		voterid vid = new voterid();
		vid.verifi(2010,"india");
	}

}
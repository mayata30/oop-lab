import java.util.*;
class cpu
{
	int price;
	
	class processor
	{
		int nc;
		String man;
		void read()
		{
		Scanner op=new Scanner(System.in);
		Scanner op1=new Scanner(System.in);
		System.out.println("Enter price : ");
		price=op.nextInt();
		System.out.println("Enter number of cores : ");
		nc=op.nextInt();
		System.out.println("Enter manufacturer : ");
		man=op1.nextLine();
		}
		void display()
		{
			System.out.println();
			System.out.println("Displaying from processor class");
			System.out.println("number of cores "+nc);
			System.out.println("manufacturer : "+man);
			
		}
		
	}
	static class ram
	{
		static int memory;
		static String man1;
		static void read1()
		{
		Scanner op=new Scanner(System.in);
		Scanner op1=new Scanner(System.in);
		System.out.println("Enter memory size : ");
		memory=op.nextInt();
		System.out.println("Enter manufacturer : ");
		man1=op1.nextLine();
		}
		static void display2()
		{
			System.out.println();
			System.out.println("Displaying RAM class");
			System.out.println("Memory : "+memory);
			System.out.println("manufacturer : "+man1);
			 
		}
	}
	
	void display3()
	{
		//System.out.println("price : "+price); 
		System.out.println();
		processor p=new processor();
		p.read();
		p.display();
		ram.read1();
		ram.display2();
		System.out.println("price : "+price); 
	}
}
class inner
{
	public static void main(String args[])
	{
		cpu c=new cpu();
		c.display3();
	}
}
	
			

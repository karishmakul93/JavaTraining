package javaProgram;

public class addition {
	int a;
	int b;
	int c;

	public static void main(String[] args) {
		addition add=new addition();
		add.display(10, 30);
		
		

	}



	
	public int display(int a,int b)
	{
		
		
		int c = a+b;
		System.out.println("Addition is"+c);
		return c;
	}
	
	
	
	
	
}

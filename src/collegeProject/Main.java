package collegeProject;

class Test { }

class Main
{
	public static void main(String[] args)
	{
		Test tobj = null;
		if (tobj instanceof Test)
		System.out.println("tobj is instance of Test");
		else
		System.out.println("tobj is NOT instance of Test");
	}
}
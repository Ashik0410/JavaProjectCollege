package collegeProject;

public class ExplicitTest 
{ 
   double d = 100.04; 
  void conversion() 
  { 
// explicit type casting 
    long l = (long)d; 
    int i = (int)l; 
  System.out.println("Double value "+d); // fractional part lost. 
  System.out.println("Long value "+l); // fractional part lost. 
  System.out.println("Int value "+i); 
} 
public static void main(String[] args) 
{ 
	ExplicitTest obj = new ExplicitTest(); 
    obj.conversion(); 
  } 
}
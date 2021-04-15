package JavaCollection;

public class Student 
{
	int roll_no;
	String name;
	public Student()
	{
		roll_no=0;
		name="";
	}
    public Student(int r,String n) 
    {
    	roll_no=r;
    	name=n;
    }
    
    public void display()
    {
    	System.out.println("The name of the Student is "+name);
    	System.out.println("The roll number of the student is "+roll_no);
    }
}

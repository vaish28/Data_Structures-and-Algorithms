package  JavaCollection;
import java.util.*;

public class DSimplement
{
	public static void main(String[] args) 
	{
		int ch=0;
		Scanner sc = new Scanner(System.in);
		Student s = new Student();
		do {

			System.out.println("MENU for operations on collection framework");
			System.out.println("1.Stack operations");
			System.out.println("2.Arraylist operations ");
			System.out.println("3.LinkedList operations");
			System.out.println("0.Exit");
			System.out.println("Enter your choice:");
			ch=sc.nextInt();

			switch(ch)
			{
			case 1:
				int ch1=0;
				do {
					System.out.println("MENU for the operations on Stack");
					System.out.println("1.Integer operations on the Stack");
					System.out.println("2.String operations on the Stack");
					System.out.println("3.Student object operations on the Stack");
					System.out.println("0.Exit");
					System.out.println("Enter your choice:");
					ch1=sc.nextInt();

					switch(ch1)
					{
					case 1:
						//Stack for integer
						Stack<Integer> stack = new Stack<Integer>();
						for(int i=0;i<5;i++) 
						{
							stack.push(i); 
						}

						for(int i=0;i<5;i++) 
						{ 
							System.out.println(stack.pop()); 
						}

						break;
					case 2:
						//Stack for string
						Stack<String> stringstack= new Stack<String>();
						sc.nextLine();
						for(int i=0; i<5;i++)
						{
							System.out.println("Enter the string to be pushed:"); 
							String name=sc.nextLine();
							stringstack.push(name); 
						}

						System.out.println("String stack pop:");
						for(int i=0; i<5;i++) 
						{
							System.out.println(stringstack.pop());
						}

						System.out.println();

						break;
					case 3:
						//Stack for student
						Stack<Student> student= new Stack<Student>();
						for(int i=0;i<5;i++) 
						{ 
							System.out.println("Enter student roll number"); 
							int	r=sc.nextInt();
							System.out.println("Enter student name"); 
							sc.nextLine(); 
							String	name=sc.nextLine();
							student.push(new Student(r,name));
						}
						for(int i=0;i<5;i++) 
						{
							s=student.pop();

							System.out.println("name= "+s.name+ "   roll no= "+s.roll_no);


						}
						break;

					}}while(ch1!=0);

				break;
			case 2:
				ch1=0;
				do {
					System.out.println("MENU for the operations on Array list");
					System.out.println("1.Integer operations on the ArrayList");
					System.out.println("2.String operations on the  ArrayList");
					System.out.println("3.Student object operations on the ArrayList");
					System.out.println("0.Exit");
					System.out.println("Enter your choice:");
					ch1=sc.nextInt();

					switch(ch1)
					{
					case 1:
						//Arraylist for integer
						ArrayList<Integer> arr= new ArrayList<Integer>();
						for(int i=1;i<=10;i++)
						{ 
							arr.add(i); 
						} 
						System.out.println("Arraylist:");
						System.out.println(arr); 
						arr.remove(2); 
						arr.remove(5);
						System.out.println("New Arraylist:");
						System.out.println(arr);

						System.out.println("Array list size ="+arr.size());

						break;
					case 2:
						//arraylist for string
						ArrayList<String> arraystring= new ArrayList<String>();
						sc.nextLine();
						for(int i=0; i<5;i++)
						{ 
							System.out.println("Enter the string to be added:");

							String name=sc.nextLine(); 
							arraystring.add(name);
						}

						System.out.println("String arraylist pop:");
						System.out.println(arraystring);
						String removed= arraystring.remove(4);
						System.out.println(removed);

						break;
					case 3:
						//arraylist for student
						ArrayList<Student> stud2= new ArrayList<Student>();

						for(int i=0;i<5;i++) 
						{ 
							System.out.println("Enter student rollno"); 
							int r=sc.nextInt();

							System.out.println("Enter student name :"); 
							sc.nextLine(); 
							String name=sc.nextLine();
							stud2.add(new Student(r,name)); 
						}
						Iterator it = stud2.iterator();

						while(it.hasNext()) 
						{ Student stud=(Student)it.next();
						System.out.println("Roll number is"+stud.roll_no);
						System.out.println("Name is "+stud.name); }

						break;

					}
				}while(ch1!=0);
				break;
			case 3:
				ch1=0;
				do 
				{
					System.out.println("MENU for the operations on Linkedlist");
					System.out.println("1.Integer operations on the Linkedlist");
					System.out.println("2.String operations on the Linkedlist");
					System.out.println("3.Student object operations on the Linkedlist");
					System.out.println("0.Exit");
					System.out.println("Enter your choice:");
					ch1=sc.nextInt();
					switch(ch1)
					{
					case 1:
						//Linkedlist for integer
						LinkedList<Integer> l=new LinkedList<Integer>();
						for(int i=0;i<5;i++)
						{
							l.add(i);
						}
						System.out.println();
						System.out.println("Remove method");
						for(int i=0;i<5;i++)
						{
							int out=l.remove();
							System.out.println(out);
						}
						for(int i=0;i<5;i++)
						{
							l.addFirst(i);
						}
						System.out.println();
						System.out.println("Remove first method");
						for(int i=0;i<5;i++)
						{
							int out=l.removeFirst();
							System.out.println(out);
						}

						System.out.println();
						System.out.println("Add Last method");
						for(int i=0;i<5;i++)
						{

							l.addLast(i);
						}
						System.out.println();
						System.out.println("Remove last method");
						for(int i=0;i<5;i++)
						{
							int out=l.removeLast();
							System.out.println(out);
						}

						l.add(1);
						l.add(2);
						l.add(3);

						int size=l.size();
						System.out.println("Size ="+size);
						break;
					case 2:
						//Linkedlist for string
						LinkedList<String> l1=new LinkedList<String>();

						System.out.println("Add method");
						sc.nextLine();
						for(int i=0;i<5;i++)
						{
							System.out.println("Enter the string to add");
							String str=sc.nextLine();
							l1.add(str);
						}
						System.out.println();
						System.out.println("Remove method");
						for(int i=0;i<5;i++)
						{
							String out=l1.remove();
							System.out.println(out);
						}
						System.out.println("Add First method");
						for(int i=0;i<5;i++)
						{
							System.out.println("Enter the string to add");
							String str=sc.nextLine();
							l1.addFirst(str);
						}
						System.out.println();
						System.out.println("Remove first method");
						for(int i=0;i<5;i++)
						{
							String out=l1.removeFirst();
							System.out.println(out);
						}

						System.out.println();
						System.out.println("Add Last method");
						sc.nextLine();
						for(int i=0;i<5;i++)
						{
							System.out.println("Enter the string to add");
							String str=sc.nextLine();
							l1.addLast(str);
						}
						System.out.println();
						System.out.println("Remove last method");
						for(int i=0;i<5;i++)
						{
							String out=l1.removeLast();
							System.out.println(out);
						}


						l1.add("Second");
						l1.add("Third");

						int Size=l1.size();
						System.out.println("Size ="+Size);

						break;
					case 3:
						//linkedlist for student
						LinkedList<Student> l2= new LinkedList<Student>();

						System.out.println("Add method");
						for(int i=0;i<5;i++) 
						{ System.out.println("Enter student rollno"); 
						int	r=sc.nextInt();

						System.out.println("Enter student name :"); 
						sc.nextLine(); String
						name=sc.nextLine();
						l2.add(new Student(r,name));

						}

						Iterator it1= l2.iterator();

						while(it1.hasNext()) 
						{ 
							Student stud=(Student)it1.next();
							System.out.println("Roll no.="+stud.roll_no+"    Name="+stud.name);

						}
						System.out.println("Add first method");
						System.out.println("Enter student rollno"); 
						int	r=sc.nextInt();
						System.out.println("Enter student name :"); 
						sc.nextLine(); 
						String	name=sc.nextLine();
						l2.add(new Student(r,name));
						System.out.println("Element add ot first");
						s=l2.remove();
						System.out.println("removed element=");
						System.out.println("Roll no.="+s.roll_no+"    Name="+s.name);

						int SIZE=l2.size();
						System.out.println("Size="+SIZE);


						break;

					}
				}while(ch1!=0);
				break;
			case 0:System.out.println("Thank you!");
			break;

			}
		}while(ch!=0);

	}

}









/*
MENU for operations on collection framework
1.Stack operations
2.Arraylist operations 
3.LinkedList operations
0.Exit
Enter your choice:
1
MENU for the operations on Stack
1.Integer operations on the Stack
2.String operations on the Stack
3.Student object operations on the Stack
0.Exit
Enter your choice:
1
4
3
2
1
0
MENU for the operations on Stack
1.Integer operations on the Stack
2.String operations on the Stack
3.Student object operations on the Stack
0.Exit
Enter your choice:
2
Enter the string to be pushed:
vaisnavi
Enter the string to be pushed:
manisha
Enter the string to be pushed:
sunil
Enter the string to be pushed:
shankar
Enter the string to be pushed:
shreedhar
String stack pop:
shreedhar
shankar
sunil
manisha
vaisnavi

MENU for the operations on Stack
1.Integer operations on the Stack
2.String operations on the Stack
3.Student object operations on the Stack
0.Exit
Enter your choice:
3
Enter student roll number
1234
Enter student name
vaishnavi
Enter student roll number
1235
Enter student name
manisha
Enter student roll number
1236
Enter student name
sunil
Enter student roll number
1238
Enter student name
shankar
Enter student roll number
1239
Enter student name
shreedhar
name= shreedhar   roll no= 1239
name= shankar   roll no= 1238
name= sunil   roll no= 1236
name= manisha   roll no= 1235
name= vaishnavi   roll no= 1234
MENU for the operations on Stack
1.Integer operations on the Stack
2.String operations on the Stack
3.Student object operations on the Stack
0.Exit
Enter your choice:
3
Enter student roll number
1234
Enter student name
vaishnavi
Enter student roll number
12235
Enter student name
manisha
Enter student roll number
1236
Enter student name
sunil
Enter student roll number
1237
Enter student name
shankar
Enter student roll number
1238
Enter student name
shreedhar
name= shreedhar   roll no= 1238
name= shankar   roll no= 1237
name= sunil   roll no= 1236
name= manisha   roll no= 12235
name= vaishnavi   roll no= 1234
MENU for the operations on Stack
1.Integer operations on the Stack
2.String operations on the Stack
3.Student object operations on the Stack
0.Exit
Enter your choice:
0
MENU for operations on collection framework
1.Stack operations
2.Arraylist operations 
3.LinkedList operations
0.Exit
Enter your choice:
2
MENU for the operations on Array list
1.Integer operations on the ArrayList
2.String operations on the  ArrayList
3.Student object operations on the ArrayList
0.Exit
Enter your choice:
1
Arraylist:
[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
New Arraylist:
[1, 2, 4, 5, 6, 8, 9, 10]
Array list size =8
MENU for the operations on Array list
1.Integer operations on the ArrayList
2.String operations on the  ArrayList
3.Student object operations on the ArrayList
0.Exit
Enter your choice:
2
Enter the string to be added:
vaishnavi
Enter the string to be added:
sunil
Enter the string to be added:
mansiha
Enter the string to be added:
shankar
Enter the string to be added:
shreedhar
String arraylist pop:
[vaishnavi, sunil, mansiha, shankar, shreedhar]
MENU for the operations on Array list
1.Integer operations on the ArrayList
2.String operations on the  ArrayList
3.Student object operations on the ArrayList
0.Exit
Enter your choice:
3
Enter student rollno
1234
Enter student name :
vaishnavu
Enter student rollno
1245
Enter student name :
manisha
Enter student rollno
12434
Enter student name :
sunil
Enter student rollno
3345454
Enter student name :
manis
Enter student rollno
11244
Enter student name :
shankr
Roll number is1234
Name is vaishnavu
Roll number is1245
Name is manisha
Roll number is12434
Name is sunil
Roll number is3345454
Name is manis
Roll number is11244
Name is shankr
MENU for the operations on Array list
1.Integer operations on the ArrayList
2.String operations on the  ArrayList
3.Student object operations on the ArrayList
0.Exit
Enter your choice:
0

MENU for operations on collection framework
1.Stack operations
2.Arraylist operations 
3.LinkedList operations
0.Exit
Enter your choice:
3
MENU for the operations on Linkedlist
1.Integer operations on the Linkedlist
2.String operations on the Linkedlist
3.Student object operations on the Linkedlist
0.Exit
Enter your choice:
1

Remove method
0
1
2
3
4

Remove first method
4
3
2
1
0

Add Last method

Remove last method
4
3
2
1
0
Size =3
MENU for the operations on Linkedlist
1.Integer operations on the Linkedlist
2.String operations on the Linkedlist
3.Student object operations on the Linkedlist
0.Exit
Enter your choice:
2
Add method
Enter the string to add
2
Enter the string to add
vaishna
Enter the string to add
nbsdkj
Enter the string to add
dgfjh
Enter the string to add
dgfjh

Remove method
2
vaishna
nbsdkj
dgfjh
dgfjh
Add First method
Enter the string to add
dhjs
Enter the string to add
fdfj
Enter the string to add
fhkdjs
Enter the string to add
fdkjfh
Enter the string to add
jhkjdf

Remove first method
jhkjdf
fdkjfh
fhkdjs
fdfj
dhjs

Add Last method
fdhfj
Enter the string to add
fhdkjfh
Enter the string to add
dfh;
Enter the string to add
fkjd
Enter the string to add
djhf
Enter the string to add
hdf

Remove last method
hdf
djhf
fkjd
dfh;
fhdkjfh
Size =2
MENU for the operations on Linkedlist
1.Integer operations on the Linkedlist
2.String operations on the Linkedlist
3.Student object operations on the Linkedlist
0.Exit
Enter your choice:
3
Add method
Enter student rollno
1234
Enter student name :
vaishnavi
Enter student rollno
1235
Enter student name :
manisha
Enter student rollno
1246
Enter student name :
sunil
Enter student rollno
1237
Enter student name :
neha
Enter student rollno
1238
Enter student name :
mai
Roll no.=1234    Name=vaishnavi
Roll no.=1235    Name=manisha
Roll no.=1246    Name=sunil
Roll no.=1237    Name=neha
Roll no.=1238    Name=mai
Add first method
Enter student rollno
1676
Enter student name :
manisha
Element add ot first
removed element=
Roll no.=1234    Name=vaishnavi
Size=5
MENU for the operations on Linkedlist
1.Integer operations on the Linkedlist
2.String operations on the Linkedlist
3.Student object operations on the Linkedlist
0.Exit
Enter your choice:
0
MENU for operations on collection framework
1.Stack operations
2.Arraylist operations 
3.LinkedList operations
0.Exit
Enter your choice:
0
Thank you!
 */

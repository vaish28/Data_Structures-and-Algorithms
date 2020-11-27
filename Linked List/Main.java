import java.util.*;

public class Main 
{
	static class Node{
		int data;
		Node next;
		Node(int data)
		{
			this.data =data;
		}
	}
	
	public static void print(Node head) {
		Node t = head;
		while(t!=null)
		{
			System.out.print(t.data+" ");
			t=t.next;
		}
	}
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		Node head = new Node(scn.nextInt());
		Node temp = head;
		
		for(int i=1;i<n;i++)
		{
			temp =temp.next=new Node(scn.nextInt());
		}
		System.out.println();
		System.out.print("Original List: ");
		print(head);
		Node odd_head = null;
		Node odd_tail = null;
		Node even_head = null;
		Node even_tail = null;
		Node temp_ptr = head;
		boolean is_odd =true;
		
		while(temp_ptr!=null)
		{
			if(is_odd)
			{
				if(odd_head == null)
				{
					odd_head = odd_tail =temp_ptr;
				}
				
				else
				{
					odd_tail.next =temp_ptr;
					odd_tail = temp_ptr;
				}
				temp_ptr=temp_ptr.next;
				odd_tail.next = null;
			}
			
			else
			{
				if(even_head == null)
				{
					even_head = even_tail =temp_ptr;
				}
				
				else
				{
					even_tail.next = temp_ptr;
					even_tail =temp_ptr;
				}
				temp_ptr = temp_ptr.next;
				even_tail.next= null;
			}
			
			is_odd = !is_odd;
		}
		
		odd_tail.next = even_head;
		System.out.println();
		System.out.print("Modified List: ");
		print(odd_head);
		
		scn.close();
	}
}	
/*
 Given a linked list, remove the k-th node from the end of list.
 
 Sample Input
 15 
 3
 1 2 2 1 2 3 4 5 6 1 2 3 4 5 7
 Sample Output
 1 2 2 1 2 3 4 5 6 1 2 3 5 7
  
 Here two pointers are used fast and slow ; fast advances k steps of slow and slow advances by one step
 @author Vaishnavi Madhekar
*/


package kthelement;
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
			System.out.println(t.data+" ");
			t=t.next;
		}
	}
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int k = scn.nextInt();
		
		Node head = new Node(scn.nextInt());
		Node temp = head;
		
		for(int i=1;i<n;i++)
		{
			temp =temp.next=new Node(scn.nextInt());
		}
		
		Node slow = head;
		Node fast  = head;
		
		for(int i=0;i<k;i++)
		{
			fast = fast.next;
		}
		
		
		while(fast.next!=null)
		{
			fast= fast.next;
			slow = slow.next;
		}
		
		slow.next = slow.next.next;
		print(head);
		scn.close();
	}

}

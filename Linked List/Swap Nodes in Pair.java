/*
  Given a linked list, swap every two adjacent nodes and print linked list
  note: You may not modify the values in the list's nodes, only nodes itself may be changed.
  
  Sample Input
  5
  1 2 3 4 5 
  Sample Output
  1 -> 2 -> 3 -> 4 -> 5 -> 
  2 -> 1 -> 4 -> 3 -> 5 ->
  
 @author Vaishnavi Madhekar
*/
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
			System.out.print(t.data+" -> ");
			t=t.next;
		}
	}
	
	public static Node swap_nodes(Node head)
	{
		if(head==null || head.next==null)
			return head;
		
		Node new_head = swap_nodes(head.next.next);
		Node temp = head.next;
		temp.next = head;
		head.next = new_head;
		return temp;
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
		print(head);
		head=swap_nodes(head);
		System.out.println("");
		print(head);
	}
}	

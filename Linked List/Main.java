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


/*import java.util.*;
public class Test {
private class Node {
	int data;
	Node next;

	Node(int data, Node next) {
		this.data = data;
		this.next = next;
	}
}

private Node head;
private Node tail;
private int size;

public Test() {
	this.head = null;
	this.tail = null;
	this.size = 0;
}

public Test(Node head, Node tail, int size) {
	this.head = head;
	this.tail = tail;
	this.size = size;
}

// O(1)
public int size() {
	return this.size;
}

// O(1)
public boolean isEmpty() {
	return this.size() == 0;
}

// O(1)
public int getFirst() throws Exception {
	if (this.isEmpty()) {
		throw new Exception("List is empty.");
	}

	return this.head.data;
}

// O(1)
public int getLast() throws Exception {
	if (this.isEmpty()) {
		throw new Exception("List is empty.");
	}

	return this.tail.data;
}

// O(N)
public int getAt(int idx) throws Exception {
	Node temp = this.getNodeAt(idx);
	return temp.data;
}

// O(N)
private Node getNodeAt(int idx) throws Exception {
	if (this.isEmpty()) {
		throw new Exception("List is empty");
	}

	if (idx < 0 || idx >= this.size()) {
		throw new Exception("Invalid arguments");
	}

	Node retVal = this.head;
	for (int i = 0; i < idx; i++) {
		retVal = retVal.next;
	}

	return retVal;
}

// O(1)
public void addFirst(int data) {
	Node node = new Node(data, this.head);

	if (this.size() == 0) {
		this.head = node;
		this.tail = node;
	} else {
		this.head = node;
	}

	this.size++;
}

// O(1)
public void addLast(int data) {
	Node node = new Node(data, null);

	if (this.size() == 0) {
		this.head = node;
		this.tail = node;
	} else {
		this.tail.next = node;
		this.tail = node;
	}

	this.size++;
}

// O(n)
public void addAt(int idx, int data) throws Exception {
	if (idx < 0 || idx > this.size()) {
		throw new Exception("Invalid arguments");
	}

	if (idx == 0) {
		this.addFirst(data);
	} else if (idx == this.size()) {
		this.addLast(data);
	} else {
		Node nm1 = this.getNodeAt(idx - 1);
		Node n = nm1.next;

		Node node = new Node(data, n);
		nm1.next = node;

		this.size++;
	}
}

// O(1)
public int removeFirst() throws Exception {
	if (this.isEmpty()) {
		throw new Exception("List is empty");
	}

	int retVal = this.head.data;

	if (this.size() == 1) {
		this.head = null;
		this.tail = null;
	} else {
		this.head = this.head.next;
	}

	this.size--;
	return retVal;
}

// O(n)
public int removeLast() throws Exception {
	if (this.isEmpty()) {
		throw new Exception("List is empty");
	}

	int retVal = this.tail.data;

	if (this.size() == 1) {
		this.head = null;
		this.tail = null;
	} else {
		Node sm2 = this.getNodeAt(this.size() - 2);
		sm2.next = null;
		this.tail = sm2;
	}

	this.size--;
	return retVal;
}

// O(n)
public int removeAt(int idx) throws Exception {
	if (this.isEmpty()) {
		throw new Exception("List is empty");
	}

	if (idx < 0 || idx >= this.size()) {
		throw new Exception("Invalid arguments");
	}

	if (idx == 0) {
		return this.removeFirst();
	} else if (idx == this.size() - 1) {
		return this.removeLast();
	} else {
		Node nm1 = this.getNodeAt(idx - 1);
		Node n = nm1.next;
		Node np1 = n.next;

		nm1.next = np1;
		this.size--;

		return n.data;
	}
}

// O(n)
public void display() {
	
	Node temp = this.head;
	while (temp != null) {
	
 	System.out.print(temp.data+ " -> ");
 	temp = temp.next;

	}
	System.out.println();



}
public void Swap_nodes(){
	this.head=Swap_nodes(head);
}
 private Node Swap_nodes(Node node){
 	
 }

public static void main(String[] args) throws Exception {
	
	Scanner scn = new Scanner(System.in);
	int N = scn.nextInt();
	
	Test list = new Test ();

	for (int i = 0; i < N; i++) {
		list.addLast(scn.nextInt());
	}
	list.display();
	list.Swap_nodes();
	list.display();
}
}

*/
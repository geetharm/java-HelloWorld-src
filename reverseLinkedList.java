
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
/*
class Node {
	int data;
	Node next;

	public Node() {

	}

	public Node(int data) {
		this.data = data;
	}
}

class List {

	private Node head = null;
	private Node tail = null;

	public Node getHead() {
		return head;
	}

	public void initialiseHead() {
		head = null;
	}

	public void addNode(int data) {
		Node temp = new Node(data);
		System.out.println(System.identityHashCode(temp));

		if (head == null) {
			head = temp;
			tail = head;
		} else {
			tail.next = temp;
			tail = tail.next;
		}
		return;

	}

	public void print() {
		System.out.println("inside print list");
		Node temp = head;
		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}

	public void print(Node current) {
		System.out.println("inside print list");
		while (current != null) {
			System.out.println(System.identityHashCode(current));
			System.out.println(current.data);
			current = current.next;
		}
	}

	public Node reverseList() {

		Node prevNode = null;
		Node currentNode = head;
		Node reverseNode = null;

		while (currentNode != null) {
			prevNode = currentNode.next;
			currentNode.next = reverseNode;
			reverseNode = currentNode;
			currentNode = prevNode;
		}

		return reverseNode;
	}
	
	public int getNode(Node head, int n) {
		Node current = head;
		
		int i = 0;
		while (i < n){
			current = current.next;
			++i;
		}
	
		return current.data;		
	}
	
	public Node removeDuplicates(Node head) {
		Node current = head; 
		
		while((current != null) && (current.next != null)) {
			if(current.data == current.next.data) {
				current.next = current.next.next;
			} else {
				current = current.next;				
			}
		}
		return head;
	}
	
	public int HasCycle(Node head) {
		Node current = head;
		Set<Integer> code = new HashSet<>();
		
		while(current != null){
			int hCode = System.identityHashCode(current);
			
			System.out.println();
			
			if(code.contains(hCode)) {
				System.out.println("Has cycle");
				return 1;
			}
			code.add(hCode);
			current = current.next;
		}
		return 0;		
	}
}

public class reverseLinkedList {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */

/*		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		List lst = new List();

		for (int i = 0; i < num; ++i) {
			int count = sc.nextInt();

			lst.initialiseHead();
			for (int j = 0; j < count; ++j) {
				lst.addNode(sc.nextInt());
			}

			lst.print();
			
			lst.HasCycle(lst.getHead());

/*			Node removeDup = lst.removeDuplicates(lst.getHead());
			lst.print(removeDup);
			Node reverse = lst.reverseList();
			lst.print(reverse);
			System.out.println(lst.getNode(reverse, sc.nextInt()));*/
/*		}

		sc.close();
	}
}
*/
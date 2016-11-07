import java.io.*;
import java.util.*;

class Node {
	int data;
	Node prev;
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

	public Node setHead(Node temp) {
		return head = temp;
	}

	public void initialiseHead() {
		head = null;
	}

	public void addNode(int data) {
		Node temp = new Node(data);

		if (head == null) {
			head = temp;
			tail = head;
		} else {
			tail.next = temp;
			temp.prev = tail;
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

	public Node SortedInsert(Node head, int data) {

		Node temp = new Node();

		temp.data = data;

		if (head == null) {
			temp.prev = null;
			temp.next = null;
			head = temp;
			return head;
		} else {
			Node current = head;
			while (current != null) {
				if ((data == current.data) || (data < current.data)) {
					temp.prev = current.prev;
					temp.next = current;
					if(temp.prev == null) {
						head = temp;
					} else {
						current.prev.next = temp;						
						current.prev = temp;
					}

					break;
				} else if (data > current.data) {
					if(current.next != null) {
						current = current.next;						
					} else {
						temp.next = null;
						temp.prev = current;
						current.next = temp;
						break;
					}
				}
			}
		}
		return head;
	}
	
	Node reverse (Node head) {
	    if(head == null) {
	        return head;
	    }
	    
	    Node current = head;
	    while(current != null) {
	        Node temp = current.next;
	        

	        current.next = current.prev;
	        current.prev = temp;
	        if(temp != null) {
	        current = temp;   
	        } else {
	        	break;
	        }
	    }
	    head = current;
	    return head;

	}

}

public class DoublyLinkedList {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */

		Scanner sc = new Scanner(System.in);
		List lst = new List();

		int count = sc.nextInt();

		lst.initialiseHead();
		for (int j = 0; j < count; ++j) {
			lst.setHead(lst.SortedInsert(lst.getHead(), sc.nextInt()));
		}

		lst.print();
		lst.setHead(lst.reverse(lst.getHead()));
		lst.print();
		sc.close();
	}
}

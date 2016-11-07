import java.util.Scanner;
import java.io.*;
import java.util.*;

/*
class Node {
	int data;
	Node next;

	public Node(){
		
	}
	public Node(int data) {
		this.data = data;
		next = null;
	}
}

class List {
	private Node head;
	private Node tail;

	public void addNode(int data) {
		if (head == null) {
			head = new Node(data);
			tail = head;
			return;
		}

		Node newNode = new Node(data);
		tail.next = newNode;
		tail = newNode;
		return;
	}

	public void print() {

		Node current = head;
		while (current != null) {
			System.out.println(current.data);
			current = current.next;
		}
	}

	public Node getHead() {
		return head;
	}

}

public class MergeSortedLists {

	public Node mergeList(Node headA, Node headB) {
		Node mergedList = null;
		Node head = null;

		if ((headA == null) && (headB == null)) {
			return new Node();
		} else if (headA == null) {
			return headB;
		} else if (headB == null){
			return headA;
		}
		

		while ((headA != null) || (headB != null)) {
			if (headA == null) {
				mergedList.next = headB;
				break;
			} else if (headB == null) {
				mergedList.next = headA;
				break;
			}

			Node temp = new Node();
			if(headA.data == headB.data){
				temp.data = headA.data;
				
				Node temp1 = new Node();
				temp1.data = headB.data;
				temp.next = temp1;
				headA = headA.next;
				headB = headB.next;
			} else if (headA.data > headB.data) {
				temp.data = headB.data;
				headB = headB.next;
			} else if (headA.data < headB.data) {
				temp.data = headA.data;
				headA = headA.next;
			}

			if (mergedList == null) {
				head = temp;
			} else {
				mergedList.next = temp;
			}

			while(temp.next != null){
				temp = temp.next;
			}
			mergedList = temp;

		}
		return head;

	}

	public void print(Node head) {
		while (head != null) {
			System.out.println(head.data + "  ");
			head = head.next;
		}
	}

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */

		/*Scanner sc = new Scanner(System.in);

		List list1 = new List();
		List list2 = new List();
		MergeSortedLists mergeSortedList = new MergeSortedLists();

		for (int i = 0; i < 2; ++i) {
			int count = sc.nextInt();

			List list = i == 0 ? list1 : list2;
			for (int j = 0; j < count; ++j) {
				list.addNode(sc.nextInt());
			}
		}

		System.out.println("First List:");
		list1.print();
		System.out.println("SEcond List:");
		list2.print();

		Node sortedHead = mergeSortedList.mergeList(list1.getHead(), list2.getHead());
		System.out.println("Merged List:");
		mergeSortedList.print(sortedHead);

		sc.close();
	}

}
*/
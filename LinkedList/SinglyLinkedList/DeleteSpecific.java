package com.gqt;

import com.gqt.SinglyLL6.Node;

class SinglyLL7 {
	Node head;
	int size = 0;

	class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			this.next = null;
			size++;
		}

	}

	public void insertFront(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
		} else {
			newNode.next = head;
			head = newNode;
		}
	}

// Printing the node
	public void printLL() {
		if (head == null) {
			System.out.println("Linked List is empty..");
		} else {
			System.out.print("Elements : ");
			Node temp = head;
			while (temp != null) {
				System.out.print(temp.data + " ");
				temp = temp.next;

			}

		}
	}

// Getting size of linked list
	public int getSize() {
		return this.size;
	}

	public void deleteSpecfic(int data) {
		if (head == null) {
			System.out.println("Linked List is empty.. Deletion not possible");
		} else if (head.data == data) {
			System.out.println(head.data + " Deleted successfully");
			head = head.next;
			size--;

		} else {
			Node temp = head;
			while (temp.next != null) {
				if (temp.next.data == data) {
					System.out.println(temp.next.data + " Deleted successfully");
					temp.next = temp.next.next;
					size--;
					return;
				} else {
					temp = temp.next;
					
				}
			}
			System.out.println(data + " is not there in linked list so cant delete");
		}
	}
}

public class DeleteSpecific {

	public static void main(String[] args) {
		SinglyLL7 sll = new SinglyLL7();
		sll.insertFront(10);
		sll.insertFront(20);
		sll.insertFront(30);
		sll.insertFront(40);
		sll.insertFront(50);
		sll.printLL();
		System.out.println("\nSize = " + sll.getSize());
		System.out.println();
		sll.deleteSpecfic(40);
		sll.printLL();
		System.out.println("\nSize = " + sll.getSize());
		System.out.println();
		sll.deleteSpecfic(50);
		sll.printLL();
		System.out.println("\nSize = " + sll.getSize());
		System.out.println();
		sll.deleteSpecfic(30);
		sll.printLL();
		System.out.println();
		sll.deleteSpecfic(23);
		

	}

}

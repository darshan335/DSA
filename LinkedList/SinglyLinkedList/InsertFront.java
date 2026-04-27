package com.gqt;

class SinglyLL {
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

	// Inserting node at frontend
	public void insertFront(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
		} else {
			newNode.next = head;
			head = newNode;
		}
	}

}

public class InsertFront {

	public static void main(String[] args) {
		SinglyLL sll = new SinglyLL();
		sll.insertFront(55);
		sll.insertFront(65);
		sll.insertFront(75);
		sll.insertFront(100);
		sll.printLL();
		System.out.println("\nSize = " + sll.getSize());

	}

}

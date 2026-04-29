package com.gqt;

import com.gqt.SinglyLL5.Node;

class SinglyLL6 {
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

	// Deleting node at rearend
	public void deleteRear() {
		if (head == null) {
			System.out.println("Linked List is empty Deletion not possible ");
		} else if (head.next == null) {
			head = null;
			size--;
		} else {
			Node temp = head;
			while (temp.next.next != null) {
				temp = temp.next;
			}
			System.out.println(temp.next.data + " Deleted successfully");
			temp.next = null;
			size--;
		}
	}

}

public class DeleteRear {

	public static void main(String[] args) {
		SinglyLL6 sll = new SinglyLL6();
		sll.insertFront(10);
		sll.insertFront(20);
		sll.insertFront(30);
		sll.insertFront(40);
		sll.insertFront(50);
		sll.printLL();
		System.out.println("\nSize = " + sll.getSize());
		System.out.println();
		sll.deleteRear();
		sll.printLL();
		System.out.println("\nSize = " + sll.getSize());
		System.out.println();
		sll.deleteRear();
		sll.printLL();
		System.out.println("\nSize = " + sll.getSize());
		System.out.println();
		sll.deleteRear();
		sll.printLL();
		System.out.println("\nSize = " + sll.getSize());
		System.out.println();
		sll.deleteRear();
		sll.printLL();
		System.out.println("\nSize = " + sll.getSize());
		System.out.println();
		sll.deleteRear();
		sll.printLL();
		System.out.println("\nSize = " + sll.getSize());
		System.out.println();
		sll.deleteRear();
		sll.printLL();
		System.out.println("\nSize = " + sll.getSize());
		System.out.println();
	}

}

package com.gqt;

import com.gqt.SinglyLL7.Node;

class SinglyLL8 {
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

	public void deleteSpecificIndex(int index) {
		if (index >= 0 && index < getSize()) {
			if (head == null) {
				System.out.println("Linked List is empty.. deletion not possible");
			} else if (index == 0) {
				System.out.println(head.data + " Deleted successfully");
				head = head.next;
				size--;
			} else {
				Node temp = head;
				int i = 0;
				while (temp.next != null && i < index - 1) {
					temp = temp.next;
					i++;
				}
				System.out.println(temp.next.data + " Deleted successfully");
				temp.next = temp.next.next;
				size--;
			}
		} else {
			System.out.println("Invalid index..");
		}
	}
}

public class DeleteAtSpecificIndex {

	public static void main(String[] args) {
		SinglyLL8 sll = new SinglyLL8();
		sll.insertFront(10);
		sll.insertFront(20);
		sll.insertFront(30);
		sll.insertFront(40);
		sll.insertFront(50);
		sll.printLL();
		System.out.println();
		sll.deleteSpecificIndex(2);
		System.out.println();
		sll.printLL();
		System.out.println();
		sll.deleteSpecificIndex(3);
		System.out.println();
		sll.printLL();
		System.out.println();
		sll.deleteSpecificIndex(0);
		System.out.println();
		sll.printLL();
		System.out.println();
		sll.deleteSpecificIndex(0);
		System.out.println();
		sll.printLL();
		System.out.println();
		sll.deleteSpecificIndex(0);
		System.out.println();
		sll.printLL();
		System.out.println();
		sll.deleteSpecificIndex(0);
		System.out.println();
		sll.printLL();
	}

}

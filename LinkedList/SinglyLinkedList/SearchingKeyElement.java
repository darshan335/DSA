package com.gqt;

import com.gqt.SinglyLL4.Node;

class SinglyLL4 {
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

	// Searching key element
	public void searchKeyElement(int key) {
		Node temp = head;
		if (head == null) {
			System.out.println("Linked List is empty cannot search element");
		} else {
			while (temp != null) {
				if (key == temp.data) {
					System.out.println(key + " Found");
					return;

				}
				temp = temp.next;

			}
			System.out.println(key + " Not found");
		}

	}
}

public class SearchingKeyElement {

	public static void main(String[] args) {
		SinglyLL4 sll = new SinglyLL4();
		sll.insertFront(55);
		sll.insertFront(65);
		sll.insertFront(75);
		sll.insertFront(100);
		sll.printLL();
		System.out.println("\nSize = " + sll.getSize());
		sll.searchKeyElement(55);
	}

}

package com.gqt;

import com.gqt.SingLL.Node;

class SinglyLL1 {
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

	public void printLL() {
		if (head == null) {
			System.out.println("Linked List is Empty...");
		} else {
			System.out.print("Elements : ");
			Node temp = head;
			while (temp != null) {
				System.out.print(temp.data + " ");
				temp = temp.next;
			}
		}
	}

	public void inserRear(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
		} else {
			Node temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = newNode;
		}
	}

	// Inserting node at given position
	public void insertGivenPosition(int data, int index) {
		if (index >= 0 && index < getSize()) {
			Node newNode = new Node(data);
			if (head == null) {
				head = newNode;
			} else if (index == 0) {
				newNode.next = head;
				head = newNode;
			} else {
				int i = 0;
				Node temp1 = null;
				Node temp2 = head;
				while (temp2.next != null && i < index) {
					temp1 = temp2;
					temp2 = temp2.next;
					i++;
				}
				temp1.next = newNode;
				newNode.next = temp2;

			}
		} else {
			System.out.println("invalid position...");
		}
	}

	public int getSize() {
		return this.size;
	}
}

public class InsertAtAnyPosition {

	public static void main(String[] args) {
		SinglyLL1 sll = new SinglyLL1();
		sll.inserRear(10);
		sll.inserRear(20);
		sll.inserRear(30);
		sll.inserRear(40);
		sll.insertGivenPosition(46, 2);
		sll.insertGivenPosition(50, 0);
		sll.insertGivenPosition(87, 4);
		sll.printLL();
	}

}

package com.gqt;

class SinglyLL2 {
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

	public int getSize() {
		return this.size;
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

	public void insertRear(int data) {
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

	public void insertFront(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
		} else {
			newNode.next = head;
			head = newNode;
		}
	}

	public void insertAtGivenPosition(int data, int index) {
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
				newNode.next = temp2;
				temp1.next = newNode;
			}
		} else {
			System.out.println("Invalid Position...");
		}
	}

	public void sortedInsertionAssending(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
		} else if (head.data > newNode.data) {
			newNode.next = head;
			head = newNode;
		} else {
			Node temp = head;
			while (temp.next != null && temp.next.data < newNode.data) {
				temp = temp.next;
			}
			newNode.next = temp.next;
			temp.next = newNode;
		}
	}
}

public class SortedInsertionInAssending {

	public static void main(String[] args) {
		SinglyLL2 sll = new SinglyLL2();
		sll.printLL();
		System.out.println("Size = " + sll.getSize());
		sll.sortedInsertionAssending(50);
		sll.sortedInsertionAssending(10);
		sll.sortedInsertionAssending(80);
		sll.printLL();
		System.out.println("\nSize = " + sll.getSize());
	}

}

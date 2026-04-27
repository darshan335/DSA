package com.gqt;

class SingLL {
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

	// Inserting node from rare end
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

	public int getSize() {
		return this.size;
	}

}

public class InsertRear {

	public static void main(String[] args) {
		SingLL sll = new SingLL();
		sll.inserRear(10);
		sll.inserRear(20);
		sll.inserRear(30);
		sll.inserRear(40);
		sll.printLL();
		System.out.println("\nSize = " + sll.getSize());
	}

}

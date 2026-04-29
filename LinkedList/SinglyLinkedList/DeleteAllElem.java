package com.gqt;

import com.gqt.SinglyLL8.Node;

class SinglyLL9 {
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

	public void deleteAll() {
		if (head == null) {
			System.out.println("Linked list is empty deletion not possible");
		} else {
			head = null;
			size = 0;
		}
	}
}

public class DeleteAllElem {

	public static void main(String[] args) {
		SinglyLL9 sll = new SinglyLL9();
		sll.insertFront(10);
		sll.insertFront(20);
		sll.insertFront(30);
		sll.insertFront(40);
		
		sll.insertFront(10);
		sll.printLL();
		sll.deleteAll();
		sll.printLL();
	}

}

package com.gqt;

import com.gqt.SinglyLL5.Node;

class SinglyLL5 {
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

	// Deleting node at frontend
	public void deleteFront() {
		if (head == null) {
			System.out.println("Linked List is empty deletion not possible");
		} else {
			System.out.println(head.data + " Deleted successfully");
			head = head.next;
			size--;
		}
	}

}

public class DeleteFrontNode {

	public static void main(String[] args) {
		SinglyLL5 sll = new SinglyLL5();
		sll.insertFront(25);
		sll.insertFront(35);
		sll.insertFront(45);
		sll.insertFront(55);
		sll.printLL();
		sll.deleteFront();
		sll.printLL();
		sll.deleteFront();
		sll.deleteFront();
		sll.deleteFront();
		sll.deleteFront();
	}

}

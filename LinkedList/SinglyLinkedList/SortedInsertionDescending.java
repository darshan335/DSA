package com.gqt;

import com.gqt.SinglyLL3.Node;

class SinglyLL3 {
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

	public void insertDescending(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
		} else if (head.data < newNode.data) {
			newNode.next = head;
			head = newNode;
		} else {
			Node temp = head;
			while (temp.next != null && temp.next.data > newNode.data) {
				temp = temp.next;
			}
			newNode.next = temp.next;
			temp.next = newNode;
		}
	}

}

public class SortedInsertionDescending {

	public static void main(String[] args) {
		SinglyLL3 sll = new SinglyLL3();
		sll.printLL();
		System.out.println("Size = " + sll.getSize());
		sll.insertDescending(100);
		sll.insertDescending(200);
		sll.insertDescending(5);
		sll.insertDescending(50);
		sll.printLL();
		System.out.println("\nSize = " + sll.getSize());

	}

}

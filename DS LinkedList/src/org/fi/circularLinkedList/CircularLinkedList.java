package org.fi.circularLinkedList;

public class CircularLinkedList {
	public Node head;
	public Node tail;
	public int size;
	
	public Node createNode(int nodeValue)
	{
		head = new Node();
		Node newNode = new Node();
		newNode.value = nodeValue;
		newNode.next = newNode;
		head = newNode;
		tail= newNode;
		size = 1;
		return head;
		
		
		
	}
}

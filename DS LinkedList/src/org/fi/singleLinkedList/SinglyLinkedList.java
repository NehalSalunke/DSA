package org.fi.singleLinkedList;

public class SinglyLinkedList {
public Node head;
public Node tail;
public int size;

	// creating node
public Node createNode(int nodeValue)
	{
		head = new Node();
		Node newNode = new Node();
		newNode.value = nodeValue;
		newNode.next = null;
		
		head = newNode;
		tail = newNode;
		size =1;
		return head;
	}

	// creating linked List
public void createLinkedList(int nodeValue, int location)
	{
		Node newNode = new Node();
		newNode.value = nodeValue;
		
		if(head==null)
		{
			createNode(nodeValue);
		}
		else if(location==0)
		{
			newNode.next = head;
			head = newNode;
		}	
		else if (location>=size)
		{
			newNode.next=null;
			tail.next = newNode;
			tail = newNode;
		}
		else 
		{
			Node tmpNode = head;
			int index = 0;
			while(index<location-1)
			{
				tmpNode = tmpNode.next;
				index++;
			}
			Node nextNode = tmpNode.next;
			tmpNode.next = newNode;
			newNode.next = nextNode;
			
			
		}
	}

	//traversing the linked list
	public void traverseLinkedList()
	{
		if(head==null)
		{
			System.out.println("linked list is not exist");
		}
		else
		{
			Node tempNode = head;
			for (int i = 0; i < size-1; i++) {
				System.out.println(tempNode.value+" --> ");
//				if(i!=size-1)
//				{
//					System.out.println(" --> ");
//				}
				tempNode = tempNode.next;
			}
		}
	}
	
	//searching node
	boolean searchNode(int nodeValue)
	{
		if(head!=null)
		{
			Node tempNode = head;
			for (int i = 0; i < size-1; i++) 
			{
			if(tempNode.value==nodeValue)
				{
					System.out.println("value found on index "+ i);
					return true;
				}
			tempNode= tempNode.next;
					
			}
		}
		System.out.println("node not found");
		return false;
	}
	
	// deleting Node
	public void deleteNode(int location)
	{
		if(head==null)
		{
			System.out.println("linked list is not available");
			return;
		}
		else if(location==0)
		{
			head= head.next;
			size--;
			if(size==0)
			{
				tail=null;
			}
		}
		else if(location>=size)
		{
			Node tempNode = head;
			for (int i = 0; i < size-1; i++) 
			{
				tempNode= tempNode.next;
			}
			if(tempNode.next==head)
			{
				tail=head=null;
				size--;
				return;
			}
			tempNode.next=null;
			tail=tempNode;
			size--;
		}
		else
		{
			Node tempNode = head;
			for (int i = 0; i < size-1; i++) {
				tempNode= tempNode.next;
			}
			tempNode.next=tempNode.next.next;
			size--;
			return;
		}
	}
	
	// delete all the nodes
	public void deleteAllNodes() 
	{
		head=null;
		tail=null;
		size=0;
		System.out.println("all nodes are deleted succesfully.");
	}
}






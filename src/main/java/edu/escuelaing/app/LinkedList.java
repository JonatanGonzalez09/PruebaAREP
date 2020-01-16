package edu.escuelaing.app;

public class LinkedList{ 
    Node head;
	
    static class Node { 
        int data; 
        Node next; 
        
        Node(int d){ 
            data = d; 
            next = null;
        } 
    } 
	
    public LinkedList addNode(LinkedList list, int data){ 
        Node new_node = new Node(data);
        new_node.next = null;
		
        if (list.head == null){ 
            list.head = new_node; 
		} 
        else{ 
            Node last = list.head; 
            while (last.next != null){ 
                last = last.next; 
            } 
            last.next = new_node; 
        } 
        return list; 
    }
	
    public static void printList(LinkedList list){ 
        Node currNode = list.head; 
        System.out.print("LinkedList: "); 
        while (currNode != null){
            System.out.print(currNode.data + " ");
            currNode = currNode.next; 
        }
    }
}
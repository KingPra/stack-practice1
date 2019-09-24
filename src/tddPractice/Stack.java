package tddPractice;

import java.util.LinkedList;

import org.w3c.dom.Node;

public class Stack {

	private Object data;
	private Node head;
	private Node nodeNext;

	public Boolean isEmpty() {
		if (this.data == null) {
			return true;
		}
		return false;
	}

	public Object peek() {
		return this.data;
	}

	public void push(Object data) {
	//	head = new LinkedList<Node>();
		// nodeNext = head;
	}

}

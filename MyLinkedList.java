package myLinkedListImplementation;

public class MyLinkedList <T> {
	private int counter;
	private Node<T> head;

	public MyLinkedList() {
		this.counter = 0;
		this.head = null;
	}

	public void add(T obj) {
		if (this.head == null) {
			this.head = new Node<T>(obj);
			incrementCounter();
			return;
		}
		Node<T> elementToAdd = new Node<T>(obj);
		Node<T> currentNode = head;
		for (int i = 0; i < size(); i++) {
			if (currentNode.getNext() != null) {
				currentNode = currentNode.getNext();
			} else {
				currentNode.setNext(elementToAdd);		
			}
		}
		incrementCounter();
	}

	public void add(T obj, int position) {
		if (position < 0 || position > size()) {
			System.out.println("Invalid position");
			return;
		}
		if (head == null) {
			add(obj);
			incrementCounter();
			return;
		}

		Node<T> currentNode = this.head;
		Node<T> elementToAdd = new Node<T>(obj);

		if (position != 0) {
			for (int i = 0; i < position-1; i++) {
				currentNode = currentNode.getNext();
			}
			elementToAdd.setNext(currentNode.getNext());
			currentNode.setNext(elementToAdd);
		} else {
			elementToAdd.setNext(head);
			head = elementToAdd;
		}
		incrementCounter();

	}

	public T get(int position)
	{
		Node<T> currentNode = this.head;
		for(int i=0;i<position;i++)
		{
			currentNode = currentNode.getNext();
		}
		return currentNode.getData();
	}
	
	public boolean remove(int position)
	{
		if(position<0&& position>this.counter)
		{
			return false;
		}
		
		Node<T> currentNode = this.head;
		
		if(position==0)
		{
			this.head = head.getNext();
			decrementCounter();
			return true;
		}
		
		for(int i=0;i<position-1;i++)
		{
			currentNode = currentNode.getNext();
		}
		currentNode.setNext(currentNode.getNext().getNext());
		decrementCounter();
		return true;
	}
	
	public int size() {
		return this.counter;
	}

	public void incrementCounter() {
		this.counter++;
	}

	public void decrementCounter() {
		this.counter--;
	}

	private class Node <T> {
		private Node<T> next;
		private T data;

		public Node(T obj) {
			setData(obj);
			this.next = null;
		}

		public Node(T obj, Node<T> node) {
			setData(obj);
			setNext(node);
		}

		public T getData() {
			return this.data;
		}

		public void setData(T obj) {
			this.data = obj;
		}

		public Node<T> getNext() {
			return this.next;
		}

		public void setNext(Node<T> node) {
			this.next = node;
		}

	}

}

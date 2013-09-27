class LinkedNode{
	Object data;
	Node next;
	Node prev;
	public Node(Object val, Node prev, Node next){
		this.data = val;
		this.prev = prev;
		this.next = next;
	}
	
	public Node(Object val, Node next){
		this.data = val;
		this.next = next;
	}
	
	public Node(Object val){
		this.data = val;
	}
}
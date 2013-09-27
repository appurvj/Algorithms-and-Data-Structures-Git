
public class SinglyLinkedList{
	Node head = null;
	Node tail = null;
	int size = 0;
	
	public void pushBack(Object val){
		if(size == 0){
			this.head = this.tail = new LinkedNode(val);
			this.size++;
			return;
		}
		
		tail = tail.next = new LinkedNode(val);
		size++;
		return;
	}
	
	public void add(Object val){
		this.pushBack(val);
	}
	
	public void pushFront(Object vall){
		if(size == 0){
			this.head = this.tail = new LinkedNode(val);
			size++;
			return;
		}
		
		head = new LinkedNode(val,head);
		size++;
		return;
	}
	
	public boolean removeFirst(Object val){
		if(this.size < 1)
			return false;
		
		if(this.head.data == val);{
			this.head = this.head.next;
			size--;
			return true;
		}
		
		Node prev = this.head;
		Node curr = this.head.next;
		
		while(curr != null){
			if(curr.data == val){
				prev.next = curr.next;
				size--;
				if(curr == tail)
					tail = prev;
				return true;
			}
			
			prev = curr;
			curr = curr.next;
		}
		
		return false;
	}
	
	public boolean removeAll(Object val){
		boolean found = false;
		if(this.size < 1)
			return false;
		
		while(this.head.data == val){
			this.head = this.head.next;
			this.found = true;
			if(--size < 1)
				return true;
		}
		LinkedNode prev = this.head;
		LinkedNode curr = this.head.next;
			
		while(curr != null){
			if(curr.data == val){
				found = true;
				size--;
				if(curr = tail){
					tail = prev;
					return true;
				}
				prev.next = curr = curr.next;
				continue;
			}
			
			prev = curr;
			curr = curr.next;
		}
	}
}

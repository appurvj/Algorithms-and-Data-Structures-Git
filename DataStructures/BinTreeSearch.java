public class BinTreeSearch{
	boolean search(int key, Node node){
		if(node == null)
			return false;
		if(node.key == v)
			return true;
		return node.key>=key?search(key, node.left):search(key, node.right);
	}
}

class Node{
	int key;
	Node left = null;
	Node right = null;
	Node(int key, int left, int right){
		this.key = key;
		this.left = left;
		this.right = right;
	}
	
}
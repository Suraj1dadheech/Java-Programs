package dataStructure.TreeTraversal;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BSTtree {
	
	Node root;
	int count=0;
	
	class Node{
		int value;
		Node left;
		Node right;
		private Node(int value) {
			this.value=value;
		}
	}

	public boolean insert(int value) 
	{
		Node newNode = new Node(value);
		
		if(root==null) {
			root=newNode;
			return true;
		}

		Node temp=root;
		while(true) {
			if(newNode.value==temp.value) return false;
			if(newNode.value<temp.value) {
				if(temp.left==null) {
					temp.left=newNode;
					return true;
				}
					temp=temp.left;
			}else{
				if(temp.right==null) {
					temp.right=newNode;
					return true;
				}
					temp=temp.right;				
			}	
	}		
}
	

	public List<Integer> BFSfun() {
		Node currentNode=root;
		Queue<Node> queue=new LinkedList<Node>();
		List<Integer> list=new LinkedList<Integer>();
		queue.add(currentNode);
		while(queue.size()>0) {
			currentNode=queue.remove();
			list.add(currentNode.value);
			if(currentNode.left!=null)
				queue.add(currentNode.left);
			if(currentNode.right!=null)
				queue.add(currentNode.right);
		}
		return list;
	}
	

	public void inorder(Node root) {
		if(root==null)
			return;
		inorder(root.left);
		System.out.print(root.value+"  ");
		inorder(root.right);
		
	}

	public void preorder(Node root1) {
		if(root1==null)
			return;
		System.out.print(root1.value+"  ");
		preorder(root1.left);
		preorder(root1.right);
		
	}
	public void postorder(Node root) {
		if(root==null)
			return;
		postorder(root.left);
		postorder(root.right);
		System.out.print(root.value+"  ");
		
	}




}

 
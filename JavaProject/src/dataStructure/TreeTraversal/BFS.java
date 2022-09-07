package dataStructure.TreeTraversal;

import java.util.ArrayList;
import java.util.List;


public class BFS {

	public static void main(String[] args) {
		BSTtree myBST=new BSTtree();
		myBST.insert(47);
		myBST.insert(21);
		myBST.insert(76);
		myBST.insert(18);
		myBST.insert(27);
		myBST.insert(52);
		myBST.insert(82);

		List<Integer> Bfslist=new ArrayList<>();
		Bfslist.addAll(myBST.BFSfun());
		
		System.out.println("BFS Traversal: "+Bfslist);
		
		System.out.print("Preorder: ");
		myBST.preorder(myBST.root);
		System.out.println();
		System.out.print("Postorder: ");
		myBST.postorder(myBST.root);
		System.out.println();
		System.out.print("inOrder: ");
		myBST.inorder(myBST.root);

	}

}

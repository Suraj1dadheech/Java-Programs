package dataStructure.Tree;

public class Main {

	public static void main(String[] args) {
		BinarySearchTree myBST=new BinarySearchTree();
		

		
		myBST.insert(47);
		myBST.insert(35);
		myBST.insert(45);
		myBST.insert(49);
		myBST.insert(48);
		myBST.insert(50);
//		myBST.insert(17);
		
		
		

		System.out.println("Element 48 present: "+myBST.Contains(myBST.root,48));
		System.out.println("Element 49 present: "+myBST.Contains(myBST.root,49));
		System.out.println("Element 45 present: "+myBST.Contains(myBST.root,45));
		System.out.println("Element 15 present: "+myBST.Contains(myBST.root,15));
		System.out.println("Element 55 present: "+myBST.Contains(myBST.root,55));
		System.out.println("Element 17 present: "+myBST.Contains(myBST.root,17));

		
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

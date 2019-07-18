/**
 * 1. Create a tree in level order from an array.
 * 2. If the inorder traversal of the tree is sorted, then it's a BST
 */

package BST;

import java.util.ArrayList;
import java.util.Collections;

class Node 
{ 
	int data; 
	Node left;
	Node right; 
}

class BinaryTree
{
	ArrayList<Integer> myRes = new ArrayList<>();
	
	private Node createNewNode(int val) 
	{
		Node n = new Node();
		n.data = val;
		n.left = null;
		n.right = null;
		return n;
	}
	
	public Node insert(int[] arr, Node node, int i) 
	{ 
		if (i < arr.length) 
		{ 
			node = createNewNode(arr[i]); 

			node.left = insert(arr, node.left, 2 * i + 1); 

			node.right = insert(arr, node.right, 2 * i + 2); 
		} 
		return node; 
	} 

	public void inOrder(Node root) 
	{ 
		if (root != null) { 
			inOrder(root.left); 
			System.out.print(root.data + " "); 
			inOrder(root.right); 
		} 
	} 
	
	public void checkBST(Node root)
	{	
		if (root != null) { 
			checkBST(root.left);
			myRes.add(root.data);
	        checkBST(root.right); 
		}
	}
}

public class BST 
{
	public static void main(String args[]) 
	{ 
		BinaryTree t2 = new BinaryTree(); 
		Node root = null;
		int arr[] = { 8, 4, 12, 3, 6, 10 }; 
		root = t2.insert(arr, root, 0); 
		//t2.inOrder(root); 
		t2.checkBST(root);
		System.out.println(t2.myRes);
		ArrayList sortedRes = new ArrayList(t2.myRes);	//Storing the result into another ArrayList
		Collections.sort(sortedRes);
		if(t2.myRes.equals(sortedRes))	//Checking if the actual & and sorted ArrayList are same
			System.out.println("It is a BST!");
		else
			System.out.println("It is not a BST");
		
	} 
}

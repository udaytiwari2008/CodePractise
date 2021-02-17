package com.datastructures.tree;
import com.datastructures.tree.TreeOperations;;

public class RunTreeProgram {
	public static void main(String[] args) {
		TreeNode root = new TreeNode(10);
		
		TreeNode leftChild = new TreeNode(20);
		TreeNode rightChild = new TreeNode(30);
		
		TreeNode leftsLeftChild = new TreeNode(40);
		TreeNode leftsRightChild = new TreeNode(50);
		
		TreeNode rightsLeftChild = new TreeNode(60);
		TreeNode rightRightChild = new TreeNode(70);
		
		root.setLeftChild(leftChild);
		root.setRightChild(rightChild);
		
		leftChild.setLeftChild(leftsLeftChild);
		leftChild.setRightChild(leftsRightChild);
		
		rightChild.setLeftChild(rightsLeftChild);
		rightChild.setRightChild(rightRightChild);
		
		System.out.println("inorder tree traversal : LEFT ROOT RIGHT");
		TreeOperations.inOrderTraversal(root);
		System.out.println("\n======================================");
		
		System.out.println("preorder tree traversal ROOT LEFT RIGHT");
		TreeOperations.preOrderTraversal(root);
		System.out.println("\n======================================");
		
		System.out.println("postorder tree traversal LEFT ROOT RIGHT");
		TreeOperations.postOrderTraversal(root);
		System.out.println("\n=======================================");
		
	}
}

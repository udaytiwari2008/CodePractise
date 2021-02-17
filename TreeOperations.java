package com.datastructures.tree;

public class TreeOperations {

	public static void inOrderTraversal(TreeNode root) {

		if (root == null) {
			return;
		}
		inOrderTraversal(root.getLeftChild());
		System.out.print(root.getData() + " ");
		inOrderTraversal(root.getRightChild());

	}

	public static void preOrderTraversal(TreeNode root) {
		if (root == null) {
			return;
		}

		System.out.print(root.getData() + " ");
		preOrderTraversal(root.getLeftChild());
		preOrderTraversal(root.getRightChild());

	}

	public static void postOrderTraversal(TreeNode root) {
		if (root == null) {
			return;
		}

		postOrderTraversal(root.getLeftChild());
		postOrderTraversal(root.getRightChild());
		System.out.print(root.getData() + " ");

	}
}

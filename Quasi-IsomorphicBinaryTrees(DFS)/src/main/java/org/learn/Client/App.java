package org.learn.Client;

import org.learn.Question.Node;
import org.learn.Question.QuasiIsomorphicBinaryTree;

public class App 
{
	public static void main( String[] args )
    {		
		//level 0
		Node tree1 = Node.createNode(45); //A
		//level 1
		tree1.left = Node.createNode(20); //B
		tree1.right = Node.createNode(65);//C
		// left sub tree
		tree1.left.left = Node.createNode(49);//D
		tree1.left.left.left = Node.createNode(30);//G
		tree1.left.left.right = Node.createNode(45); //H

		// right subtree
		tree1.right.left = Node.createNode(30); //E
		tree1.right.right = Node.createNode(60);//F
		
		tree1.right.right.left = Node.createNode(65);//I	
		tree1.right.right.right = Node.createNode(55);//J	
		
		
		Node tree2 = Node.createNode(70); //P
		//level 1
		tree2.left = Node.createNode(55); //Q
		tree2.right = Node.createNode(85);//R
		// left sub tree
		tree2.left.left = Node.createNode(30);//S
		tree2.left.left.left = Node.createNode(80);//T
		tree2.left.left.right = Node.createNode(30); //U

		// right subtree
		tree2.right.left = Node.createNode(40); //V
		tree2.right.right = Node.createNode(65); //W
		tree2.right.left.left = Node.createNode(52); //X
		tree2.right.left.right = Node.createNode(10); //Y

		boolean isSame = QuasiIsomorphicBinaryTree.quasiIsomorphicBinaryTree(tree1, tree2);
		if(isSame) {
			System.out.println("Binary trees are Quasi-Isomorphic");
		} else {
			System.out.println("Binary trees are not Quasi-Isomorphic");
		}
    }
}

package org.learn.Client;

import org.learn.PrepareTree.Node;
import org.learn.Question.QuasiIsomorphicBinaryTree;

public class App 
{
	public static void main( String[] args )
    {		
		//level 0
		Node tree1 = Node.createNode(100); //A
		//level 1
		tree1.left = Node.createNode(20); //B
		tree1.right = Node.createNode(115);//C
		// left sub tree
		tree1.left.left = Node.createNode(170);//D
		tree1.left.left.left = Node.createNode(140);//G
		tree1.left.left.right = Node.createNode(139); //H

		// right subtree
		tree1.right.left = Node.createNode(30); //E
		tree1.right.right = Node.createNode(40);//F
		
		tree1.right.right.left = Node.createNode(40);//I	
		tree1.right.right.right = Node.createNode(40);//J	
		
		
		Node tree2 = Node.createNode(400); //A
		//level 1
		tree2.left = Node.createNode(100); //B
		tree2.right = Node.createNode(90);//C
		// left sub tree
		tree2.left.left = Node.createNode(25);//D
		tree2.left.left.left = Node.createNode(120);//G
		tree2.left.left.right = Node.createNode(200); //H

		// right subtree
		tree2.right.left = Node.createNode(30); //F
		tree2.right.right = Node.createNode(40); //E
		tree2.right.left.left = Node.createNode(40); //2
		tree2.right.left.right = Node.createNode(40); //2

		boolean isSame = QuasiIsomorphicBinaryTree.quasiIsomorphicBinaryTree(tree1, tree2);
		if(isSame) {
			System.out.println("Trees are Quasi-Isomorphic");
		} else {
			System.out.println("Trees are not Quasi-Isomorphic");
		}
    }
}

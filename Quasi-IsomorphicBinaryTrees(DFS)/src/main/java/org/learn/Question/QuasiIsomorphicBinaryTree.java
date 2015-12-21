
package org.learn.Question;

import org.learn.PrepareTree.Node;

public class QuasiIsomorphicBinaryTree {
	public static boolean quasiIsomorphicBinaryTree(Node tree1, Node tree2) {
		if(tree1 == null && tree2 == null) {
			return true;
		}
		if(tree1 == null || tree2 == null) {
			return false;
		}
		//Check identical case
		if(quasiIsomorphicBinaryTree(tree1.left,tree2.left) 
				&& quasiIsomorphicBinaryTree(tree1.right,tree2.right))
			return true;
		//Check mirror case
		if(quasiIsomorphicBinaryTree(tree1.left,tree2.right) 
				&& quasiIsomorphicBinaryTree(tree1.right,tree2.left))
			return true;
		
		return false;
	}
}

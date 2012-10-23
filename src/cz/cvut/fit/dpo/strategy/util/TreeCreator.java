package cz.cvut.fit.dpo.strategy.util;

import cz.cvut.fit.dpo.strategy.tree.BinaryTree;

public class TreeCreator<T extends Comparable<T>> {
	
	private BinaryTree<String> tree;

	public void createTree() {
		String[] data = { "F", "B", "A", "D", "C", "E", "G", "I", "H", };
		tree = new BinaryTree<String>();
		tree.insert(data);
	}

	public BinaryTree<String> getTree() {		
		return tree;
	}

}

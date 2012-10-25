package cz.cvut.fit.dpo.strategy;

import cz.cvut.fit.dpo.strategy.tree.BinaryTree;
import cz.cvut.fit.dpo.strategy.tree.Node;
import cz.cvut.fit.dpo.strategy.tree.NullNode;

public class DFSStrategy implements Strategy {
	
	private BinaryTree<String> tree;

	public DFSStrategy(BinaryTree<String> tree) {
		this.tree = tree;
	}

	@Override
	public void traverseTree() {
		dfs(tree.getRoot());
	}

	//metoda POSTORDER
	private void dfs(Node<String> node) {
		if (!(node instanceof NullNode<?>)) {
			if ((node.getLeft() == null) && (node.getRight() == null)) {
				System.out.println(node.getValue());
			}
			else {
					dfs(node.getLeft());		
					dfs(node.getRight());
				System.out.println(node.getValue());
			}
		}
	}
}
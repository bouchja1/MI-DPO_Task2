package cz.cvut.fit.dpo.strategy;

import java.util.LinkedList;

import cz.cvut.fit.dpo.strategy.tree.BinaryTree;
import cz.cvut.fit.dpo.strategy.tree.Node;
import cz.cvut.fit.dpo.strategy.tree.NullNode;

public class BFSStrategy implements Strategy {

	private BinaryTree<String> tree;
	LinkedList<Node<String>> fifo = new LinkedList<Node<String>>();

	public BFSStrategy(BinaryTree<String> tree) {
		this.tree = tree;
	}

	@Override
	public void traverseTree() {
		bfs(tree.getRoot());
	}

	//prohledavani do sirky
	private void bfs(Node<String> firstNode) {
		fifo.add(firstNode);
		while (!fifo.isEmpty()) {
			Node<String> node = fifo.removeFirst();
			if (!(node instanceof NullNode<?>)) {
				System.out.println(node.toString());
				fifo.add(node.getLeft());
				fifo.add(node.getRight());
			}
		}
	}

}
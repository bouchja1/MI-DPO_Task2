package cz.cvut.fit.dpo.strategydpo;

import cz.cvut.fit.dpo.strategy.BFSStrategy;
import cz.cvut.fit.dpo.strategy.DFSStrategy;
import cz.cvut.fit.dpo.strategy.Strategy;
import cz.cvut.fit.dpo.strategy.tree.BinaryTree;
import cz.cvut.fit.dpo.strategy.util.TreeCreator;

//http://cs.scribd.com/doc/88502627/87/Metody-prochazeni-binarnim-stromem
//http://www.javacodegeeks.com/2012/04/strategy-pattern.html
public class StrategyRunner {
	public static void main(String[] args) {
			TreeCreator<String> tc = new TreeCreator<String>();
			tc.createTree();

			if (args.length == 1) {
				traverse(tc.getTree(), args[0]);
			} else {
				System.out.println("Je treba zadat prave jeden argument [bfs|dfs]");
			}
	}

	private static void traverse(BinaryTree<String> tree, String strategy) {
		Strategy strategyResult = null;
		if (strategy.equals("dfs")) {
			strategyResult = new DFSStrategy(tree);			
		} else if (strategy.equals("bfs")) {
			strategyResult = new BFSStrategy(tree);
		} else {
			throw new UnsupportedOperationException(String.format(
					"Strategy [%s] is not supported. Supported is [bfs|dfs]",
					strategy));
		}
		strategyResult.traverseTree();
	}
}
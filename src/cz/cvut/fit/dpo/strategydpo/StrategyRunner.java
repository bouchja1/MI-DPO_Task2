package cz.cvut.fit.dpo.strategydpo;

import cz.cvut.fit.dpo.strategy.BFSStrategy;
import cz.cvut.fit.dpo.strategy.DFSStrategy;
import cz.cvut.fit.dpo.strategy.Strategy;
import cz.cvut.fit.dpo.strategy.tree.BinaryTree;
import cz.cvut.fit.dpo.strategy.util.TreeCreator;

public class StrategyRunner {
	public static void main(String[] args) {
			TreeCreator<String> tc = new TreeCreator<String>();
			tc.createTree();

			if (args.length == 2) {
				String toFind = args[0];
				find(tc.getTree(), toFind, args[1]);
			} else {
				System.out.println("Je treba zadat prave dva argumenty [hledany element] [bfs|dfs]");
			}
	}

	private static void find(BinaryTree<String> tree, String toFind, String strategy) {
		Strategy strategyResult = null;
		if (strategy.equals("dfs")) {
			strategyResult = new DFSStrategy(tree, toFind);
		} else if (strategy.equals("bfs")) {
			strategyResult = new BFSStrategy(tree, toFind);
		} else {
			throw new UnsupportedOperationException(String.format(
					"Strategy [%s] is not supported. Supported is [bfs|dfs]",
					strategy));
		}
		System.out.printf("Strategy [%s] result is [%s]%n", strategy,
				strategyResult);
	}
}
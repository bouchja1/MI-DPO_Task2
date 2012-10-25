package cz.cvut.fit.dpo.strategy.tree;

public interface Node<T extends Comparable<T>> {
	public T getValue();

	public void setValue(T value);

	public Node<T> getLeft();

	public void setLeft(Node<T> left);

	public Node<T> getRight();

	public void setRight(Node<T> right);

	public boolean isLeaf();

	public int compareTo(Object o);
}

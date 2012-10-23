package cz.cvut.fit.dpo.strategy.tree;

/**
 * @author bouc2162
 *
 * @param <T>
 */
public class Node<T extends Comparable<T>> implements Comparable {
	private T value;
	private Node<T> left;
	private Node<T> right;

	public Node(T value) {
		this(value, null, null);
	}

	public Node(T value, Node<T> left, Node<T> right) {
		this.setValue(value);
		this.left = left;
		this.right = right;
	}

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		if (value == null)
			throw new IllegalArgumentException("node value cannot be null");
		this.value = value;
	}

	public Node<T> getLeft() {
		return left;
	}

	public void setLeft(Node<T> left) {
		this.left = left;
	}

	public Node<T> getRight() {
		return right;
	}

	public void setRight(Node<T> right) {
		this.right = right;
	}

	public boolean isLeaf() {
		return ((this.left == null) && (this.right == null));
	}

	public int compareTo(Object o) {
		Node<T> other = (Node<T>) o;

		return this.getValue().compareTo(other.getValue());
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}

		Node node = (Node) o;

		if (!value.equals(node.value)) {
			return false;
		}

		return true;
	}

	@Override
	public int hashCode() {
		return value.hashCode();
	}

	@Override
	public String toString() {
		return value.toString();
	}
}
